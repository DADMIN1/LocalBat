package Warmup1;
import Warmup1.Testcases._PosNeg;

// https://codingbat.com/prob/p159227
// Difficulty: 124.0

public class PosNeg
{
    /* Given 2 int values, return true if one is negative and one is positive. 
    Except if the parameter "negative" is true, then return true only if both are negative. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | posNeg(1, -1, false)  → true  |
    | posNeg(-1, 1, false)  → true  |
    | posNeg(-4, -5, true)  → true  |
    | posNeg(-4, -5, false) → false |
    | posNeg(-4, 5, false)  → true  |
    | posNeg(-4, 5, true)   → false |
    | posNeg(1, 1, false)   → false |
    | posNeg(-1, -1, false) → false |
    | posNeg(1, -1, true)   → false |
    | posNeg(-1, 1, true)   → false |
    | posNeg(1, 1, true)    → false |
    | posNeg(-1, -1, true)  → true  |
    | posNeg(5, -5, false)  → true  |
    | posNeg(-6, 6, false)  → true  |
    | posNeg(-5, -6, false) → false |
    | posNeg(-2, -1, false) → false |
    | posNeg(1, 2, false)   → false |
    | posNeg(-5, 6, true)   → false |
    | posNeg(-5, -5, true)  → true  |
    |______________________________*/

    public static boolean posNeg(int a, int b, boolean negative)
    {
        return false;
    }

    public static void main(String[] args) {
        _PosNeg.Validate(true);  // pass 'false' to print failed tests only.
    }
}
