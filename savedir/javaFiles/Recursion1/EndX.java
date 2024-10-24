package Recursion1;
import Recursion1.Testcases._EndX;

// https://codingbat.com/prob/p105722
// Difficulty: 360.0

public class EndX
{
    /* Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | endX("xxre")    → "rexx"    |
    | endX("xxhixx")  → "hixxxx"  |
    | endX("xhixhix") → "hihixxx" |
    | endX("hiy")     → "hiy"     |
    | endX("h")       → "h"       |
    | endX("x")       → "x"       |
    | endX("xx")      → "xx"      |
    | endX("")        → ""        |
    | endX("bxx")     → "bxx"     |
    | endX("bxax")    → "baxx"    |
    | endX("axaxax")  → "aaaxxx"  |
    | endX("xxhxi")   → "hixxx"   |
    |____________________________*/

    public static String endX(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _EndX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
