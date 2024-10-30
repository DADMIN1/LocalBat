package Recursion1;
import Recursion1.Testcases._EndX;

// https://codingbat.com/prob/p105722
// Difficulty: 360.0

public final class EndX
{
    /* Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string. */

    /*______________________
    |       Testcases       |
    |_______________________|
    | str       | expected  |
    | (String)  | (String)  |
    |___________|___________|
    | "xxre"    | "rexx"    |
    | "xxhixx"  | "hixxxx"  |
    | "xhixhix" | "hihixxx" |
    | "hiy"     | "hiy"     |
    | "h"       | "h"       |
    | "x"       | "x"       |
    | "xx"      | "xx"      |
    | ""        | ""        |
    | "bxx"     | "bxx"     |
    | "bxax"    | "baxx"    |
    | "axaxax"  | "aaaxxx"  |
    | "xxhxi"   | "hixxx"   |
    |___________|__________*/

    public static final String endX(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _EndX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
