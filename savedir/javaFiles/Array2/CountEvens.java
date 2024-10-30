package Array2;
import Array2.Testcases._CountEvens;

// https://codingbat.com/prob/p162010
// Difficulty: 203.0

public final class CountEvens
{
    /* Return the number of even ints in the given array. Note: 
    the % "mod" operator computes the remainder, e.g. 5 % 2 is 1. */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | nums (int[])      | expected |
    |                   | (int)    |
    |___________________|__________|
    | { 2, 1, 2, 3, 4 } | 3        |
    | { 2, 2, 0 }       | 3        |
    | { 1, 3, 5 }       | 0        |
    | {  }              | 0        |
    | { 11, 9, 0, 1 }   | 1        |
    | { 2, 11, 9, 0 }   | 2        |
    | { 2 }             | 1        |
    | { 2, 5, 12 }      | 2        |
    |___________________|_________*/

    public static final int countEvens(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountEvens.Validate(true);  // pass 'false' to print failed tests only.
    }
}
