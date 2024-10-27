package Warmup2;
import Warmup2.Testcases._DoubleX;

// https://codingbat.com/prob/p186759
// Difficulty: 208.0

public final class DoubleX
{
    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | doubleX("axxbb")  → true  |
    | doubleX("axaxax") → false |
    | doubleX("xxxxx")  → true  |
    | doubleX("xaxxx")  → false |
    | doubleX("aaaax")  → false |
    | doubleX("")       → false |
    | doubleX("abc")    → false |
    | doubleX("x")      → false |
    | doubleX("xx")     → true  |
    | doubleX("xax")    → false |
    | doubleX("xaxx")   → false |
    |__________________________*/

    public static final boolean doubleX(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _DoubleX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
