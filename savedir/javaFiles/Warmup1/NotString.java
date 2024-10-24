package Warmup1;
import Warmup1.Testcases._NotString;

// https://codingbat.com/prob/p191914
// Difficulty: 127.0

public class NotString
{
    /* Given a string, return a new string where "not " has been added to the front. 
    However, if the string already begins with "not", return the string unchanged. 
    Note: use .equals() to compare 2 strings. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | notString("candy")   → "not candy"  |
    | notString("x")       → "not x"      |
    | notString("not bad") → "not bad"    |
    | notString("bad")     → "not bad"    |
    | notString("not")     → "not"        |
    | notString("is not")  → "not is not" |
    | notString("no")      → "not no"     |
    |____________________________________*/

    public static String notString(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _NotString.Validate(true);  // pass 'false' to print failed tests only.
    }
}
