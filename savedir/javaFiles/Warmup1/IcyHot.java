package Warmup1;
import Warmup1.Testcases._IcyHot;

// https://codingbat.com/prob/p192082
// Difficulty: 148.0

public final class IcyHot
{
    /* Given two temperatures, return true if one is less than 0 and the other is greater than 100. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | icyHot(120, -1)  → true  |
    | icyHot(-1, 120)  → true  |
    | icyHot(2, 120)   → false |
    | icyHot(-1, 100)  → false |
    | icyHot(-2, -2)   → false |
    | icyHot(120, 120) → false |
    |_________________________*/

    public static final boolean icyHot(int temp1, int temp2)
    {
        return false;
    }

    public static final void main(String[] args) {
        _IcyHot.Validate(true);  // pass 'false' to print failed tests only.
    }
}
