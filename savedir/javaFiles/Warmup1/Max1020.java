package Warmup1;
import Warmup1.Testcases._Max1020;

// https://codingbat.com/prob/p177372
// Difficulty: 178.0

public final class Max1020
{
    /* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
    or return 0 if neither is in that range. */

    /*_____________________
    |      Testcases       |
    |______________________|
    | max1020(11, 19) → 19 |
    | max1020(19, 11) → 19 |
    | max1020(11, 9)  → 11 |
    | max1020(9, 21)  → 0  |
    | max1020(10, 21) → 10 |
    | max1020(21, 10) → 10 |
    | max1020(9, 11)  → 11 |
    | max1020(23, 10) → 10 |
    | max1020(20, 10) → 20 |
    | max1020(7, 20)  → 20 |
    | max1020(17, 16) → 17 |
    |_____________________*/

    public static final int max1020(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Max1020.Validate(true);  // pass 'false' to print failed tests only.
    }
}
