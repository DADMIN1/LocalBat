package Array2;
import Array2.Testcases._No14;

// https://codingbat.com/prob/p136648
// Difficulty: 233.0

public class No14
{
    /* Given an array of ints, return true if it contains no 1's or it contains no 4's. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    | no14([1, 2, 3])    → true  |
    | no14([1, 2, 3, 4]) → false |
    | no14([2, 3, 4])    → true  |
    | no14([1, 1, 4, 4]) → false |
    | no14([2, 2, 4, 4]) → true  |
    | no14([2, 3, 4, 1]) → false |
    | no14([2, 1, 1])    → true  |
    | no14([1, 4])       → false |
    | no14([2])          → true  |
    | no14([2, 1])       → true  |
    | no14([1])          → true  |
    | no14([4])          → true  |
    | no14([])           → true  |
    | no14([1, 1, 1, 1]) → true  |
    | no14([9, 4, 4, 1]) → false |
    | no14([4, 2, 3, 1]) → false |
    | no14([4, 2, 3, 5]) → true  |
    | no14([4, 4, 2])    → true  |
    | no14([1, 4, 4])    → false |
    |___________________________*/

    public static boolean no14(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _No14.Validate(true);  // pass 'false' to print failed tests only.
    }
}
