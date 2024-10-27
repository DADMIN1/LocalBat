package Array2;
import Array2.Testcases._TwoTwo;

// https://codingbat.com/prob/p102145
// Difficulty: 257.0

public final class TwoTwo
{
    /* Given an array of ints, return true if every 2 that appears in the array is next to another 2. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | twoTwo([4, 2, 2, 3])    → true  |
    | twoTwo([2, 2, 4])       → true  |
    | twoTwo([2, 2, 4, 2])    → false |
    | twoTwo([1, 3, 4])       → true  |
    | twoTwo([1, 2, 2, 3, 4]) → true  |
    | twoTwo([1, 2, 3, 4])    → false |
    | twoTwo([2, 2])          → true  |
    | twoTwo([2, 2, 7])       → true  |
    | twoTwo([2, 2, 7, 2, 1]) → false |
    | twoTwo([4, 2, 2, 2])    → true  |
    | twoTwo([2, 2, 2])       → true  |
    | twoTwo([1, 2])          → false |
    | twoTwo([2])             → false |
    | twoTwo([1])             → true  |
    | twoTwo([])              → true  |
    | twoTwo([5, 2, 2, 3])    → true  |
    | twoTwo([2, 2, 5, 2])    → false |
    |________________________________*/

    public static final boolean twoTwo(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _TwoTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
