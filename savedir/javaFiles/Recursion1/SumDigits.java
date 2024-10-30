package Recursion1;
import Recursion1.Testcases._SumDigits;

// https://codingbat.com/prob/p163932
// Difficulty: 318.0

public final class SumDigits
{
    /* Given a non-negative int n, return the sum of its digits recursively (no loops). 
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

    /*_________________
    |    Testcases     |
    |__________________|
    | n     | expected |
    | (int) | (int)    |
    |_______|__________|
    | 126   | 9        |
    | 49    | 13       |
    | 12    | 3        |
    | 10    | 1        |
    | 1     | 1        |
    | 0     | 0        |
    | 730   | 10       |
    | 1111  | 4        |
    | 11111 | 5        |
    | 10110 | 3        |
    | 235   | 10       |
    |_______|_________*/

    public static final int sumDigits(int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _SumDigits.Validate(true);  // pass 'false' to print failed tests only.
    }
}
