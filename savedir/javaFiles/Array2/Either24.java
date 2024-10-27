package Array2;
import Array2.Testcases._Either24;

// https://codingbat.com/prob/p191878
// Difficulty: 239.0

public final class Either24
{
    /* Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, 
    but not both. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | either24([1, 2, 2])             → true  |
    | either24([4, 4, 1])             → true  |
    | either24([4, 4, 1, 2, 2])       → false |
    | either24([1, 2, 3, 4])          → false |
    | either24([3, 5, 9])             → false |
    | either24([1, 2, 3, 4, 4])       → true  |
    | either24([2, 2, 3, 4])          → true  |
    | either24([1, 2, 3, 2, 2, 4])    → true  |
    | either24([1, 2, 3, 2, 2, 4, 4]) → false |
    | either24([1, 2])                → false |
    | either24([2, 2])                → true  |
    | either24([4, 4])                → true  |
    | either24([2])                   → false |
    | either24([])                    → false |
    |________________________________________*/

    public static final boolean either24(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Either24.Validate(true);  // pass 'false' to print failed tests only.
    }
}
