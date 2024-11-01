package Array1;
import Array1.Testcases._FirstLast6;

// https://codingbat.com/prob/p185685
// Difficulty: 103.0

public final class FirstLast6
{
    /* Given an array of ints, return true if 6 appears as either the first or last element in the array. 
    The array will be length 1 or more. */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    |   nums (int[])   |  returns  |
    |                  | (boolean) |
    |__________________|___________|
    | {1, 2, 6}        |    true   |
    | {6, 1, 2, 3}     |    true   |
    | {13, 6, 1, 2, 3} |   false   |
    | {13, 6, 1, 2, 6} |    true   |
    | {3, 2, 1}        |   false   |
    | {3, 6, 1}        |   false   |
    | {3, 6}           |    true   |
    | {6}              |    true   |
    | {3}              |   false   |
    | {5, 6}           |    true   |
    | {5, 5}           |   false   |
    | {1, 2, 3, 4, 6}  |    true   |
    | {1, 2, 3, 4}     |   false   |
    |__________________|__________*/

    public static final boolean firstLast6(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _FirstLast6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
