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
def PythonBad(testcases: list[str], containsArray:bool, array_varnames, array_declarations: list[str]):
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
            "functionCall": functionCall.strip(),
            "expected": expected.strip(),
        })
        if containsArray: # need to rewrite arrays from '[...]' to '{...}'
            split_cases[-1]['functionCall'] = split_cases[-1]['functionCall'].replace('[', '{ ').replace(']', ' }')
        if (len(split_cases[-1]['arrays']) > 0): split_cases[-1]['arrays'][-1] += '\n' # putting newline at end of arrays
        
        # need to split exactly once to prevent second var from overwriting first in case they are identical arrays!!!
        for (C, (arr, var_name)) in enumerate(split_cases[-1]['array_remap'].items()):
            (before, after) = split_cases[-1]['functionCall'].split(arr.removesuffix(f'#{C}'), maxsplit=1)
            split_cases[-1]['functionCall'] = before + var_name + after
        
    return split_cases


def ParseTestcases(testcases: list[str], functionDef: dict) -> dict:
    #TODO: refactor this stuff into ParseFunctionDefinition
    array_declarations = []
    array_varnames = []
    containsArray = False
    returnsArray = functionDef["returnType"].endswith("[]")
    returnsList = functionDef["returnType"].startswith("List")
    
    for arg in functionDef["args"]:  # "type": , "identifier"
        isArray = arg["type"].endswith('[]')
        if isArray:
            containsArray = True
            array_varnames.append(arg["identifier"])
            array_declarations.append(arg["type"] + " " + arg["identifier"])
        # if isArray: arg["identifier"] += str(testCaseNum)
    
    split_cases = PythonBad(testcases, containsArray, array_varnames, array_declarations)
    expectedResults = f"{functionDef['returnType']}[] expectedResults = "+"{ "
    
    for case in split_cases:
        if returnsArray: # need to rewrite arrays from '[...]' to '{...}'
            case["expected"] = case["expected"].replace('[', '{').replace(']', '}')
        elif returnsList: # can construct a list with 'Arrays.asList'
            case["expected"] = case["expected"].replace('[', "Arrays.asList(").replace(']', ')')
        expectedResults += case["expected"] + ", "
    expectedResults += "};\n"
    
    return { 
        "returnsList": returnsList,
        "returnsArray": returnsArray,
        "containsArray": containsArray,
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


def ReformatPrompt(raw_prompt: str) -> str:
    # don't split on the phrase 'e.g.' (and don't split on preceeding comma if there is one)
    raw_prompt = raw_prompt.replace(", e.g.", ",DONT_SPLIT_HEREe.g.").replace("e.g. ", "e.g.DONT_SPLIT_HERE")
    # splitting the prompt over multiple lines, at sentence ends, commas and colons
    promptlines = raw_prompt.replace(". ", ". \n").replace(", ", ", \n").replace(": ", ": \n").splitlines()
    
    # TODO: split on commas as well, but only when the line has reached a certain length
    # line_lengths = { line_num: len(line) for line_num, line in enumerate(promptlines) }
    # long_lines = { 
    #     i: promptlines[i].replace(", ", ", \n").splitlines()
    #     for i,l in line_lengths.items() if (l > 100) 
    # }
    # for line in long_lines.values(): print([len(l) for l in line])
    
    prompt = ""
    current_length = 0 
    for line in promptlines:
        #nextline = line.replace("DONT_SPLIT_HERE", " ")  # putting the space back
        nextline = line
        if ((current_length > 35) and (len(nextline)) > 70): prompt += '\n'; current_length = 0
        prompt += nextline
        current_length += len(nextline)
        if current_length > 55: prompt += '\n'; current_length = 0
    
    return prompt.replace("DONT_SPLIT_HERE", " ").removesuffix('\n')


def WriteTestcaseFile(packageName:str, data: dict):
    title = Capitalize(data["title"])
    testCasesClassname = f"_{title}"
    packageName = packageName.replace('-','')  # eclipse doesn't allow names to include dashes
    testcase_packagedir = sub_savedirs[1] / packageName / "Testcases"
    if not testcase_packagedir.exists(): testcase_packagedir.mkdir(parents=True)
    testcase_filepath = testcase_packagedir / f'{testCasesClassname}.java'  # leading underscore prevents class name conflicts (they actually do occur across files)
    print(f"    generating {packageName}.{title} Testcase class...")
    
    functionDefinition = ParseFunctionDefinition(data["provided_code"])
    testCases = ParseTestcases(data["testcases"], functionDefinition)
    
    # writing 'printArray' function if necessary
    returnType = functionDefinition["returnType"]
    doesReturnArray = returnType.endswith('[]')
    doesReturnList = testCases["returnsList"]
    printArray_FunctionDefinition = f"    public static String printArray({returnType} array)"+"""
    {
        String result = "[";
        for ("""+returnType.removesuffix('[]')+""" a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }\n\n"""
    
    with open(testcase_filepath, "w", encoding="utf-8") as file:
        file.write(f"package {packageName}.Testcases;\n")
        file.write(f"import {packageName}.{title};\n") # importing the real class to run the user-code for validation
        if doesReturnList: file.write("import java.util.List;\n")
        if doesReturnArray or doesReturnList: file.write("import java.util.Arrays;\n")  # required to properly compare arrays, and construct Lists
        file.write('\n')
        
        file.write(f"public class {testCasesClassname}\n"+"{\n")
        
        # map for testcase number -> string of function call
        testcase_map: dict = { i: testcase for i, testcase in enumerate(data["testcases"]) }
        file.write("    static String[] testcaseStrings = {\n")
        for (k, v) in testcase_map.items():
            v = v.split(" \u2192 ", maxsplit=1)[0] # discarding everything to the right of the function call
            file.write(f"        \"{v.replace('"', '\\"')}\",\n") # escaping quotes
        file.write("    };\n\n") # closing testcaseStrings()
        
        file.write(f"    static {testCases['expectedResults']}\n")
        
        if doesReturnArray: file.write(printArray_FunctionDefinition)
        
        needToSupressNewline = False
        
        # Validation function
        file.write("    public static void Validate(boolean printSuccess)\n    {\n")
        # writing the array declarations (can't inline into function calls)
        for array in testCases['arrays']:
            if(len(array) == 0): needToSupressNewline=True; continue # there is always one entry per testcase, but they're empty if no arary parameters exist
            thestring = f"        "
            for substring in array: thestring += substring
            file.write(thestring)
        if not needToSupressNewline: file.write('\n')
        
        # storing results of function calls
        file.write(f"        {functionDefinition['returnType']}[] resultsArray = "+"{\n")
        for functionCall in testCases["functionCalls"]:
            file.write(f"            {title}.{functionCall},\n") # calling the real class here 
        file.write("        };\n") # closing resultsArray
        
        expectedResultStr = f"expectedResults[i]"
        resultsArrayStr = "resultsArray[i]"
        comparisonStr = f"resultsArray[i] != expectedResults[i]"
        # arrays and lists cannot be directly compared in java (it does a pointer comparison), need to use '.equals()' instead
        
        if doesReturnArray: 
            expectedResultStr = f"printArray({expectedResultStr})"
            resultsArrayStr = f"printArray({resultsArrayStr})"
            comparisonStr = f"!Arrays.equals(resultsArray[i], expectedResults[i])"
        
        if doesReturnList:
            comparisonStr = f"!resultsArray[i].equals(expectedResults[i])"
        
        # running testcases, comparing results
        # unicode U+2714 is "heavy check-mark": ✔
        file.write(f'''
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        '''+'{'+f'''
            if ({comparisonStr})
            '''+'{'+f'''
                allTestsPassed = false;
                System.out.println("\\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+{resultsArrayStr});
                System.out.println("    expected: "+{expectedResultStr});
                System.out.println("\\n");
            '''+'''} else if (printSuccess) { 
                System.out.println("[\u2714] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\\n \u2714\u2714\u2714  ~ All tests passed. ~  \u2714\u2714\u2714");
        System.out.println();
        return;\n''')
        
        file.write("    }\n") # closing Validate function
        file.write("}\n") # closing Testcase class
    
    print(f"\tdone writing: {testcase_filepath.relative_to(cwd)}\n")
    return testCases

 
def TestcaseAsciiArt(testcases: list) -> str:
    # align by arrow, find longest testcase, then build the frame
    segmented = [line.partition('\u2192') for line in testcases]
    segmentLengths = [[len(s[0]), len(s[2])] for s in segmented]
    longestLengths = [max(x) for x in zip(*segmentLengths)]
    total_width = longestLengths[0] + longestLengths[1] + 3 # accounting for the arrow
    title_padding = " "*int((total_width-len("Testcases"))/2)
    
    # title_padding is off by one if the length is even
    maybe_space = ""
    if ((total_width%2) == 0): maybe_space = " "
    
    art = "    /*"
    art += "_" * total_width
    art += f"\n    |{title_padding}Testcases{maybe_space}{title_padding}|\n    "
    art += "_" * (total_width+2)
    art += "\n    "
    for segments in segmented:
        testcase, arrow, result = segments
        # padding with spaces to align arrow and end of box
        testcase += " "*(longestLengths[0]-len(testcase))
        result += " "*(longestLengths[1]-len(result))
        art += f"| {testcase}{arrow}{result} |\n    "
    art += "_" * total_width
    art += "*/\n\n"
    return art


def WriteJavaFile(packageName:str, data: dict):
    title = Capitalize(data["title"])
    packageName = packageName.replace('-','')  # eclipse doesn't allow names to include dashes
    packagedir = sub_savedirs[1] / packageName
    if not packagedir.exists(): packagedir.mkdir()
    filepath = packagedir / f'{title}.java'
    print(f"    generating {packageName}.{filepath.stem}...")
    
    testcases = WriteTestcaseFile(packageName, data)
    returnsList = testcases["returnsList"]
    
    prompt = ReformatPrompt(data["prompt"]).replace('\n', '\n    ') # indent each line
    testcase_comment = TestcaseAsciiArt(data["testcases"])
    
    # adding static to declaration and cleaning up braces/whitespace
    functionDeclaration = data['provided_code'].rstrip('}{\n ')
    if not functionDeclaration.startswith("public"): functionDeclaration = "public "+functionDeclaration
    functionDeclaration = functionDeclaration.replace("public ", "public static ")
    functionDeclaration += "\n    {\n        \n    }\n"
    
    with open(filepath, "w", encoding="utf-8") as file:
        file.write(f"// {data["url"]}\n") # link to codingbat page
        file.write(f"package {packageName};\n")
        file.write(f"import {packageName}.Testcases._{title};\n\n")
        if returnsList: 
            file.write("import java.util.List;\n")
            file.write("import java.util.Arrays;\n") # for 'Arrays.asList' 
            file.write("import java.util.ArrayList;\n\n") # not strictly necessary
        
        # The class name must match the filename (java)
        file.write(f"public class {title}"+"\n{\n")
        
        # prompt and testcase comments
        file.write(f"    /* {prompt} */\n\n")
        file.write(testcase_comment)
        
        # function declaration provided by codingbat and main function
        file.write(f"    {functionDeclaration}\n")
        file.write("    public static void main(String[] args) {\n")
        file.write(f"        _{title}.Validate(true);  // pass 'false' to print failed tests only.\n")
        file.write("    }\n") # closing main function
        file.write("}\n") # closing Main class
    
    print(f"\tdone writing: {filepath.relative_to(cwd)}\n")
    return


def GenerateSection(section_name: str):
    section_dir = sub_savedirs[0] / section_name
    section_files = section_dir.glob("./*.json")
    
    print(f"Parsing files under {section_dir}...")
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
        for failure in failures: print(f"Failed to generate java file for: {failure}")
    else: print(f"Generated all files for {section_dir}")
    return


def GenerateAll(only_missing=True):
    jsondumps, java_subs = sub_savedirs
    section_dirs = [subdir.name for subdir in jsondumps.glob("./*/")]
    alreadyExist = []
    if only_missing: alreadyExist = [d.name for d in java_subs.glob("./*/")]
    for subdir in section_dirs:
        if (subdir in alreadyExist): print(f"skipping {subdir}; already exists."); continue
        GenerateSection(subdir)
    return


if __name__ == "__main__":
    GenerateAll()
    # GenerateSection("Array-1")
    # GenerateSection("String-1")
    
    # testdata = LoadFile("String-1", "makeOutWord")
    # testdata = LoadFile("AP-1", "wordsWithoutList")
    # WriteJavaFile("testpackage", testdata)
    
    # problems = ["fizzArray", "fizzArray2"]
    # for problemfile in problems:
    #     testdata = LoadFile("Array-2", problemfile)
    #     WriteJavaFile("testpackage", testdata)
    
    # functionDefinition = ParseFunctionDefinition(testdata['provided_code'])
    # testCases = ParseTestcases(testdata["testcases"], functionDefinition)
