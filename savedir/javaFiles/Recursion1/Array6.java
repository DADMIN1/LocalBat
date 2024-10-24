package Recursion1;
import Recursion1.Testcases._Array6;

// https://codingbat.com/prob/p108997
// Difficulty: 345.0

public class Array6
{
    /* Given an array of ints, compute recursively if the array contains a 6. 
    We'll use the convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | array6([1, 6, 4], 0)       → true  |
    | array6([1, 4], 0)          → false |
    | array6([6], 0)             → true  |
    | array6([], 0)              → false |
    | array6([6, 2, 2], 0)       → true  |
    | array6([2, 5], 0)          → false |
    | array6([1, 9, 4, 6, 6], 0) → true  |
    | array6([2, 5, 6], 0)       → true  |
    |___________________________________*/

    public static boolean array6(int[] nums, int index)
    {
        return false;
    }

    public static void main(String[] args) {
        _Array6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
