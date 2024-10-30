package Array1;
import Array1.Testcases._MaxTriple;

// https://codingbat.com/prob/p185176
// Difficulty: 169.0

public final class MaxTriple
{
    /* Given an array of ints of odd length, look at the first, 
    last, and middle values in the array and return the largest. 
    The array length will be a least 1. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | nums (int[])            | expected |
    |                         | (int)    |
    |_________________________|__________|
    | { 1, 2, 3 }             | 3        |
    | { 1, 5, 3 }             | 5        |
    | { 5, 2, 3 }             | 5        |
    | { 1, 2, 3, 1, 1 }       | 3        |
    | { 1, 7, 3, 1, 5 }       | 5        |
    | { 5, 1, 3, 7, 1 }       | 5        |
    | { 5, 1, 7, 3, 7, 8, 1 } | 5        |
    | { 5, 1, 7, 9, 7, 8, 1 } | 9        |
    | { 5, 1, 7, 3, 7, 8, 9 } | 9        |
    | { 2, 2, 5, 1, 1 }       | 5        |
    |_________________________|_________*/

    public static final int maxTriple(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _MaxTriple.Validate(true);  // pass 'false' to print failed tests only.
    }
}
