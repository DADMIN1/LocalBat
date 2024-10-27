package Array2;
import Array2.Testcases._SameEnds;

// https://codingbat.com/prob/p134300
// Difficulty: 260.0

public final class SameEnds
{
    /* Return true if the group of N numbers at the start and end of the array are the same. 
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, 
    and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive. */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    | sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false |
    | sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true  |
    | sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false |
    | sameEnds([1, 2, 5, 2, 1], 1)          → true  |
    | sameEnds([1, 2, 5, 2, 1], 2)          → false |
    | sameEnds([1, 2, 5, 2, 1], 0)          → true  |
    | sameEnds([1, 2, 5, 2, 1], 5)          → true  |
    | sameEnds([1, 1, 1], 0)                → true  |
    | sameEnds([1, 1, 1], 1)                → true  |
    | sameEnds([1, 1, 1], 2)                → true  |
    | sameEnds([1, 1, 1], 3)                → true  |
    | sameEnds([1], 1)                      → true  |
    | sameEnds([], 0)                       → true  |
    | sameEnds([4, 2, 4, 5], 1)             → false |
    |______________________________________________*/

    public static final boolean sameEnds(int[] nums, int len)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SameEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
