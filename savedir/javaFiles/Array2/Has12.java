package Array2;
import Array2.Testcases._Has12;

// https://codingbat.com/prob/p169260
// Difficulty: 248.0

public final class Has12
{
    /* Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    |    nums (int[])    |  returns  |
    |                    | (boolean) |
    |____________________|___________|
    | {1, 3, 2}          |    true   |
    | {3, 1, 2}          |    true   |
    | {3, 1, 4, 5, 2}    |    true   |
    | {3, 1, 4, 5, 6}    |   false   |
    | {3, 1, 4, 1, 6, 2} |    true   |
    | {2, 1, 4, 1, 6, 2} |    true   |
    | {2, 1, 4, 1, 6}    |   false   |
    | {1}                |   false   |
    | {2, 1, 3}          |   false   |
    | {2, 1, 3, 2}       |    true   |
    | {2}                |   false   |
    | {3, 2}             |   false   |
    | {3, 1, 3, 2}       |    true   |
    | {3, 5, 9}          |   false   |
    | {3, 5, 1}          |   false   |
    | {3, 2, 1}          |   false   |
    | {1, 2}             |    true   |
    |____________________|__________*/

    public static final boolean has12(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_Has12.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Has12.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Has12.Validate();
    }
}
