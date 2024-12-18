from save import *


def IsolateArrayParameters(functionCall: str):
    found_arrays = []
    current_string = functionCall.partition('[')[2]
    while(len(current_string) > 0):
        (before, sep, after) = current_string.partition(']') # find end of current array
        if sep == ']': found_arrays.append('{' + before + '}') # ensuring it's not empty (not found)
        current_string = after.partition('[')[2]
    return found_arrays


# nested dictionary+list comprehensions are impossible. (skill issue)
def PythonBad(testcases: list[str], containsArray:bool, containsList:bool, containsMap:bool, array_varnames, array_declarations: list[str]):
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
            "functionCall_original": functionCall.strip(),
            "expected": expected.strip(),
        })
        
        # when rewriting parameters as List/Map 'constructor', they need to be wrapped with a call to allocate a 'new' object
        # because the objects returned by 'Arrays,asList' and 'Map.of' are both immutable; they will throw a runtime error,
        # if they are modified inside the function taking them as parameters. No warnings/errors given by compiler or IDE.
        if containsArray: # need to rewrite arrays from '[...]' to '{...}'
            split_cases[-1]['functionCall'] = split_cases[-1]['functionCall'].replace('[', '{').replace(']', '}')
        if containsList: # need to make ArrayList
            split_cases[-1]['functionCall'] = split_cases[-1]['functionCall'].replace('[', "new ArrayList<>(Arrays.asList(").replace(']', '))')
        if containsMap: # { key1: value1, key2: value2 }  ->  new HashMap<>(Map.of(key1, value1, key2, value2));
            split_cases[-1]['functionCall'] = split_cases[-1]['functionCall'].replace(':',',').replace('{', "new HashMap<>(Map.of(").replace('}', '))')
        if (len(split_cases[-1]['arrays']) > 0): split_cases[-1]['arrays'][-1] += '\n' # putting newline at end of arrays
        
        # need to split exactly once to prevent second var from overwriting first in case they are identical arrays!!!
        for (C, (arr, var_name)) in enumerate(split_cases[-1]['array_remap'].items()):
            (before, after) = split_cases[-1]['functionCall'].split(arr.removesuffix(f'#{C}'), maxsplit=1)
            split_cases[-1]['functionCall'] = before + var_name + after
            split_cases[-1]['functionCall_original'] = before + var_name + after
        
    return split_cases


def ParseTestcases(testcases: list[str], functionDef: dict) -> dict:
    #TODO: refactor this stuff into ParseFunctionDefinition
    array_declarations = []
    array_varnames = []
    containsArray = False
    containsList = False
    containsMap = False
    returnsArray = functionDef["returnType"].endswith("[]")
    returnsList = functionDef["returnType"].startswith("List")
    returnsMap = functionDef["returnType"].startswith("Map")
    
    # Declaring an array of Lists is illegal if the List-type is specialized (e.g. List<String>) 
    # the error message states 'cannot create array of of generic type "List<_>"'. but ironically,
    # using the generic 'List' type, without specialization, seems to be the only legal syntax. 
    expectedResultsReturnType = functionDef['returnType']
    if returnsList: expectedResultsReturnType = "List<?>" # '<?>' just suppresses a warning telling you to specify the List type
    elif returnsMap: expectedResultsReturnType = "Map<?,?>" # same gig for Maps
    
    for arg in functionDef["args"]:  # "type": , "identifier"
        isArray = arg["type"].endswith('[]')
        isList = arg["type"].startswith("List")
        isMap = arg["type"].startswith("Map")
        if isArray:
            containsArray = True
            array_varnames.append(arg["identifier"])
            array_declarations.append(arg["type"] + " " + arg["identifier"])
        # if isArray: arg["identifier"] += str(testCaseNum)
        elif isList: containsList = True
        elif isMap: containsMap = True
    
    split_cases = PythonBad(testcases, containsArray, containsList, containsMap, array_varnames, array_declarations)
    expectedResults = f"{expectedResultsReturnType}[] expectedResults = "+"{"
    newlineIndent = "\n        "
    
    for case in split_cases:
        expectedResults += newlineIndent
        if returnsArray: # need to rewrite arrays from '[...]' to '{...}'
            case["expected"] = case["expected"].replace('[', '{').replace(']', '}')
        elif returnsList: # can construct a list with 'Arrays.asList'
            case["expected"] = case["expected"].replace('[', "Arrays.asList(").replace(']', ')')
        elif returnsMap: # { key1: value1, key2: value2 }  ->  Map.of(key1, value1, key2, value2);
            case["expected"] = case["expected"].replace(':',',').replace('{', "Map.of(").replace('}', ')')
        expectedResults += case["expected"] + ","
    expectedResults += "\n    };\n"
    
    return { 
        "containsArray": containsArray,
        "containsList": containsList,
        "containsMap": containsMap,
        "returnsArray": returnsArray,
        "returnsList": returnsList,
        "returnsMap": returnsMap,
        "arrays": [case['arrays'] for case in split_cases], 
        "arrayVars" : { "varnames": array_varnames, "declarations": array_declarations, },
        "split_cases": split_cases,
        "functionCalls": [case["functionCall"] for case in split_cases], 
        "expectedResults": expectedResults
    }


# need to get parameter types before writing testcase declarations
def ParseFunctionDefinition(code: str) -> dict:
    returnType, arguments = code.split('(', maxsplit=1)
    returnType, functionName = returnType.removeprefix("public ").strip().rsplit(maxsplit=1)
    arguments, functionBody = arguments.rsplit(') {\n ', maxsplit=1)
    arguments = arguments.strip()
    functionBody = functionBody.strip().removesuffix('}').strip()
    
    hasMap = False
    MAPTYPES = []
    while 'Map<' in arguments:
        beforeMap, mapStart, remaining = arguments.partition('Map<')
        remainingSplit = remaining.partition('> ')
        mapType = mapStart + remainingSplit[0] + remainingSplit[1]
        MAPTYPES.append(mapType.strip())
        arguments = beforeMap + "MAPTYPE " + remainingSplit[2]
        hasMap = True
    
    args_list = [arg.strip() for arg in arguments.split(',')]
    
    # need to early-out if no args, otherwise parsedArgs comprehension crashes
    if args_list[0] == '': # rather than an empty array, you end up with only an empty quote instead
        return { "name": functionName, "returnType": returnType, "args": [], "hasMap": hasMap, "functionBody": functionBody }
    
    # I'm golfing lmao
    mapTypeRemap = { A:B for (A,B) in zip([a for a in args_list if a.startswith('MAPTYPE')], MAPTYPES) }
    parsedArgs = [
        {
            "type": mapTypeRemap[argpair] if argpair in mapTypeRemap else argType,
            "identifier": identifier,
        } for argpair in args_list
        for (argType, identifier) in (argpair.split(),)
    ]
    
    return { "name": functionName, "returnType": returnType, "args": parsedArgs, "hasMap": hasMap, "functionBody": functionBody }


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


def WriteTestcaseFile(packageName:str, pagedata: dict):
    title = Capitalize(pagedata["title"])
    testCasesClassname = f"_{title}"
    packageName = packageName.replace('-','')  # eclipse doesn't allow names to include dashes
    testcase_packagedir = sub_savedirs[1] / packageName / "Testcases"
    if not testcase_packagedir.exists(): testcase_packagedir.mkdir(parents=True)
    testcase_filepath = testcase_packagedir / f'{testCasesClassname}.java'  # leading underscore prevents class name conflicts (they actually do occur across files)
    print(f"    generating {packageName}.{title} Testcase class...")
    
    if pagedata["testcases_extended"]: pagedata["testcases"] = pagedata["testcases_extended"]
    functionDefinition = ParseFunctionDefinition(pagedata["provided_code"])
    testCases = ParseTestcases(pagedata["testcases"], functionDefinition)
    
    # writing 'printArray' function if necessary
    returnType = functionDefinition["returnType"]
    doesReturnArray = returnType.endswith('[]')
    doesReturnList = testCases["returnsList"]
    doesReturnMap = testCases["returnsMap"]
    needsMap = returnType.startswith('Map') or functionDefinition["hasMap"]
    
    resultArrayReturnType = returnType
    # Declaring an array of Lists is illegal if the List-type is specialized (e.g. List<String>)
    if doesReturnList: resultArrayReturnType = "List<?>" # '<?>' just suppresses a warning telling you to specify the List type
    elif doesReturnMap: resultArrayReturnType = "Map<?,?>"
    
    sig_parameters = ", ".join([f"{arg['type']} {arg['identifier']}" for arg in functionDefinition['args']])
    fcall_passthrough = f"{functionDefinition['name']}(" + ", ".join([f"{arg['identifier']}" for arg in functionDefinition['args']]) + ')'
    
    printArray_FunctionDefinition = f"    public static final String printArray({returnType} array)"+"""
    {
        String result = "[";
        for ("""+returnType.removesuffix('[]')+""" a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }\n\n"""
    
    # 'static' is required to define a nested class
    # containing class has full access to nested classes' fields, so 'private' specifier doesn't cause any problems. 
    testresult_classdef = "\n        ".join([
        "    static final class TestResult {",
        f"private {resultArrayReturnType} result;",
        "private RuntimeException caught = null;",
        f"TestResult({sig_parameters})"+' {',  
        "    try { result = "+f"{title}.{fcall_passthrough}"+"; }",  # calling the function from the real class here 
        "    catch (RuntimeException exception) { caught = exception; }",
        "}\n",
    ]) + "    }\n\n"
    
    with open(testcase_filepath, "w", encoding="utf-8") as file:
        file.write(f"package {packageName}.Testcases;\n")
        file.write(f"import {packageName}.{title};\n") # importing the real class to run the user-code for validation
        if needsMap: file.write("import java.util.Map;\n"); file.write("import java.util.HashMap;\n");
        if doesReturnList: file.write("import java.util.List;\n")
        if doesReturnArray or doesReturnList:
            file.write("import java.util.Arrays;\n")  # required to properly compare arrays, and construct Lists
            file.write("import java.util.ArrayList;\n")
        file.write('\n')
        
        file.write(f"public final class {testCasesClassname}\n"+"{\n")
        file.write("    public static boolean printSuccesses = true;\n")
        file.write("    public static boolean getStacktraces = false;\n")
        file.write("    public static boolean suppressOutput = false;\n")
        file.write('\n')
        
        file.write(testresult_classdef)
        
        # map for testcase number -> string of function call
        testcase_map: dict = { i: testcase for i, testcase in enumerate(pagedata["testcases"])}
        file.write("    static final String[] testcaseStrings = {\n")
        for (k, v) in testcase_map.items():
            v = v.split(" \u2192 ", maxsplit=1)[0] # discarding everything to the right of the function call
            vsplit = v.split('(', maxsplit=1)
            v = f"{AnsiEscape(vsplit[0], 'ITALIC', 'REAPPLY', 'BLACK')}({AnsiEscape(vsplit[1].removesuffix(')'), 'RESET', 'BOLD')}{AnsiEscape(')', 'BLACK', reset=False)}"
            file.write(f"        \"{v.replace('"', '\\"')}\",\n") # escaping quotes
        file.write("    };\n\n") # closing testcaseStrings()
        
        file.write(f"    static final {testCases['expectedResults']}\n")
        
        if doesReturnArray: file.write(printArray_FunctionDefinition)
        
        needToSupressNewline = False
        
        # Validation function
        file.write("    public static final boolean Validate()\n    {\n")
        # writing the array declarations (can't inline into function calls)
        for array in testCases['arrays']:
            if(len(array) == 0): needToSupressNewline=True; continue # there is always one entry per testcase, but they're empty if no arary parameters exist
            thestring = f"        "
            for substring in array: thestring += f"final {substring}"
            file.write(thestring)
        if not needToSupressNewline: file.write('\n')
        
        # storing results of function calls
        file.write(f"        final TestResult[] results = "+"{\n")
        for functionCall in testCases["functionCalls"]:
            file.write(f"            new TestResult{functionCall.lstrip(functionDefinition['name'])},\n") # calling function in 'TestResult' constructor 
        file.write("        };\n") # closing resultsArray
        
        expectedResultStr = f"expectedResults[i]"
        resultsArrayStr = "results[i].result"
        comparisonStr = f"results[i].result != expectedResults[i]"
        # arrays and lists cannot be directly compared in java (it does a pointer comparison), need to use '.equals()' instead
        
        if doesReturnArray: 
            expectedResultStr = f"printArray({expectedResultStr})"
            resultsArrayStr = f"printArray({resultsArrayStr})"
            comparisonStr = f"!Arrays.equals(results[i].result, expectedResults[i])"
        
        if doesReturnList or needsMap or (returnType == "String"):
            comparisonStr = f"!results[i].result.equals(expectedResults[i])"
        
        # running testcases, comparing results
        # unicode U+2713 is "check-mark": ✓
        # unicode U+2714 is "heavy check-mark": ✔
        maybe_newline = "if(prevTestPassed) { System.out.println(); prevTestPassed = false; }"
        file.write(f'''
        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        '''+'{'+f'''
            if (results[i].caught != null) '''+'{'+f'''
                allTestsPassed = false;
                if(suppressOutput) continue;
                {maybe_newline}
                System.out.print("{AnsiEscape('[!]', 'RED', 'BOLD')} {AnsiEscape('#', 'BLUE', 'UNDERLINE', reset=False)}"+(i+1)+"{AnsiEscape(' - ', 'RESET', 'BLACK')}");
                System.out.println(testcaseStrings[i]+" - {AnsiEscape('Failed!', 'ITALIC', 'REAPPLY', 'RED', 'BOLD')} {AnsiEscape('[EXCEPTION]', 'BG_BLACK', 'REVERSED')}");
                System.out.println("{AnsiEscape('    ', 'RED', 'BG_BLACK', 'BOLD', reset=False)}"+results[i].caught.getClass().getName());
                System.out.println("{AnsiEscape('    ', 'RESET', 'YELLOW', 'BG_BLACK', reset=False)}"+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("{AnsiEscape('    ', 'BLACK', 'ITALIC', reset=False)}");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("{AnsiEscape('', 'RESET')}"); continue;
            '''+'}'+f'''
            if ({comparisonStr}) '''+'{'+f'''
                allTestsPassed = false;
                if(suppressOutput) continue;
                {maybe_newline}
                System.out.print("{AnsiEscape('[X]', 'RED', 'BOLD')} {AnsiEscape('#', 'BLUE', 'UNDERLINE', reset=False)}"+(i+1)+"{AnsiEscape(' - ', 'RESET', 'BLACK')}");
                System.out.println(testcaseStrings[i]+" - {AnsiEscape('Failed!', 'RED', 'BOLD', 'ITALIC')}");
                System.out.println("    {AnsiEscape('received:', 'BLUE', 'ITALIC', 'UNDERLINE')} {AnsiEscape('', 'BOLD', reset=False)}"+{resultsArrayStr});
                System.out.println("    {AnsiEscape('expected:', 'CYAN', 'ITALIC', 'UNDERLINE')} {AnsiEscape('', 'BOLD', reset=False)}"+{expectedResultStr});
                System.out.println();
            '''+'''} else if (printSuccesses && !suppressOutput) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("'''+AnsiEscape("[\u2713] ", "GREEN", "BOLD") + AnsiEscape('#', 'BLUE', 'UNDERLINE', reset=False)+'"+(i+1)+"'+f"{AnsiEscape(' - ', 'RESET', 'BLACK')}"+'''"+testcaseStrings[i]);
            }
        }
        if (suppressOutput) return allTestsPassed;
        if (allTestsPassed) System.out.println("\\n '''+AnsiEscape("\u2713\u2713\u2713", "GREEN", "REAPPLY", "BOLD")+AnsiEscape("  ~  All tests passed  ~  ", "CYAN", "BG_BLACK")+AnsiEscape("\u2713\u2713\u2713", "GREEN", "BOLD")+'''");
        else System.out.println("\\n'''+AnsiEscape(' "+successCount+"', "GREEN", "REAPPLY", "BOLD", "BG_BLACK") + f' / {AnsiEscape("", "BLUE", reset=False)}"+results.length+"{AnsiEscape(" tests passed ", "BLACK")}"' + ''');
        return allTestsPassed;\n''')
        
        file.write("    }\n") # closing Validate function
        file.write("}\n") # closing Testcase class
    
    print(f"\tdone writing: {testcase_filepath.relative_to(cwd)}")
    return { 
        "testCases": testCases, 
        "returnType": returnType,
        "doesReturnArray": doesReturnArray,
        "doesReturnList": doesReturnList,
        "needsMap": needsMap, 
        "functionDef": functionDefinition,
    }


# alternatively, the title can be padded with underscores and the underline skipped to inline the title into the border 
# 'titlebox_padding' fills empty space on the title line ('Testcases'), titlebox_underline creates a border underneath if provided
# this function is officially the worst code I've ever written
def TestcaseAsciiArt(testcases:list, functionInfo:dict, titlebox_padding:str = ' ', titlebox_underline:str|None = '_') -> str:
    arrow = '\u2192'
    split_cases = [ testcase for testcase in functionInfo["testCases"]['split_cases'] ]
    for (case, testcaseStr) in zip(split_cases, testcases):
        functioncall = case["functionCall_original"].strip().removeprefix(f"{functionInfo["functionDef"]['name']}(").removesuffix(')')
        for arg in functionInfo["functionDef"]["args"]:
            if (('List' in arg['type']) or ('Map' in arg['type'])):
                if ('List' in arg['type']): termchar = ']';
                elif ('Map' in arg['type']): termchar = '}';
                (argVal, functioncall) = functioncall.split(termchar, maxsplit=1)
                argVal = argVal+termchar
                arg['value'] = argVal
                functioncall = functioncall.strip().removeprefix(',').strip()
            else:
                if ',' in functioncall:
                    (argVal, functioncall) = functioncall.split(',', maxsplit=1)
                else:
                    argVal = functioncall
                    functioncall = ""
                arg['value'] = argVal.strip()
                functioncall = functioncall.strip()
        
        assert (len(functioncall.strip()) == 0), f"remaining text in functioncall: {functioncall}"
        params = [arg['value'] for arg in functionInfo["functionDef"]["args"]]
        
        simple_remap = {
            pname: pval.rstrip('; \n') for (pname, pval) in 
            zip(case['array_remap'].values(), [arrstr.split(' = ')[1] for arrstr in case['arrays']])
        }
        # now that the parameters are properly divided, we can re-inline the substituted arrays/lists/maps
        restored_params = [
            simple_remap[param.strip()] 
            if param.strip() in simple_remap.keys() else param.strip()
            for param in params
        ]
        case["params"] = params
        case["simple_remap"] = simple_remap
        case["restored_params"] = restored_params
        if (functionInfo['needsMap'] or functionInfo['doesReturnList']):
            case["expected"] = testcaseStr.split(f' {arrow} ')[1].strip()
    
    column_info = [*functionInfo['functionDef']['args'], {'identifier': 'returns', 'type': functionInfo['functionDef']['returnType']}]
    column_strs = [[*case["restored_params"], case['expected']] for case in split_cases] 
    # asdf = [*zip(column_info, [*zip(*column_strs)])]
    columns = [
        {
            **cInfo, 
            "rows": cStrs,
            "longestRowSize": max(len(row) for row in cStrs), 
            "headerRowSize": len(cInfo['identifier']) + len(cInfo['type']) + 3, # +3 for parentheses and space around type
            "header_oneline": True,  # identifier and type are on same line
            "shortName": (len(cInfo['identifier']) < 3), # never split lines when name is only 1-2 chars
            # leave List/Map/Array left-justified; center otherwise
            "left-align": (('List' in cInfo['type']) or ('Map' in cInfo['type']) or (cInfo['type'].endswith('[]'))),
        } 
        for thing in [*zip(column_info, [*zip(*column_strs)])]
        for (cInfo, cStrs) in [thing]
    ]
    
    all_headers_oneline = True
    # every column needs 3 extra characters: two spaces and a '|'
    total_width = (len(columns)*3)-1
    for column in columns:
        if ((column["headerRowSize"] > column["longestRowSize"]) and not column["shortName"]):
            column["header_oneline"] = False  # we'll move the type to a new line
            type_length = len(column['type']) + 2
            column["headerRowSize"] -= (type_length+1)
            if type_length > column["headerRowSize"]:
                column["headerRowSize"] = type_length
        column["width"] = max(column["longestRowSize"], column["headerRowSize"])
        total_width += column["width"]
        padded_rows = [ 
            row+(" "*(column['width']-(len(row)+1)))
            for row in column['rows']
        ]
        column['rows'] = padded_rows
        #if not column["header_oneline"]: column['identifier'] += '\n'
        header_padding = " "*max(column["width"] - column["headerRowSize"], 0)
        if column["header_oneline"]:
            column['header'] = f"{column['identifier']} ({column['type']}){header_padding}"
        else: 
            column['header'] = f"{column['identifier']} {header_padding}" 
            all_headers_oneline = False
        # column['header'] = f"{column['identifier']}" + header_padding
    column_widths = [ max(column["longestRowSize"], column["headerRowSize"]) for column in columns]
    
    title_padding = f"{titlebox_padding}"*int((total_width-len("Testcases"))/2)
    
    # title_padding is off by one if the length is even
    maybe_space = ""
    if ((total_width%2) == 0): maybe_space = titlebox_padding;
    
    # title box
    ascii_art = "    /*" + ("_" * (total_width-1))
    ascii_art += f"\n    |{title_padding}Testcases{maybe_space}{title_padding}|\n    "
    if (titlebox_underline is not None): ascii_art += '|' + ("_" * total_width) + '|' + "\n    ";
    
    header_line = "|"
    header_linetwo = "|"
    header_underline = "|"
    for (width, (header, type_, isOneLine)) in (
            zip(column_widths, [(column['header'], column['type'], column['header_oneline']) 
            for column in columns]
        )):
        header_line += f" {header.strip().center(width)} |"
        type_ = f"({(type_.strip())})"
        if isOneLine: type_ = ""
        elif len(type_) > width+2: type_ = type_.strip()
        header_linetwo += f"{type_.center(width+2, ' ')}|"
        #header_underline += f"{type_.strip().ljust(width+2, '_')}|"
        header_underline += ('_'*(width+2))+'|'
    header_line += "\n    "
    header_linetwo += "\n    "
    header_underline += "\n    "
    
    ascii_art += header_line
    if not all_headers_oneline: ascii_art += header_linetwo;
    ascii_art += header_underline
    # ascii_art += '|' + ("_" * total_width) + '|' + "\n    "
    
    rows = [*zip(*[column["rows"] for column in columns])]
    alignments = [column["left-align"] for column in columns]
    for row in rows:
        ascii_art += "|"
        for (width, col, lalign) in zip(column_widths, row, alignments):
            if lalign: ascii_art += f" {col.strip().ljust(width)} |";
            else: ascii_art += f" {col.strip().center(width)} |";
        ascii_art += "\n    "
    # final_line = '|' + ("_" * (total_width-1)) + "*/\n\n"
    final_line = f"{header_underline.removesuffix('_|\n    ')}*/\n\n"
    ascii_art += final_line
    return ascii_art


def WriteJavaFile(packageName:str, data: dict, *, provided_code=None, targetDir=sub_savedirs[1]):
    title = Capitalize(data["title"])
    packageName = packageName.replace('-','')  # eclipse doesn't allow names to include dashes
    packagedir = targetDir / packageName
    if not packagedir.exists(): packagedir.mkdir()
    filepath = packagedir / f'{title}.java'
    print(f"    generating {packageName}.{filepath.stem}...")
    
    function_info = WriteTestcaseFile(packageName, data)
    if((title == "MakePi") and (filepath.exists())): return; # never re-generate main file; testcase formatting gets screwed
    testcases = function_info["testCases"]
    returnsList = testcases["returnsList"]
    
    prompt = ReformatPrompt(data["prompt"]).replace('\n', '\n    ') # indent each line
    testcase_comment = TestcaseAsciiArt(data["testcases"], function_info)
    
    if not provided_code:
        # adding static to declaration and cleaning up braces/whitespace
        functionDeclaration = data['provided_code'].rsplit(') {\n ', maxsplit=1)[0] + ')'
        if not functionDeclaration.startswith("public"): functionDeclaration = "public "+functionDeclaration
        functionDeclaration = functionDeclaration.replace("public ", "public static final ")
        functionDeclaration += "\n    {\n        "+f"{function_info['functionDef']['functionBody']}"+"\n    }\n"
    else: functionDeclaration = provided_code;
    
    with open(filepath, "w", encoding="utf-8") as file:
        file.write(f"package {packageName};\n")
        file.write(f"import {packageName}.Testcases._{title};\n")
        if returnsList:
            file.write("import java.util.List;\n")
            file.write("import java.util.Arrays;\n") # for 'Arrays.asList' 
            file.write("import java.util.ArrayList;\n")
        if function_info["needsMap"]:
            file.write("import java.util.Map;\n")
            file.write("import java.util.HashMap;\n")
        file.write('\n')
        
        file.write(f"// {data['url']}\n") # link to codingbat page
        file.write(f"// Difficulty: {data['difficulty']}\n\n")
        
        # The class name must match the filename (java)
        file.write(f"public final class {title}"+"\n{\n")
        
        # prompt and testcase comments
        file.write(f"    /* {prompt} */\n\n")
        file.write(testcase_comment)
        
        # function declaration provided by codingbat and main function
        file.write(f"    {functionDeclaration}\n")
        file.write("    public static final void main(String[] args) {\n")
        file.write(f"        //_{title}.printSuccesses = false;  // set 'false' to print failing tests only.\n")
        file.write(f"        //_{title}.getStacktraces = true;  // set 'true' for stacktraces on exceptions.\n")
        file.write(f"        _{title}.Validate();\n")
        file.write("    }\n") # closing main function
        file.write("}\n") # closing Main class
    
    if filepath.is_relative_to(cwd): print(f"\tdone writing: {filepath.relative_to(cwd)}\n");
    else: print(f"\tdone writing: {filepath.relative_to(targetDir.parent)}\n");
    return


# TODO: implement check/filter for missing files
def GenerateSection(section_name: str, only_missing_files=False):
    if '-' not in section_name: print(f'warning: section-name "{section_name}" expected to have a dash');
    section_dir = sub_savedirs[0] / section_name
    if not section_dir.exists(): 
        print(f'error: json data for section: "{section_name}" does not exist.')
        section_name = section_name[:-1] + "-" + section_name[-1] # putting the dash back in
        print(f'retrying with section-name: "{section_name}"...')
        section_dir = sub_savedirs[0] / section_name
        if not section_dir.exists(): print(f"error: fallback failed. skipping section.\n"); return;
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
    else: print(f"Generated all files for {section_dir}\n\n")
    return failures


def GenerateAll(only_missing=True):
    jsondumps, java_subs = sub_savedirs
    json_section_dirs = [subdir.name for subdir in jsondumps.glob("./*/")]
    java_alreadyExist = [d.name for d in java_subs.glob("./*/")]
    json_section_dirs.sort()
    java_alreadyExist.sort()
    #TODO: do a file count to figure out if any files are missing
     
    java_section_dirs = [
        dirname for dirname in json_section_dirs 
        if ((not only_missing) or (dirname.replace('-', '') not in java_alreadyExist))
    ]
    
    if only_missing:
        print(f"Skipping generation for {len(java_alreadyExist)} pre-existing java subdirectories: ")
        print(' (skip) '+'\n (skip) '.join(java_alreadyExist)+'\n\n')
    
    if (len(java_section_dirs) == 0): print("Nothing to be done.\n"); return;
    print(f"Generation queued for {len(java_section_dirs)} sections: ")
    print(' (new) '+'\n (new) '.join(java_section_dirs)+'\n\n')
    
    fail_count = 0  # number of files that failed to generate
    failure_map = {}
    # TODO: track the number of files created/re-written/skipped
    for subdir_name in java_section_dirs:
        failures = GenerateSection(subdir_name, only_missing)
        fail_count += len(failures)
        if (len(failures) > 0): failure_map[subdir_name] = failures
    
    if (fail_count > 0): print(f"FAILED to generate {fail_count} files across {len(failure_map)} sections.\n");
    for (section_name, file_list) in failure_map.items():
        print(f"{section_name} ({len(file_list)})")
        for file_name in file_list:
            print(f"  {file_name}")
        print('\n')
    
    if (fail_count > 0): print(f"FAILED to generate {fail_count} files across {len(failure_map)} sections.\n");
    else: print(f"Successfully generated all files ({len(java_section_dirs)} sections).\n")
    return


if __name__ == "__main__":
    GenerateAll()
    # GenerateSection("Map-2")
    # GenerateSection("Array-3")
    # GenerateSection("String-1")
    
    # testdata = LoadFile("Array-1", "makePi")
    # testdata = LoadFile("Array-1", "biggerTwo")
    # testdata = LoadFile("String-1", "makeOutWord")
    # testdata = LoadFile("AP-1", "wordsWithoutList")
    # testdata = LoadFile("Map-2", "firstChar")
    # WriteJavaFile("testpackage", testdata)
    
    # (section_name, problems) = ("AP-1", ["bigHeights", "commonTwo", "copyEndy"])
    # (section_name, problems) = ("Functional-1", ["addStar", "copies3"])
    # for problemfile in problems:
    #     testdata = LoadFile(section_name, problemfile)
    #     WriteJavaFile("testpackage", testdata)
    
    # functionDefinition = ParseFunctionDefinition(testdata['provided_code'])
    # testCases = ParseTestcases(testdata["testcases"], functionDefinition)
