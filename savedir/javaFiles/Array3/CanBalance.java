package Array3;
import Array3.Testcases._CanBalance;

// https://codingbat.com/prob/p158767
// Difficulty: 312.0

public final class CanBalance
{
    /* Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side. */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    | canBalance([1, 1, 1, 2, 1])       → true  |
    | canBalance([2, 1, 1, 2, 1])       → false |
    | canBalance([10, 10])              → true  |
    | canBalance([10, 0, 1, -1, 10])    → true  |
    | canBalance([1, 1, 1, 1, 4])       → true  |
    | canBalance([2, 1, 1, 1, 4])       → false |
    | canBalance([2, 3, 4, 1, 2])       → false |
    | canBalance([1, 2, 3, 1, 0, 2, 3]) → true  |
    | canBalance([1, 2, 3, 1, 0, 1, 3]) → false |
    | canBalance([1])                   → false |
    | canBalance([1, 1, 1, 2, 1])       → true  |
    |__________________________________________*/

    public static final boolean canBalance(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _CanBalance.Validate(true);  // pass 'false' to print failed tests only.
    }
}
