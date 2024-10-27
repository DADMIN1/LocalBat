package Array2;
import Array2.Testcases._Lucky13;

// https://codingbat.com/prob/p194525
// Difficulty: 221.0

public final class Lucky13
{
    /* Given an array of ints, return true if the array contains no 1's and no 3's. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | lucky13([0, 2, 4])    → true  |
    | lucky13([1, 2, 3])    → false |
    | lucky13([1, 2, 4])    → false |
    | lucky13([2, 7, 2, 8]) → true  |
    | lucky13([2, 7, 1, 8]) → false |
    | lucky13([3, 7, 2, 8]) → false |
    | lucky13([2, 7, 2, 1]) → false |
    | lucky13([1, 2])       → false |
    | lucky13([2, 2])       → true  |
    | lucky13([2])          → true  |
    | lucky13([3])          → false |
    | lucky13([])           → true  |
    |______________________________*/

    public static final boolean lucky13(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Lucky13.Validate(true);  // pass 'false' to print failed tests only.
    }
}
