import json
import pathlib


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
def LoadFile(section_name, problem_name) -> dict:
    section_dir = sub_savedirs[0] / section_name
    filepath = section_dir / str(problem_name + ".json")
    print(f"loading {filepath}")
    jsonData = None
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


def IsolateArrayParameters(functionCall: str):
    found_arrays = []
    current_string = functionCall.partition('[')[2]
    while(len(current_string) > 0):
        (before, sep, after) = current_string.partition(']') # find end of current array
        if sep == ']': found_arrays.append('{ ' + before + ' }') # ensuring it's not empty (not found)
        current_string = after.partition('[')[2]
    return found_arrays


# nested dictionary+list comprehensions are impossible. (skill issue)
def PythonBad(testcases: list[str], array_varnames, array_declarations: list[str]):
    split_cases = []
    for (testCaseNum, testcase) in enumerate(testcases):
        # for some reason '→' does not compare true here, you need to use escape code
        functionCall, expected = testcase.split("\u2192", maxsplit=1)
        arrays = IsolateArrayParameters(functionCall)
        split_cases.append({
            # creating declarations for each array parameter
            "arrays": [ x+str(testCaseNum)+" = "+y+"; " for (x, y) in zip(array_declarations, arrays) ],
            # need to append an index to prevent identical arrays from clobbering each other
            "array_remap": { a+f"#{I}":b+str(testCaseNum) for (I, (a, b)) in enumerate(zip(arrays, array_varnames))},
            "functionCall": functionCall.strip().replace('[', '{ ').replace(']', ' }'), # need to rewrite arrays from '[...]' to '{...}'
            "expected": expected.strip(),
        })
        if (len(split_cases[-1]['arrays']) > 0): split_cases[-1]['arrays'][-1] += '\n' # putting newline at end of arrays
        
        # need to split exactly once to prevent second var from overwriting first in case they are identical arrays!!!
        for (C, (arr, var_name)) in enumerate(split_cases[-1]['array_remap'].items()):
            (before, after) = split_cases[-1]['functionCall'].split(arr.removesuffix(f'#{C}'), maxsplit=1)
            split_cases[-1]['functionCall'] = before + var_name + after
        
    return split_cases


def ParseTestcases(testcases: list[str], functionDef: dict) -> dict:
    array_declarations = []
    array_varnames = []
    for arg in functionDef["args"]:  # "type": , "identifier"
        isArray = arg["type"].endswith('[]')
        array_varnames.append(arg["identifier"])
        if isArray: array_declarations.append(arg["type"] + " " + arg["identifier"])
        # if isArray: arg["identifier"] += str(testCaseNum)
    
    split_cases = PythonBad(testcases, array_varnames, array_declarations)
    expectedResults = f"{functionDef['returnType']}[] expectedResults = "+"{ "
    
    for case in split_cases:
        # need to rewrite arrays from '[...]' to '{...}'
        expectedResults += case["expected"].replace('[', '{').replace(']', '}') + ", "
    expectedResults += "};\n"
    
    return { 
        "arrays": [case['arrays'] for case in split_cases], 
        "functionCalls": [case["functionCall"] for case in split_cases], 
        "expectedResults": expectedResults
    }


# need to get parameter types before writing testcase declarations
def ParseFunctionDefinition(code: str) -> dict:
    returnType, arguments = code.split('(', maxsplit=1)
    returnType, functionName = returnType.removeprefix("public ").strip().split()
    arguments = arguments.split(')', maxsplit=1)[0].strip()
    args_list = [arg.strip() for arg in arguments.split(',')]
    
    # need to early-out if no args, otherwise parsedArgs comprehension crashes
    if args_list[0] == '': # rather than an empty array, you end up with only an empty quote instead
        return { "name": functionName, "returnType": returnType, "args": [] }
    
    parsedArgs = [
        {
            "type": argpair.split()[0],
            "identifier": argpair.split()[1],
        } for argpair in args_list
    ]
    
    return { "name": functionName, "returnType": returnType, "args": parsedArgs }


def WriteJavaFile(packageName:str, data: dict):
    title = Capitalize(data["title"])
    packageName = packageName.replace('-','')  # eclipse doesn't allow names to include dashes
    packagedir = sub_savedirs[1] / packageName
    if not packagedir.exists(): packagedir.mkdir()
    filepath = packagedir / f'{title}.java'
    
    # print('\n'+title)
    # print(data)
    
    functionDefinition = ParseFunctionDefinition(data["provided_code"])
    testCases = ParseTestcases(data["testcases"], functionDefinition)
    
    # splitting the prompt over multiple lines
    promptlines = data["prompt"].replace(". ", ".\n")
    # adding static to declaration and cleaning up braces/whitespace
    functionDeclaration = data['provided_code'].rstrip('}{\n ')
    functionDeclaration = functionDeclaration.replace("public ", "public static ")
    functionDeclaration += "\n    {\n        \n    }\n"
    
    with open(filepath, "w", encoding="utf-8") as file:
        file.write(f"package {packageName};\n\n")
        file.write("import java.util.Map;\n") # for looking-up declarations of failed function calls
        file.write("import java.util.HashMap;\n\n") # also required for instantiation
        file.write(f"// {data["url"]}\n\n")
        file.write(f"/* {promptlines} */\n\n")
        
        # testcases
        testCasesClassname = f"TestCases_{title}"
        file.write(f"class {testCasesClassname}\n"+"{\n")
        
        # writing testcases as comments and building map
        for testcase in data["testcases"]:
            file.write(f"    // {testcase}\n")
        
        # map for testcase number -> string of function call
        testcase_map: dict = { i: testcase for i, testcase in enumerate(data["testcases"]) }
        file.write("\n")
        file.write("    static Map<Integer, String> testcaseMap = new HashMap<>();\n")
        file.write("    static void initTestcaseMap()\n    {\n")
        for (k, v) in testcase_map.items():
            file.write(f"        testcaseMap.put({k}, \"{v.replace('"', '\\"')}\");\n") # escaping quotes
        file.write("    }\n\n") # closing initTestcaseMap()
        
        file.write(f"    static {testCases['expectedResults']}")
        file.write("}\n\n")
        
        # The class name should match the filename instead of being 'Main'
        file.write(f"public class {title}"+"\n{\n")
        file.write(f"    {functionDeclaration}\n\n")
        
        # writing 'printArray' function if necessary
        returnType = functionDefinition["returnType"]
        doesReturnArray = returnType.endswith('[]')
        if doesReturnArray:
            file.write(f"    public static String printArray({returnType} array)")
            file.write(
    """
    {
        String result = "[";
        for ("""+returnType.removesuffix('[]')+""" a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }\n\n""")
            
        file.write("    public static void main(String[] args)\n    {\n")
        
        # writing the array declarations (required for function calls in main)
        for array in testCases['arrays']:
            thestring = "        "
            for substring in array: thestring += substring
            file.write(thestring)
        file.write('\n')
        
        # storing results of function calls
        file.write(f"        {functionDefinition['returnType']}[] resultsArray = "+"{\n")
        for functionCall in testCases["functionCalls"]:
            file.write(f"            {functionCall},\n")
        file.write("        };\n\n") # closing resultsArray
        
        expectedResultStr = f"{testCasesClassname}.expectedResults[i]"
        resultsArrayStr = "resultsArray[i]"
        if doesReturnArray: 
            expectedResultStr = f"printArray({expectedResultStr})"
            resultsArrayStr = f"printArray({resultsArrayStr})"
        
        # running testcases, comparing results
        file.write(f'''
        {testCasesClassname}.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        '''+'{'+f'''
            if (resultsArray[i] != {testCasesClassname}.expectedResults[i])
            '''+'{'+f'''
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println({testCasesClassname}.testcaseMap.get(i));
                System.out.println("    expected: "+{expectedResultStr});
                System.out.println("      result: "+{resultsArrayStr});
                System.out.println("\\n");
            '''+'''}
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();\n''')
        
        file.write("    }\n") # closing main function
        file.write("}\n") # closing Main class
    
    print(f"\tdone writing {filepath.name}")
    return


def ConvertSection(section_name: str):
    section_dir = sub_savedirs[0] / section_name
    section_files = section_dir.glob("./*.json")
    
    print(f"Converting files under {section_dir}...")
    failures = []
    for filename in section_files:
        # print(f"\t{filename}")
        try:
            with open(filename, 'r') as file:
                jsonData = json.load(file)
                WriteJavaFile(section_name, jsonData)
        except Exception as E:
            print(f"exception: {E}")
            failures.append(filename)
    if len(failures) > 0:
        print(f"Failed to convert: {failures}")
    else: print(f"Converted all files in {section_dir}")
    return


def ConvertAll(only_missing=True):
    jsondumps, java_subs = sub_savedirs
    section_dirs = [dir.name for dir in jsondumps.glob("./*/")]
    alreadyExist = []
    if only_missing: alreadyExist = [d.name for d in java_subs.glob("./*/")]
    for dir in section_dirs:
        if (dir in alreadyExist): print(f"skipping {dir}; already exists."); continue
        ConvertSection(dir)
    return


# TODO: printing expected results doesn't work if it's an array


if __name__ == "__main__":
    # testdata = LoadFile("Array-1", "biggerTwo")
    # WriteJavaFile("testpackage", testdata)
    
    # problems = ["commonTwo", "scoreUp"]
    # for problemfile in problems:
    #     testdata = LoadFile("AP-1", problemfile)
    #     WriteJavaFile("testpackage", testdata)
    
    # functionDefinition = ParseFunctionDefinition(testdata['provided_code'])
    # testCases = ParseTestcases(testdata["testcases"], functionDefinition)
    
    # ConvertSection("AP-1")
    ConvertAll(False)
    
