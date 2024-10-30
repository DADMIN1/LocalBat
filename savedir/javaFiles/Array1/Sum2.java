package Array1;
import Array1.Testcases._Sum2;

// https://codingbat.com/prob/p190968
// Difficulty: 127.0

public final class Sum2
{
    /* Given an array of ints, return the sum of the first 2 elements in the array. 
    If the array length is less than 2, just sum up the elements that exist, 
    returning 0 if the array is length 0. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | nums (int[])   | expected |
    |                | (int)    |
    |________________|__________|
    | { 1, 2, 3 }    | 3        |
    | { 1, 1 }       | 2        |
    | { 1, 1, 1, 1 } | 2        |
    | { 1, 2 }       | 3        |
    | { 1 }          | 1        |
    | {  }           | 0        |
    | { 4, 5, 6 }    | 9        |
    | { 4 }          | 4        |
    |________________|_________*/

    public static final int sum2(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Sum2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
