package String1;
import String1.Testcases._NonStart;

// https://codingbat.com/prob/p143825
// Difficulty: 130.0

public final class NonStart
{
    /* Given 2 strings, return their concatenation, except omit the first char of each. 
    The strings will be at least length 1. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | a        | b        | expected   |
    | (String) | (String) | (String)   |
    |__________|__________|____________|
    | "Hello"  | "There"  | "ellohere" |
    | "java"   | "code"   | "avaode"   |
    | "shotl"  | "java"   | "hotlava"  |
    | "ab"     | "xy"     | "by"       |
    | "ab"     | "x"      | "b"        |
    | "x"      | "ac"     | "c"        |
    | "a"      | "x"      | ""         |
    | "kit"    | "kat"    | "itat"     |
    | "mart"   | "dart"   | "artart"   |
    |__________|__________|___________*/

    public static final String nonStart(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        _NonStart.Validate(true);  // pass 'false' to print failed tests only.
    }
}
