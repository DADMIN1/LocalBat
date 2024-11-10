package String1;
import String1.Testcases._NonStart;

// https://codingbat.com/prob/p143825
// Difficulty: 130.0

public final class NonStart
{
    /* Given 2 strings, return their concatenation, except omit the first char of each. 
    The strings will be at least length 1. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | a (String) | b (String) |  returns   |
    |            |            |  (String)  |
    |____________|____________|____________|
    |  "Hello"   |  "There"   | "ellohere" |
    |   "java"   |   "code"   |  "avaode"  |
    |  "shotl"   |   "java"   | "hotlava"  |
    |    "ab"    |    "xy"    |    "by"    |
    |    "ab"    |    "x"     |    "b"     |
    |    "x"     |    "ac"    |    "c"     |
    |    "a"     |    "x"     |     ""     |
    |   "kit"    |   "kat"    |   "itat"   |
    |   "mart"   |   "dart"   |  "artart"  |
    |____________|____________|___________*/

    public static final String nonStart(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_NonStart.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NonStart.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NonStart.Validate();
    }
}
