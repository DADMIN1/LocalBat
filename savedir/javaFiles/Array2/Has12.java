package Array2;
import Array2.Testcases._Has12;

// https://codingbat.com/prob/p169260
// Difficulty: 248.0

public class Has12
{
    /* Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | has12([1, 3, 2])          → true  |
    | has12([3, 1, 2])          → true  |
    | has12([3, 1, 4, 5, 2])    → true  |
    | has12([3, 1, 4, 5, 6])    → false |
    | has12([3, 1, 4, 1, 6, 2]) → true  |
    | has12([2, 1, 4, 1, 6, 2]) → true  |
    | has12([2, 1, 4, 1, 6])    → false |
    | has12([1])                → false |
    | has12([2, 1, 3])          → false |
    | has12([2, 1, 3, 2])       → true  |
    | has12([2])                → false |
    | has12([3, 2])             → false |
    | has12([3, 1, 3, 2])       → true  |
    | has12([3, 5, 9])          → false |
    | has12([3, 5, 1])          → false |
    | has12([3, 2, 1])          → false |
    | has12([1, 2])             → true  |
    |__________________________________*/

    public static boolean has12(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _Has12.Validate(true);  // pass 'false' to print failed tests only.
    }
}
