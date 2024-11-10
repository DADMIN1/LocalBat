package Array1;
import Array1.Testcases._MidThree;

// https://codingbat.com/prob/p155713
// Difficulty: 166.0

public final class MidThree
{
    /* Given an array of ints of odd length, 
    return a new array length 3 containing the elements from the middle of the array. 
    The array length will be at least 3. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    |      nums (int[])     |  returns  |
    |                       |  (int[])  |
    |_______________________|___________|
    | {1, 2, 3, 4, 5}       | {2, 3, 4} |
    | {8, 6, 7, 5, 3, 0, 9} | {7, 5, 3} |
    | {1, 2, 3}             | {1, 2, 3} |
    |_______________________|__________*/

    public static final int[] midThree(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_MidThree.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MidThree.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MidThree.Validate();
    }
}
