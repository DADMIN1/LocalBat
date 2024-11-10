package String3;
import String3.Testcases._SameEnds;

// https://codingbat.com/prob/p131516
// Difficulty: 321.0

public final class SameEnds
{
    /* Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. 
    For example, sameEnds("abXab") is "ab". */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    |   string (String)   | returns  |
    |                     | (String) |
    |_____________________|__________|
    |       "abXYab"      |   "ab"   |
    |         "xx"        |   "x"    |
    |        "xxx"        |   "x"    |
    |        "xxxx"       |   "xx"   |
    |    "javaXYZjava"    |  "java"  |
    |      "javajava"     |  "java"  |
    |    "xavaXYZjava"    |    ""    |
    | "Hello! and Hello!" | "Hello!" |
    |         "x"         |    ""    |
    |          ""         |    ""    |
    |        "abcb"       |    ""    |
    |       "mymmy"       |   "my"   |
    |_____________________|_________*/

    public static final String sameEnds(String string)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_SameEnds.printSuccesses = false;  // set 'false' to print failing tests only.
        //_SameEnds.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _SameEnds.Validate();
    }
}
