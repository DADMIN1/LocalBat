package Warmup1;
import Warmup1.Testcases._LastDigit;

// https://codingbat.com/prob/p125339
// Difficulty: 184.0

public class LastDigit
{
    /* Given two non-negative int values, return true if they have the same last digit, 
    such as with 27 and 57. Note that the % "mod" operator computes remainders, 
    so 17 % 10 is 7. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | lastDigit(7, 17)    → true  |
    | lastDigit(6, 17)    → false |
    | lastDigit(3, 113)   → true  |
    | lastDigit(114, 113) → false |
    | lastDigit(114, 4)   → true  |
    | lastDigit(10, 0)    → true  |
    | lastDigit(11, 0)    → false |
    |____________________________*/

    public static boolean lastDigit(int a, int b)
    {
        return false;
    }

    public static void main(String[] args) {
        _LastDigit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
