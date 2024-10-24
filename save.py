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
    sitemap_file = cwd / 'sitemap.json'
    with open(sitemap_file, 'w', encoding="utf-8") as file:
        json.dump(sitemap_data, file, indent=2)
        print("wrote sitemap file")
    return


def LoadSitemapFile() -> dict | None:
    print("loading sitemap")
    sitemap_file = cwd / 'sitemap.json'
    sitemap_dict = None
    if sitemap_file.exists():
        with open(sitemap_file, "r", encoding="utf-8") as file:
            sitemap_dict = json.load(file)
    return sitemap_dict

