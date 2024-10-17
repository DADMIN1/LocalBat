// https://codingbat.com/prob/p173469
package Recursion1;
import Recursion1.Testcases._Array220;

public class Array220
{
    /* Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. 
    We'll use the convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. */

    /*_________________________________
    |            Testcases            |
    |_________________________________|
    | array220([1, 2, 20], 0) → true  |
    | array220([3, 30], 0)    → true  |
    | array220([3], 0)        → false |
    |________________________________*/

    public static boolean array220(int[] nums, int index)
    {
        
    }

    public static void main(String[] args) {
        _Array220.Validate(true);  // pass 'false' to print failed tests only.
    }
}
