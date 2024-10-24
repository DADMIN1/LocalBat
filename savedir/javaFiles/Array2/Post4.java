package Array2;
import Array2.Testcases._Post4;

// https://codingbat.com/prob/p164144
// Difficulty: 275.0

public class Post4
{
    /* Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. 
    The original array will contain at least one 4. Note that it is valid in java to create an array of length 0. */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | post4([2, 4, 1, 2])       → [1, 2]    |
    | post4([4, 1, 4, 2])       → [2]       |
    | post4([4, 4, 1, 2, 3])    → [1, 2, 3] |
    | post4([4, 2])             → [2]       |
    | post4([4, 4, 3])          → [3]       |
    | post4([4, 4])             → []        |
    | post4([4])                → []        |
    | post4([2, 4, 1, 4, 3, 2]) → [3, 2]    |
    | post4([4, 1, 4, 2, 2, 2]) → [2, 2, 2] |
    | post4([3, 4, 3, 2])       → [3, 2]    |
    |______________________________________*/

    public static int[] post4(int[] nums)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _Post4.Validate(true);  // pass 'false' to print failed tests only.
    }
}
