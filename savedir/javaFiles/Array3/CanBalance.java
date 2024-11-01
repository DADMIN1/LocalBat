package Array3;
import Array3.Testcases._CanBalance;

// https://codingbat.com/prob/p158767
// Difficulty: 312.0

public final class CanBalance
{
    /* Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | nums (int[])          | expected  |
    |                       | (boolean) |
    |_______________________|___________|
    | {1, 1, 1, 2, 1}       | true      |
    | {2, 1, 1, 2, 1}       | false     |
    | {10, 10}              | true      |
    | {10, 0, 1, -1, 10}    | true      |
    | {1, 1, 1, 1, 4}       | true      |
    | {2, 1, 1, 1, 4}       | false     |
    | {2, 3, 4, 1, 2}       | false     |
    | {1, 2, 3, 1, 0, 2, 3} | true      |
    | {1, 2, 3, 1, 0, 1, 3} | false     |
    | {1}                   | false     |
    | {1, 1, 1, 2, 1}       | true      |
    |_______________________|__________*/

    public static final boolean canBalance(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _CanBalance.Validate(true);  // pass 'false' to print failed tests only.
    }
}
