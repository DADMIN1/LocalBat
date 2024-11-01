package Array1;
import Array1.Testcases._SwapEnds;

// https://codingbat.com/prob/p118044
// Difficulty: 163.0

public final class SwapEnds
{
    /* Given an array of ints, swap the first and last elements in the array. 
    Return the modified array. The array length will be at least 1. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | nums (int[])       | expected (int[])   |
    |____________________|____________________|
    | {1, 2, 3, 4}       | {4, 2, 3, 1}       |
    | {1, 2, 3}          | {3, 2, 1}          |
    | {8, 6, 7, 9, 5}    | {5, 6, 7, 9, 8}    |
    | {3, 1, 4, 1, 5, 9} | {9, 1, 4, 1, 5, 3} |
    | {1, 2}             | {2, 1}             |
    | {1}                | {1}                |
    |____________________|___________________*/

    public static final int[] swapEnds(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _SwapEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
