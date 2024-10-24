package Warmup2;
import Warmup2.Testcases._Last2;

// https://codingbat.com/prob/p178318
// Difficulty: 215.0

public class Last2
{
    /* Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, 
    so "hixxxhi" yields 1 (we won't count the end substring). */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | last2("hixxhi")      → 1 |
    | last2("xaxxaxaxx")   → 1 |
    | last2("axxxaaxx")    → 2 |
    | last2("xxaxxaxxaxx") → 3 |
    | last2("xaxaxaxx")    → 0 |
    | last2("xxxx")        → 2 |
    | last2("13121312")    → 1 |
    | last2("11212")       → 1 |
    | last2("13121311")    → 0 |
    | last2("1717171")     → 2 |
    | last2("hi")          → 0 |
    | last2("h")           → 0 |
    | last2("")            → 0 |
    |_________________________*/

    public static int last2(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _Last2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
