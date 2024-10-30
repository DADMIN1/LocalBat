package Array3;
import Array3.Testcases._MaxMirror;

// https://codingbat.com/prob/p196409
// Difficulty: 324.0

public final class MaxMirror
{
    /* We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, 
    the same group appears in reverse order. For example, the largest mirror section in {1, 
    2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). 
    Return the size of the largest mirror section found in the given array. */

    /*___________________________________________________________________
    |                             Testcases                              |
    |____________________________________________________________________|
    | nums (int[])                                            | expected |
    |                                                         | (int)    |
    |_________________________________________________________|__________|
    | { 1, 2, 3, 8, 9, 3, 2, 1 }                              | 3        |
    | { 1, 2, 1, 4 }                                          | 3        |
    | { 7, 1, 2, 9, 7, 2, 1 }                                 | 2        |
    | { 21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9 } | 4        |
    | { 1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25 } | 4        |
    | { 1, 2, 3, 2, 1 }                                       | 5        |
    | { 1, 2, 3, 3, 8 }                                       | 2        |
    | { 1, 2, 7, 8, 1, 7, 2 }                                 | 2        |
    | { 1, 1, 1 }                                             | 3        |
    | { 1 }                                                   | 1        |
    | {  }                                                    | 0        |
    | { 9, 1, 1, 4, 2, 1, 1, 1 }                              | 3        |
    | { 5, 9, 9, 4, 5, 4, 9, 9, 2 }                           | 7        |
    | { 5, 9, 9, 6, 5, 4, 9, 9, 2 }                           | 2        |
    | { 5, 9, 1, 6, 5, 4, 1, 9, 5 }                           | 3        |
    |_________________________________________________________|_________*/

    public static final int maxMirror(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _MaxMirror.Validate(true);  // pass 'false' to print failed tests only.
    }
}
