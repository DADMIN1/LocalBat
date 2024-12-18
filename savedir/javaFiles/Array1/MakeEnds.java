package Array1;
import Array1.Testcases._MakeEnds;

// https://codingbat.com/prob/p101230
// Difficulty: 133.0

public final class MakeEnds
{
    /* Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
    The original array will be length 1 or more. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    |       nums (int[])       | returns |
    |                          | (int[]) |
    |__________________________|_________|
    | {1, 2, 3}                | {1, 3}  |
    | {1, 2, 3, 4}             | {1, 4}  |
    | {7, 4, 6, 2}             | {7, 2}  |
    | {1, 2, 2, 2, 2, 2, 2, 3} | {1, 3}  |
    | {7, 4}                   | {7, 4}  |
    | {7}                      | {7, 7}  |
    | {5, 2, 9}                | {5, 9}  |
    | {2, 3, 4, 1}             | {2, 1}  |
    |__________________________|________*/

    public static final int[] makeEnds(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_MakeEnds.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MakeEnds.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MakeEnds.Validate();
    }
}
