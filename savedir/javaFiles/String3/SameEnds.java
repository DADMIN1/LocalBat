package String3;
import String3.Testcases._SameEnds;

// https://codingbat.com/prob/p131516
// Difficulty: 321.0

public class SameEnds
{
    /* Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. 
    For example, sameEnds("abXab") is "ab". */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | sameEnds("abXYab")            → "ab"     |
    | sameEnds("xx")                → "x"      |
    | sameEnds("xxx")               → "x"      |
    | sameEnds("xxxx")              → "xx"     |
    | sameEnds("javaXYZjava")       → "java"   |
    | sameEnds("javajava")          → "java"   |
    | sameEnds("xavaXYZjava")       → ""       |
    | sameEnds("Hello! and Hello!") → "Hello!" |
    | sameEnds("x")                 → ""       |
    | sameEnds("")                  → ""       |
    | sameEnds("abcb")              → ""       |
    | sameEnds("mymmy")             → "my"     |
    |_________________________________________*/

    public static String sameEnds(String string)
    {
        return "";
    }

    public static void main(String[] args) {
        _SameEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
