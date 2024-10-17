// https://codingbat.com/prob/p139075
package String1;
import String1.Testcases._HasBad;

public class HasBad
{
    /* Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
    including 0. Note: use .equals() to compare 2 strings. */

    /*___________________________
    |         Testcases         |
    _____________________________
    | hasBad("badxx")   → true  |
    | hasBad("xbadxx")  → true  |
    | hasBad("xxbadxx") → false |
    ___________________________*/

    public static boolean hasBad(String str)
    {
        
    }

    public static void main(String[] args) {
        _HasBad.Validate(true);  // pass 'false' to print failed tests only.
    }
}
