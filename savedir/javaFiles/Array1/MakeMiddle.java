package Array1;
import Array1.Testcases._MakeMiddle;

// https://codingbat.com/prob/p199519
// Difficulty: 157.0

public final class MakeMiddle
{
    /* Given an array of ints of even length, 
    return a new array length 2 containing the middle two elements from the original array. 
    The original array will be length 2 or more. */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    |    nums (int[])    | returns |
    |                    | (int[]) |
    |____________________|_________|
    | {1, 2, 3, 4}       | {2, 3}  |
    | {7, 1, 2, 3, 4, 9} | {2, 3}  |
    | {1, 2}             | {1, 2}  |
    | {5, 2, 4, 7}       | {2, 4}  |
    | {9, 0, 4, 3, 9, 1} | {4, 3}  |
    |____________________|________*/

    public static final int[] makeMiddle(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_MakeMiddle.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MakeMiddle.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MakeMiddle.Validate();
    }
}
