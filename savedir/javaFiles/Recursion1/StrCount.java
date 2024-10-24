package Recursion1;
import Recursion1.Testcases._StrCount;

// https://codingbat.com/prob/p186177
// Difficulty: 384.0

public class StrCount
{
    /* Given a string and a non-empty substring sub, 
    compute recursively the number of times that sub appears in the string, 
    without the sub strings overlapping. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | strCount("catcowcat", "cat")   → 2 |
    | strCount("catcowcat", "cow")   → 1 |
    | strCount("catcowcat", "dog")   → 0 |
    | strCount("cacatcowcat", "cat") → 2 |
    | strCount("xyx", "x")           → 2 |
    | strCount("iiiijj", "i")        → 4 |
    | strCount("iiiijj", "ii")       → 2 |
    | strCount("iiiijj", "iii")      → 1 |
    | strCount("iiiijj", "j")        → 2 |
    | strCount("iiiijj", "jj")       → 1 |
    | strCount("aaabababab", "ab")   → 4 |
    | strCount("aaabababab", "aa")   → 1 |
    | strCount("aaabababab", "a")    → 6 |
    | strCount("aaabababab", "b")    → 4 |
    |___________________________________*/

    public static int strCount(String str, String sub)
    {
        return 0;
    }

    public static void main(String[] args) {
        _StrCount.Validate(true);  // pass 'false' to print failed tests only.
    }
}
