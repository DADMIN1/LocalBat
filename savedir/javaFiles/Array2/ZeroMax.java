package Array2;
import Array2.Testcases._ZeroMax;

// https://codingbat.com/prob/p187050
// Difficulty: 287.0

public final class ZeroMax
{
    /* Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. 
    If there is no odd value to the right of the zero, leave the zero as a zero. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    |    nums (int[])    |  returns (int[])   |
    |____________________|____________________|
    | {0, 5, 0, 3}       | {5, 5, 3, 3}       |
    | {0, 4, 0, 3}       | {3, 4, 3, 3}       |
    | {0, 1, 0}          | {1, 1, 0}          |
    | {0, 1, 5}          | {5, 1, 5}          |
    | {0, 2, 0}          | {0, 2, 0}          |
    | {1}                | {1}                |
    | {0}                | {0}                |
    | {}                 | {}                 |
    | {7, 0, 4, 3, 0, 2} | {7, 3, 4, 3, 0, 2} |
    | {7, 0, 4, 3, 0, 1} | {7, 3, 4, 3, 1, 1} |
    | {7, 0, 4, 3, 0, 0} | {7, 3, 4, 3, 0, 0} |
    | {7, 0, 1, 0, 0, 7} | {7, 7, 1, 7, 7, 7} |
    |____________________|___________________*/

    public static final int[] zeroMax(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_ZeroMax.printSuccesses = false;  // set 'false' to print failing tests only.
        //_ZeroMax.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _ZeroMax.Validate();
    }
}
