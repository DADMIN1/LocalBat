package Warmup1;
import Warmup1.Testcases._Makes10;

// https://codingbat.com/prob/p182873
// Difficulty: 118.0

public class Makes10
{
    /* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. */

    /*________________________
    |        Testcases        |
    |_________________________|
    | makes10(9, 10)  → true  |
    | makes10(9, 9)   → false |
    | makes10(1, 9)   → true  |
    | makes10(10, 1)  → true  |
    | makes10(10, 10) → true  |
    | makes10(8, 2)   → true  |
    | makes10(8, 3)   → false |
    | makes10(10, 42) → true  |
    | makes10(12, -2) → true  |
    |________________________*/

    public static boolean makes10(int a, int b)
    {
        return false;
    }

    public static void main(String[] args) {
        _Makes10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
