package Warmup2;
import Warmup2.Testcases._ArrayFront9;

// https://codingbat.com/prob/p186031
// Difficulty: 221.0

public final class ArrayFront9
{
    /* Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
    The array length may be less than 4. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    |   nums (int[])  |  returns  |
    |                 | (boolean) |
    |_________________|___________|
    | {1, 2, 9, 3, 4} |    true   |
    | {1, 2, 3, 4, 9} |   false   |
    | {1, 2, 3, 4, 5} |   false   |
    | {9, 2, 3}       |    true   |
    | {1, 9, 9}       |    true   |
    | {1, 2, 3}       |   false   |
    | {1, 9}          |    true   |
    | {5, 5}          |   false   |
    | {2}             |   false   |
    | {9}             |    true   |
    | {}              |   false   |
    | {3, 9, 2, 3, 3} |    true   |
    |_________________|__________*/

    public static final boolean arrayFront9(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_ArrayFront9.printSuccesses = false;  // set 'false' to print failing tests only.
        //_ArrayFront9.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _ArrayFront9.Validate();
    }
}
