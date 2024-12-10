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
        "cuname": CODINGBAT_CREDS["username"], # empty if not logged-in
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


def Login():
    # for some reason the login_response doesn't have cookies, so we need to visit the homepage
    homepage = requests.get("https://codingbat.com/java")
    homepage.raise_for_status()
    if CODINGBAT_DISABLE_LOGIN: return homepage.cookies;
    login_req = {
        "uname": CODINGBAT_CREDS["username"],
        "pw": CODINGBAT_CREDS["password"],
        "dologin": "log+in",
        "fromurl": "/java"
    }
    login_response = requests.post("https://codingbat.com/login", login_req, cookies=homepage.cookies)
    login_response.raise_for_status()
    CODINGBAT_CREDS["password"] = ""
    return homepage.cookies


def SubmitTest():
    cookieJar = Login()
    problemID = 125339
    solution = "public boolean lastDigit(int a, int b) \n{\n  return (a%10) == (b%10);\n}\n"
    result = Submit(problemID, solution, cookieJar)
    assert(result["all_correct"] == True)
    print(result)
    return

 
# TODO: main function; load solutions from database
# TODO: get list of completed problems (from website), retrieve solutions from 'done' page?

if __name__ == "__main__":
    print(adate_now())
    SubmitTest()
