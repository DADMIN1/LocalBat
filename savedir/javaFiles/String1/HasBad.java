package String1;
import String1.Testcases._HasBad;

// https://codingbat.com/prob/p139075
// Difficulty: 160.0

public class HasBad
{
    /* Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
    including 0. Note: use .equals() to compare 2 strings. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | hasBad("badxx")   → true  |
    | hasBad("xbadxx")  → true  |
    | hasBad("xxbadxx") → false |
    | hasBad("code")    → false |
    | hasBad("bad")     → true  |
    | hasBad("ba")      → false |
    | hasBad("xba")     → false |
    | hasBad("xbad")    → true  |
    | hasBad("")        → false |
    | hasBad("badyy")   → true  |
    |__________________________*/

    public static boolean hasBad(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _HasBad.Validate(true);  // pass 'false' to print failed tests only.
    }
}
