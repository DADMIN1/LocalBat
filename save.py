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

