package String2;
import String2.Testcases._SameStarChar;

// https://codingbat.com/prob/p194491
// Difficulty: 248.0

public class SameStarChar
{
    /* Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, 
    they are the same. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | sameStarChar("xy*yzz")     → true  |
    | sameStarChar("xy*zzz")     → false |
    | sameStarChar("*xa*az")     → true  |
    | sameStarChar("*xa*bz")     → false |
    | sameStarChar("*xa*a*")     → true  |
    | sameStarChar("")           → true  |
    | sameStarChar("*xa*a*a")    → true  |
    | sameStarChar("*xa*a*b")    → false |
    | sameStarChar("*12*2*2")    → true  |
    | sameStarChar("12*2*3*")    → false |
    | sameStarChar("abcDEF")     → true  |
    | sameStarChar("XY*YYYY*Z*") → false |
    | sameStarChar("XY*YYYY*Y*") → true  |
    | sameStarChar("12*2*3*")    → false |
    | sameStarChar("*")          → true  |
    | sameStarChar("**")         → true  |
    |___________________________________*/

    public static boolean sameStarChar(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _SameStarChar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
