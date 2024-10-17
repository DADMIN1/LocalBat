// https://codingbat.com/prob/p108997
package Recursion1;
import Recursion1.Testcases._Array6;

public class Array6
{
    /* Given an array of ints, compute recursively if the array contains a 6. 
    We'll use the convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. */

    /*______________________________
    |          Testcases           |
    ________________________________
    | array6([1, 6, 4], 0) → true  |
    | array6([1, 4], 0)    → false |
    | array6([6], 0)       → true  |
    ______________________________*/

    public static boolean array6(int[] nums, int index)
    {
        
    }

    public static void main(String[] args) {
        _Array6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
