package Array3;
import Array3.Testcases._CountClumps;

// https://codingbat.com/prob/p193817
// Difficulty: 327.0

public final class CountClumps
{
    /* Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
    Return the number of clumps in the given array. */

    /*__________________________________________________
    |                     Testcases                     |
    |___________________________________________________|
    |               nums (int[])              | returns |
    |                                         |  (int)  |
    |_________________________________________|_________|
    | {1, 2, 2, 3, 4, 4}                      |    2    |
    | {1, 1, 2, 1, 1}                         |    2    |
    | {1, 1, 1, 1, 1}                         |    1    |
    | {1, 2, 3}                               |    0    |
    | {2, 2, 1, 1, 1, 2, 1, 1, 2, 2}          |    4    |
    | {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}       |    4    |
    | {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}    |    5    |
    | {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2} |    5    |
    | {}                                      |    0    |
    |_________________________________________|________*/

    public static final int countClumps(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_CountClumps.printSuccesses = false;  // set 'false' to print failing tests only.
        //_CountClumps.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _CountClumps.Validate();
    }
}
