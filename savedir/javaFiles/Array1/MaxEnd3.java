package Array1;
import Array1.Testcases._MaxEnd3;

// https://codingbat.com/prob/p146256
// Difficulty: 124.0

public final class MaxEnd3
{
    /* Given an array of ints length 3, figure out which is larger, 
    the first or last element in the array, and set all the other elements to be that value. 
    Return the changed array. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    |     nums    |   returns    |
    |   (int[])   |   (int[])    |
    |_____________|______________|
    | {1, 2, 3}   | {3, 3, 3}    |
    | {11, 5, 9}  | {11, 11, 11} |
    | {2, 11, 3}  | {3, 3, 3}    |
    | {11, 3, 3}  | {11, 11, 11} |
    | {3, 11, 11} | {11, 11, 11} |
    | {2, 2, 2}   | {2, 2, 2}    |
    | {2, 11, 2}  | {2, 2, 2}    |
    | {0, 0, 1}   | {1, 1, 1}    |
    |_____________|_____________*/

    public static final int[] maxEnd3(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_MaxEnd3.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MaxEnd3.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MaxEnd3.Validate();
    }
}
