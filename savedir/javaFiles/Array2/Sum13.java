package Array2;
import Array2.Testcases._Sum13;

// https://codingbat.com/prob/p127384
// Difficulty: 212.0

public final class Sum13
{
    /* Return the sum of the numbers in the array, returning 0 for an empty array. 
    Except the number 13 is very unlucky, 
    so it does not count and numbers that come immediately after a 13 also do not count. */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | nums (int[])               | expected |
    |                            | (int)    |
    |____________________________|__________|
    | { 1, 2, 2, 1 }             | 6        |
    | { 1, 1 }                   | 2        |
    | { 1, 2, 2, 1, 13 }         | 6        |
    | { 1, 2, 13, 2, 1, 13 }     | 4        |
    | { 13, 1, 2, 13, 2, 1, 13 } | 3        |
    | {  }                       | 0        |
    | { 13 }                     | 0        |
    | { 13, 13 }                 | 0        |
    | { 13, 0, 13 }              | 0        |
    | { 13, 1, 13 }              | 0        |
    | { 5, 7, 2 }                | 14       |
    | { 5, 13, 2 }               | 5        |
    | { 0 }                      | 0        |
    | { 13, 0 }                  | 0        |
    |____________________________|_________*/

    public static final int sum13(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Sum13.Validate(true);  // pass 'false' to print failed tests only.
    }
}
