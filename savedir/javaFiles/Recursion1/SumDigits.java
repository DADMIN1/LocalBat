// https://codingbat.com/prob/p163932
package Recursion1;
import Recursion1.Testcases._SumDigits;

public class SumDigits
{
    /* Given a non-negative int n, return the sum of its digits recursively (no loops). 
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

    /*____________________
    |      Testcases      |
    |_____________________|
    | sumDigits(126) → 9  |
    | sumDigits(49)  → 13 |
    | sumDigits(12)  → 3  |
    |____________________*/

    public static int sumDigits(int n)
    {
        
    }

    public static void main(String[] args) {
        _SumDigits.Validate(true);  // pass 'false' to print failed tests only.
    }
}
