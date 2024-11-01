package Array2;
import Array2.Testcases._TwoTwo;

// https://codingbat.com/prob/p102145
// Difficulty: 257.0

public final class TwoTwo
{
    /* Given an array of ints, return true if every 2 that appears in the array is next to another 2. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | nums (int[])    | expected  |
    |                 | (boolean) |
    |_________________|___________|
    | {4, 2, 2, 3}    | true      |
    | {2, 2, 4}       | true      |
    | {2, 2, 4, 2}    | false     |
    | {1, 3, 4}       | true      |
    | {1, 2, 2, 3, 4} | true      |
    | {1, 2, 3, 4}    | false     |
    | {2, 2}          | true      |
    | {2, 2, 7}       | true      |
    | {2, 2, 7, 2, 1} | false     |
    | {4, 2, 2, 2}    | true      |
    | {2, 2, 2}       | true      |
    | {1, 2}          | false     |
    | {2}             | false     |
    | {1}             | true      |
    | {}              | true      |
    | {5, 2, 2, 3}    | true      |
    | {2, 2, 5, 2}    | false     |
    |_________________|__________*/

    public static final boolean twoTwo(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _TwoTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
