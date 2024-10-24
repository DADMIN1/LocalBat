package Recursion1;
import Recursion1.Testcases._StrDist;

// https://codingbat.com/prob/p195413
// Difficulty: 390.0

public class StrDist
{
    /* Given a string and a non-empty substring sub, 
    compute recursively the largest substring which starts and ends with sub and return its length. */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    | strDist("catcowcat", "cat")          → 9  |
    | strDist("catcowcat", "cow")          → 3  |
    | strDist("cccatcowcatxx", "cat")      → 9  |
    | strDist("abccatcowcatcatxyz", "cat") → 12 |
    | strDist("xyx", "x")                  → 3  |
    | strDist("xyx", "y")                  → 1  |
    | strDist("xyx", "z")                  → 0  |
    | strDist("z", "z")                    → 1  |
    | strDist("x", "z")                    → 0  |
    | strDist("", "z")                     → 0  |
    | strDist("hiHellohihihi", "hi")       → 13 |
    | strDist("hiHellohihihi", "hih")      → 5  |
    | strDist("hiHellohihihi", "o")        → 1  |
    | strDist("hiHellohihihi", "ll")       → 2  |
    |__________________________________________*/

    public static int strDist(String str, String sub)
    {
        return 0;
    }

    public static void main(String[] args) {
        _StrDist.Validate(true);  // pass 'false' to print failed tests only.
    }
}
