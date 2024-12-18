package Array2;
import Array2.Testcases._Has22;

// https://codingbat.com/prob/p121853
// Difficulty: 218.0

public final class Has22
{
    /* Given an array of ints, return true if the array contains a 2 next to a 2 somewhere. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    |    nums (int[])    |  returns  |
    |                    | (boolean) |
    |____________________|___________|
    | {1, 2, 2}          |    true   |
    | {1, 2, 1, 2}       |   false   |
    | {2, 1, 2}          |   false   |
    | {2, 2, 1, 2}       |    true   |
    | {1, 3, 2}          |   false   |
    | {1, 3, 2, 2}       |    true   |
    | {2, 3, 2, 2}       |    true   |
    | {4, 2, 4, 2, 2, 5} |    true   |
    | {1, 2}             |   false   |
    | {2, 2}             |    true   |
    | {2}                |   false   |
    | {}                 |   false   |
    | {3, 3, 2, 2}       |    true   |
    | {5, 2, 5, 2}       |   false   |
    |____________________|__________*/

    public static final boolean has22(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_Has22.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Has22.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Has22.Validate();
    }
}
