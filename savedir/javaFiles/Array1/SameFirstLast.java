package Array1;
import Array1.Testcases._SameFirstLast;

// https://codingbat.com/prob/p118976
// Difficulty: 106.0

public final class SameFirstLast
{
    /* Given an array of ints, return true if the array is length 1 or more, 
    and the first element and the last element are equal. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    |     nums (int[])     |  returns  |
    |                      | (boolean) |
    |______________________|___________|
    | {1, 2, 3}            |   false   |
    | {1, 2, 3, 1}         |    true   |
    | {1, 2, 1}            |    true   |
    | {7}                  |    true   |
    | {}                   |   false   |
    | {1, 2, 3, 4, 5, 1}   |    true   |
    | {1, 2, 3, 4, 5, 13}  |   false   |
    | {13, 2, 3, 4, 5, 13} |    true   |
    | {7, 7}               |    true   |
    |______________________|__________*/

    public static final boolean sameFirstLast(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_SameFirstLast.printSuccesses = false;  // set 'false' to print failing tests only.
        //_SameFirstLast.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _SameFirstLast.Validate();
    }
}
