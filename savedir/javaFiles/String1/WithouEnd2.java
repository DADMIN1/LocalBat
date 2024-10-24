package String1;
import String1.Testcases._WithouEnd2;

// https://codingbat.com/prob/p174254
// Difficulty: 142.0

public class WithouEnd2
{
    /* Given a string, return a version without both the first and last char of the string. 
    The string may be any length, including 0. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | withouEnd2("Hello")     → "ell"     |
    | withouEnd2("abc")       → "b"       |
    | withouEnd2("ab")        → ""        |
    | withouEnd2("a")         → ""        |
    | withouEnd2("")          → ""        |
    | withouEnd2("coldy")     → "old"     |
    | withouEnd2("java code") → "ava cod" |
    |____________________________________*/

    public static String withouEnd2(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _WithouEnd2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
