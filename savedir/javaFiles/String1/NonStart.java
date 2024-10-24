package String1;
import String1.Testcases._NonStart;

// https://codingbat.com/prob/p143825
// Difficulty: 130.0

public class NonStart
{
    /* Given 2 strings, return their concatenation, except omit the first char of each. 
    The strings will be at least length 1. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | nonStart("Hello", "There") → "ellohere" |
    | nonStart("java", "code")   → "avaode"   |
    | nonStart("shotl", "java")  → "hotlava"  |
    | nonStart("ab", "xy")       → "by"       |
    | nonStart("ab", "x")        → "b"        |
    | nonStart("x", "ac")        → "c"        |
    | nonStart("a", "x")         → ""         |
    | nonStart("kit", "kat")     → "itat"     |
    | nonStart("mart", "dart")   → "artart"   |
    |________________________________________*/

    public static String nonStart(String a, String b)
    {
        return "";
    }

    public static void main(String[] args) {
        _NonStart.Validate(true);  // pass 'false' to print failed tests only.
    }
}
