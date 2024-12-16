from database import *
from datetime import datetime,timezone
import requests

try:
    from codingbat_login import *
except AssertionError as E: print(f"ERROR: {E}"); exit(1);
except ImportError as E: print(f"{E}:\nYou need to create 'codingbat_login.py' (see 'codingbat_login_template.txt')"); exit(1);


# the site expects an "adate" field in the POST request in the form of: "adate":"20241209-234612z",
# where the time is in UTC, and all numbers are padded to 2 digits. (e.g. 20240809-003201z)
def adate_now(): return datetime.now(timezone.utc).strftime("%Y%m%d-%H%M%Sz")
# 'strftime' automatically zero-pads each field to two digits
# I don't know what the significance of the trailing 'z' is, and it's not actually required?
# you'll need to remove it to convert back to python-datetime: datetime.fromisoformat("20241209-234612")


# converts or validates a number or string into the problem-ID format
def AsProblemID(ID:str|int):
    if ID.__class__ == int: ID = f"p{ID}"; # 125339 -> "p125339"
    elif not ID.startswith('p'): ID = f"p{ID}";
    assert(ID.startswith('p') and (len(ID) == 7)) # all problem-IDs have 6 digits
    return ID


def ConstructPOST(problemID:str|int, solution:str):
    return {
        "id": AsProblemID(problemID),
        "code": solution,
        "cuname": GET_CREDS((not CODINGBAT_DISABLE_LOGIN), usernameOnly=True), # must be empty if not logged-in
        "owner": "", # ??? setting a value here has no observable effect?
        #"date": "123456789", # when logged-in, this field is added, for some reason. Doesn't seem to be necessary 
        "adate": adate_now(),
    }


def Submit(problemID:str|int, solution:str, cookieJar=None) -> dict:
    response = requests.post("https://codingbat.com/run", data=ConstructPOST(problemID, solution), cookies=cookieJar)
    response.raise_for_status()
    result = {
        "problem": AsProblemID(problemID),
        "all_correct": False, # TODO: parse response
        "failed_testcases": [], # TODO: parse response
    }
    #print(response.text)
    authFailureMsg = "<b>Warning</b> this session has logged out. Please reload this page and log in before running."
    if (response.text.strip() == authFailureMsg): print("INVALID SESSION!"); return result; # TODO: should throw
    result["all_correct"] = "All Correct" in response.text
    return result


def CreateSession(skip_login:bool=False):
    # for some reason the login_response doesn't have cookies, so we need to visit the homepage
    homepage = requests.get("https://codingbat.com/java")
    homepage.raise_for_status()
    global CODINGBAT_DISABLE_LOGIN
    if CODINGBAT_DISABLE_LOGIN or skip_login:
        CODINGBAT_DISABLE_LOGIN = True
        return homepage.cookies
    creds = GET_CREDS()
    login_req = {
        "uname": creds["username"],
        "pw": creds["password"],
        "dologin": "log+in",
        "fromurl": "/java"
    }
    login_response = requests.post("https://codingbat.com/login", login_req, cookies=homepage.cookies)
    login_response.raise_for_status()
    CODINGBAT_CREDS["password"] = ""
    return homepage.cookies


def SubmitTest(skip_login:bool=True):
    if skip_login:
        assert(GET_CREDS(login_enabled=False, usernameOnly=True) == "")
        (username,password) = GET_CREDS(login_enabled=False).values()
        assert(username == "")
        assert(password == "")
    
    cookieJar = CreateSession(skip_login)
    problemID = 125339
    solution = "public boolean lastDigit(int a, int b) \n{\n  return (a%10) == (b%10);\n}\n"
    result = Submit(problemID, solution, cookieJar)
    assert(result["all_correct"] == True)
    print(result)
    return


def ResetAll():
    db = LoadDB()
    print("Resetting status of all submissions!")
    with db: rowcount = db.execute("UPDATE Archive SET status=-1 WHERE TRUE;");
    print(f"{rowcount} submissions reset!")
    db.close()
    return


def UpdateStatuses(resultMap:dict):
    accepted = [problem for (problem, result) in resultMap.items() if result['all_correct']]
    rejected = [problem for (problem, result) in resultMap.items() if not result['all_correct']]
    print(f"accepted: {accepted}")
    print(f"rejected: {rejected}")
    statusCode = {
      -2: "unsubmitted & unqueued",
      -1: "queued for submit",
       0: "rejected",
       1: "accepted",
    }
    def BoolToInt(B:bool):
        if B: return 1; 
        else: return 0;
    
    db = LoadDB()
    with db: rowcount = db.executemany(
    "UPDATE Archive SET status=:status WHERE problem=:problem and section=:section and status=-1;", [
        {"problem":problemName, "section":result['section'], "status":BoolToInt(result['all_correct'])} 
        for (problemName, result) in resultMap.items()
    ]).rowcount
    db.close()
    return rowcount


def SubmitAll(skip_login=False):
    problemID_map = LoadProblemIDMap(alt=True)
    archived = LoadSolutions()
    cookieJar = CreateSession(skip_login=skip_login)
    
    resultMap = {
        problem: {
            "section":section, 
            **Submit(problemID_map[section][problem], fulltext.replace('\\n', '\n'), cookieJar)
        } for (problem, section, fulltext) in archived
    }
    for (problem, result) in resultMap.items(): print(f"{problem} : {result}");
    
    if CODINGBAT_DISABLE_LOGIN: print ("Skipping status updates! [No Login]"); return resultMap;
    updated_rowcount = UpdateStatuses(resultMap)
    assert(updated_rowcount == len(resultMap))
    WriteJavaDatabase() # updating the 'Database.java' file to exclude accepted solutions
    return resultMap


# TODO: get list of completed problems (from website), retrieve solutions from 'done' page?

if __name__ == "__main__":
    SubmitAll()
    # SubmitTest(skip_login=True)
    # SubmitTest(skip_login=False)
    # PrintProblemIDMaps()
    # problemID_map = LoadProblemIDMap(alt=True)
    # archived = LoadSolutions()
    # for (problem, section, fulltext) in archived:
    #     print(f"{problem}: {problemID_map[section][problem]}")
