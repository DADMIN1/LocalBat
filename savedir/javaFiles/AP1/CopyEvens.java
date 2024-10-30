package AP1;
import AP1.Testcases._CopyEvens;

// https://codingbat.com/prob/p134174
// Difficulty: 230.0

public final class CopyEvens
{
    /* Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. 
    The original array will contain at least "count" even numbers. */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | nums (int[])         | count | expected     |
    |                      | (int) | (int[])      |
    |______________________|_______|______________|
    | { 3, 2, 4, 5, 8 }    | 2     | {2, 4}       |
    | { 3, 2, 4, 5, 8 }    | 3     | {2, 4, 8}    |
    | { 6, 1, 2, 4, 5, 8 } | 3     | {6, 2, 4}    |
    | { 6, 1, 2, 4, 5, 8 } | 4     | {6, 2, 4, 8} |
    | { 3, 1, 4, 1, 5 }    | 1     | {4}          |
    | { 2 }                | 1     | {2}          |
    | { 6, 2, 4, 8 }       | 2     | {6, 2}       |
    | { 6, 2, 4, 8 }       | 3     | {6, 2, 4}    |
    | { 6, 2, 4, 8 }       | 4     | {6, 2, 4, 8} |
    | { 1, 8, 4 }          | 1     | {8}          |
    | { 1, 8, 4 }          | 2     | {8, 4}       |
    | { 2, 8, 4 }          | 2     | {2, 8}       |
    |______________________|_______|_____________*/

    public static final int[] copyEvens(int[] nums, int count)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _CopyEvens.Validate(true);  // pass 'false' to print failed tests only.
    }
}
