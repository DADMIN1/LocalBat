package Array2;
import Array2.Testcases._Pre4;

// https://codingbat.com/prob/p100246
// Difficulty: 272.0

public class Pre4
{
    /* Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. 
    The original array will contain at least one 4. Note that it is valid in java to create an array of length 0. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | pre4([1, 2, 4, 1])       → [1, 2]       |
    | pre4([3, 1, 4])          → [3, 1]       |
    | pre4([1, 4, 4])          → [1]          |
    | pre4([1, 4, 4, 2])       → [1]          |
    | pre4([1, 3, 4, 2, 4])    → [1, 3]       |
    | pre4([4, 4])             → []           |
    | pre4([3, 3, 4])          → [3, 3]       |
    | pre4([1, 2, 1, 4])       → [1, 2, 1]    |
    | pre4([2, 1, 4, 2])       → [2, 1]       |
    | pre4([2, 1, 2, 1, 4, 2]) → [2, 1, 2, 1] |
    |________________________________________*/

    public static int[] pre4(int[] nums)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _Pre4.Validate(true);  // pass 'false' to print failed tests only.
    }
}
