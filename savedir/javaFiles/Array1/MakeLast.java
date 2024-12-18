package Array1;
import Array1.Testcases._MakeLast;

// https://codingbat.com/prob/p137188
// Difficulty: 142.0

public final class MakeLast
{
    /* Given an int array, return a new array with double the length where its last element is the same as the original array, 
    and all the other elements are 0. The original array will be length 1 or more. 
    Note: by default, a new int array contains all 0's. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | nums (int[]) |     returns (int[])      |
    |______________|__________________________|
    | {4, 5, 6}    | {0, 0, 0, 0, 0, 6}       |
    | {1, 2}       | {0, 0, 0, 2}             |
    | {3}          | {0, 3}                   |
    | {0}          | {0, 0}                   |
    | {7, 7, 7}    | {0, 0, 0, 0, 0, 7}       |
    | {3, 1, 4}    | {0, 0, 0, 0, 0, 4}       |
    | {1, 2, 3, 4} | {0, 0, 0, 0, 0, 0, 0, 4} |
    | {1, 2, 3, 0} | {0, 0, 0, 0, 0, 0, 0, 0} |
    | {2, 4}       | {0, 0, 0, 4}             |
    |______________|_________________________*/

    public static final int[] makeLast(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_MakeLast.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MakeLast.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MakeLast.Validate();
    }
}
