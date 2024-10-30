package Array2;
import Array2.Testcases._BigDiff;

// https://codingbat.com/prob/p196640
// Difficulty: 206.0

public final class BigDiff
{
    /* Given an array length 1 or more of ints, 
    return the difference between the largest and smallest values in the array. 
    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | nums (int[])            | expected |
    |                         | (int)    |
    |_________________________|__________|
    | { 10, 3, 5, 6 }         | 7        |
    | { 7, 2, 10, 9 }         | 8        |
    | { 2, 10, 7, 2 }         | 8        |
    | { 2, 10 }               | 8        |
    | { 10, 2 }               | 8        |
    | { 10, 0 }               | 10       |
    | { 2, 3 }                | 1        |
    | { 2, 2 }                | 0        |
    | { 2 }                   | 0        |
    | { 5, 1, 6, 1, 9, 9 }    | 8        |
    | { 7, 6, 8, 5 }          | 3        |
    | { 7, 7, 6, 8, 5, 5, 6 } | 3        |
    |_________________________|_________*/

    public static final int bigDiff(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _BigDiff.Validate(true);  // pass 'false' to print failed tests only.
    }
}
