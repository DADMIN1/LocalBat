package Recursion2;
import Recursion2.Testcases._Split53;

// https://codingbat.com/prob/p168295
// Difficulty: 424.0

public final class Split53
{
    /* Given an array of ints, is it possible to divide the ints into two groups, 
    so that the sum of the two groups is the same, with these constraints: 
    all the values that are multiple of 5 must be in one group, 
    and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. 
    (No loops needed.) */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    |     nums (int[])    |  returns  |
    |                     | (boolean) |
    |_____________________|___________|
    | {1, 1}              |    true   |
    | {1, 1, 1}           |   false   |
    | {2, 4, 2}           |    true   |
    | {2, 2, 2, 1}        |   false   |
    | {3, 3, 5, 1}        |    true   |
    | {3, 5, 8}           |   false   |
    | {2, 4, 6}           |    true   |
    | {3, 5, 6, 10, 3, 3} |    true   |
    |_____________________|__________*/

    public static final boolean split53(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_Split53.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Split53.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Split53.Validate();
    }
}
