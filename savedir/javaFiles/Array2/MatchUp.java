package Array2;
import Array2.Testcases._MatchUp;

// https://codingbat.com/prob/p136254
// Difficulty: 242.0

public class MatchUp
{
    /* Given arrays nums1 and nums2 of the same length, for every element in nums1, 
    consider the corresponding element in nums2 (at the same index). 
    Return the count of the number of times that the two elements differ by 2 or less, 
    but are not equal. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | matchUp([1, 2, 3], [2, 3, 10]) → 2 |
    | matchUp([1, 2, 3], [2, 3, 5])  → 3 |
    | matchUp([1, 2, 3], [2, 3, 3])  → 2 |
    | matchUp([5, 3], [5, 5])        → 1 |
    | matchUp([5, 3], [4, 4])        → 2 |
    | matchUp([5, 3], [3, 3])        → 1 |
    | matchUp([5, 3], [2, 2])        → 1 |
    | matchUp([5, 3], [1, 1])        → 1 |
    | matchUp([5, 3], [0, 0])        → 0 |
    | matchUp([4], [4])              → 0 |
    | matchUp([4], [5])              → 1 |
    |___________________________________*/

    public static int matchUp(int[] nums1, int[] nums2)
    {
        return 0;
    }

    public static void main(String[] args) {
        _MatchUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
