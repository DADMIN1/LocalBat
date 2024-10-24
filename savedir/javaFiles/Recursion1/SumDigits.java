package Recursion1;
import Recursion1.Testcases._SumDigits;

// https://codingbat.com/prob/p163932
// Difficulty: 318.0

public class SumDigits
{
    /* Given a non-negative int n, return the sum of its digits recursively (no loops). 
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

    /*______________________
    |       Testcases       |
    |_______________________|
    | sumDigits(126)   → 9  |
    | sumDigits(49)    → 13 |
    | sumDigits(12)    → 3  |
    | sumDigits(10)    → 1  |
    | sumDigits(1)     → 1  |
    | sumDigits(0)     → 0  |
    | sumDigits(730)   → 10 |
    | sumDigits(1111)  → 4  |
    | sumDigits(11111) → 5  |
    | sumDigits(10110) → 3  |
    | sumDigits(235)   → 10 |
    |______________________*/

    public static int sumDigits(int n)
    {
        return 0;
    }

    public static void main(String[] args) {
        _SumDigits.Validate(true);  // pass 'false' to print failed tests only.
    }
}
