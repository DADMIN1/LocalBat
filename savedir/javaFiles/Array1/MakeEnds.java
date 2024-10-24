package Array1;
import Array1.Testcases._MakeEnds;

// https://codingbat.com/prob/p101230
// Difficulty: 133.0

public class MakeEnds
{
    /* Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
    The original array will be length 1 or more. */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | makeEnds([1, 2, 3])                → [1, 3] |
    | makeEnds([1, 2, 3, 4])             → [1, 4] |
    | makeEnds([7, 4, 6, 2])             → [7, 2] |
    | makeEnds([1, 2, 2, 2, 2, 2, 2, 3]) → [1, 3] |
    | makeEnds([7, 4])                   → [7, 4] |
    | makeEnds([7])                      → [7, 7] |
    | makeEnds([5, 2, 9])                → [5, 9] |
    | makeEnds([2, 3, 4, 1])             → [2, 1] |
    |____________________________________________*/

    public static int[] makeEnds(int[] nums)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _MakeEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
