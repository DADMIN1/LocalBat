package Array2;
import Array2.Testcases._ZeroFront;

// https://codingbat.com/prob/p193753
// Difficulty: 281.0

public class ZeroFront
{
    /* Return an array that contains the exact same numbers as the given array, 
    but rearranged so that all the zeros are grouped at the start of the array. 
    The order of the non-zero numbers does not matter. So {1, 
    0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array. */

    /*___________________________________________________
    |                     Testcases                      |
    |____________________________________________________|
    | zeroFront([1, 0, 0, 1])       → [0, 0, 1, 1]       |
    | zeroFront([0, 1, 1, 0, 1])    → [0, 0, 1, 1, 1]    |
    | zeroFront([1, 0])             → [0, 1]             |
    | zeroFront([0, 1])             → [0, 1]             |
    | zeroFront([1, 1, 1, 0])       → [0, 1, 1, 1]       |
    | zeroFront([2, 2, 2, 2])       → [2, 2, 2, 2]       |
    | zeroFront([0, 0, 1, 0])       → [0, 0, 0, 1]       |
    | zeroFront([-1, 0, 0, -1, 0])  → [0, 0, 0, -1, -1]  |
    | zeroFront([0, -3, 0, -3])     → [0, 0, -3, -3]     |
    | zeroFront([])                 → []                 |
    | zeroFront([9, 9, 0, 9, 0, 9]) → [0, 0, 9, 9, 9, 9] |
    |___________________________________________________*/

    public static int[] zeroFront(int[] nums)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _ZeroFront.Validate(true);  // pass 'false' to print failed tests only.
    }
}
