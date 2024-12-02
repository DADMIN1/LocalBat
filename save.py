import pathlib
import json


cwd = pathlib.Path.cwd()
savedir = cwd / "savedir"
if not savedir.exists(): savedir.mkdir()

sub_savedirs = [savedir / subdir for subdir in ("jsonDumps", "javaFiles")]
for subdir in sub_savedirs: 
    if not subdir.exists(): subdir.mkdir()

# builtin 'str.capitalize' forces all other letters to lowercase
def Capitalize(text: str): return text[0].upper() + text[1:]

def SaveFile(data, section_name, problem_name):
    section_dir = sub_savedirs[0] / section_name
    if not section_dir.exists(): section_dir.mkdir()
    filepath = section_dir / str(problem_name + ".json")
    print(f"saving to {filepath.name}")
    with open(filepath, "w") as file:
        json.dump(data, file, indent=2)
    return


# re-load the raw json
def LoadFile(section_name, problem_name) -> dict | None:
    section_dir = sub_savedirs[0] / section_name
    filepath = section_dir / str(problem_name + ".json")
    jsonData = None
    if not filepath.exists(): return jsonData
    print(f"loading {filepath}")
    with open(filepath, "r", encoding="utf-8") as file:
        jsonData = json.load(file)
    return jsonData


def WriteSitemapFile(sitemap_data: dict):
    sitemap_file = savedir / 'sitemap.json'
    with open(sitemap_file, 'w', encoding="utf-8") as file:
        json.dump(sitemap_data, file, indent=2)
        print("wrote sitemap file")
    return


def LoadSitemapFile() -> dict | None:
    print("loading sitemap")
    sitemap_file = savedir / 'sitemap.json'
    sitemap_dict = None
    if sitemap_file.exists():
        with open(sitemap_file, "r", encoding="utf-8") as file:
            sitemap_dict = json.load(file)
    return sitemap_dict


def GetProblemLists() -> dict:
    sitemap = LoadSitemapFile()
    if not sitemap:
      print("[WARNING] sitemap-file not found. Could not construct problem lists.")
      return {}
    return { 
      section_name: [*section_data['pages'].keys()] 
      for (section_name, section_data) in sitemap.items() 
    }


# returns dict of { section-name: dict[problem_name, difficulty] }; sorted by difficulty
def ConstructDifficultyTable(saveResult:bool = False) -> dict[str, dict[str, float]]:
    section_manifests = GetProblemLists()
    difficulty_table = {
      section_name: { 
        k:v for (k,v) in sorted({
          problem_name: float(LoadFile(section_name, problem_name)["difficulty"])
          for problem_name in problem_list
        }.items(), key=lambda item:item[1]) # sorting by difficulty-value
      } for (section_name, problem_list) in section_manifests.items()
    }
    
    if saveResult:
      save_path = savedir / "difficulty_table.json"
      with open(save_path, 'w', encoding="utf-8") as save_file:
        json.dump(difficulty_table, save_file, indent=2)
        print(f"wrote '{save_path.relative_to(cwd)}'")
    
    return difficulty_table


def ConstructSectionManifests():
    problem_lists = { 
        k[:-2]+k[-1] : [Capitalize(n) for n in v] # removing the dashes from section names, capitalizing file-names 
        for k,v in GetProblemLists().items() 
    }
    problem_counts = { k : len(v) for k,v in problem_lists.items() }
    validation_calls = { 
        section : {
            name : f'{section}.Testcases._{name}.suppressOutput = true; return {section}.Testcases._{name}.Validate();'
            for name in sorted(namelist, key=lambda N: len(N)) # sorting problems by name-length
        } for section, namelist in sorted(problem_lists.items(), key=lambda T: len(T[0])) # sorting sections by section-name length
    }
    qualname_map = {
        f'{section}.{problem_name}' : val
        for (section, problems) in validation_calls.items()
        for (problem_name, val) in problems.items()
    }
    return {
        'problem_lists' : problem_lists,
        'problem_counts' : problem_counts,
        'validation_calls' : qualname_map,
    }



ANSI_RESET = r"\u001B[0m"
# empty sequences ('[m'), zero ('[0m'), and just a semicolon ('[;m') are all equivalent.


# Prepends ANSI escape-sequences, then (optionally) appends a reset
def AnsiEscape(text:str, *args, reset=True):
    """ 
    :param str text:
    :param str args: colors and/or formatting.
        Background-color is specified by prepending 'BG_' to the color.
        Passing 'REAPPLY' will preserve all following args in the sequence (re-applied after the reset)
    :param bool reset: append ANSI_RESET after text. (default=True).
        Pass 'RESET' (in args) to insert mid-sequence instead.
    """
    # FG/BG colors are handled seperately; sequences specifying only one will preserve the other.
    # in the same way, sequences specifying only colors will preserve format-flags, and vice-versa.
    # Unfortunately, 'RESET'/'ANSI_RESET' will clear both, and 'REAPPLY' cannot overcome this limitation.
    # Note that preserving colors while resetting format-flags is impossible.
    
    sequence = r"\u001b["
    carryflag = False
    carried_args = []
    
    for arg in args:
      aarg = arg.upper()
      # foreground/background
      lead_digit = "9"  # '9' is high-contrast FG range. normal FG codes are in range '3'
      if aarg.startswith("BG_"):
          aarg = aarg.removeprefix("BG_")
          lead_digit = "4"
      
      subseq = ""
      match(aarg):
        case "WHITE":   subseq = f"{lead_digit}7"
        case "BLACK":   subseq = f"{lead_digit}0"
        case "RED":     subseq = f"{lead_digit}1"
        case "GREEN":   subseq = f"{lead_digit}2"
        case "YELLOW":  subseq = f"{lead_digit}3"
        case "BLUE":    subseq = f"{lead_digit}4"
        case "MAGENTA": subseq = f"{lead_digit}5"
        case "CYAN":    subseq = f"{lead_digit}6"
        
        # format codes
        case "BOLD":      subseq = "1"
        case "ITALIC":    subseq = "3"
        case "UNDERLINE": subseq = "4"
        case "REVERSED":  subseq = "7" # swaps application of FG/BG (values are unchanged). Actual behavior is somewhat inconsistent;
          # Terminals may override either of the FG/BG colors if it decides there isn't enough contrast, but it's not symmetric.
          # Because of this, some color-combinations are only possible by swapping FG/BG and then reversing.
          # for example, RED/BG_BLACK is reverse-only, but BLACK/BG_RED is impossible; FG is set to white instead.
          # whereas MAGENTA/BG_BLACK can be set directly. 
          # 'BOLD' may influence this behavior?
        
        # special args
        case "RESET":   subseq = "0"
        case "REAPPLY": carryflag = True; continue;  # marks all following arguments for reapplication after reset
        case _: assert False, f"unrecognized arg: {arg}"
      
      sequence += f'{subseq};'
      if carryflag: carried_args.append(subseq);
    
    # 'm' ends the escape sequence
    sequence = f"{sequence.removesuffix(';')}m{text}"
    if reset:
      sequence += ANSI_RESET
      if carryflag:
        sequence = sequence.removesuffix('m')
        for arg in carried_args: sequence += f";{arg}";
        sequence += 'm'
    
    return sequence
