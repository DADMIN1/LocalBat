package Array1;
import Array1.Testcases._Fix23;

// https://codingbat.com/prob/p120347
// Difficulty: 148.0

public final class Fix23
{
    /* Given an int array length 3, if there is a 2 in the array immediately followed by a 3, 
    set the 3 element to 0. Return the changed array. */

    /*______________________
    |       Testcases       |
    |_______________________|
    |    nums   |  returns  |
    |  (int[])  |  (int[])  |
    |___________|___________|
    | {1, 2, 3} | {1, 2, 0} |
    | {2, 3, 5} | {2, 0, 5} |
    | {1, 2, 1} | {1, 2, 1} |
    | {3, 2, 1} | {3, 2, 1} |
    | {2, 2, 3} | {2, 2, 0} |
    | {2, 3, 3} | {2, 0, 3} |
    |___________|__________*/

    public static final int[] fix23(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_Fix23.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Fix23.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Fix23.Validate();
    }
}
