// https://codingbat.com/prob/p135988
package Recursion1;
import Recursion1.Testcases._Array11;

public class Array11
{
    /* Given an array of ints, compute recursively the number of times that the value 11 appears in the array. 
    We'll use the convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | array11([1, 2, 11], 0)   → 1 |
    | array11([11, 11], 0)     → 2 |
    | array11([1, 2, 3, 4], 0) → 0 |
    |_____________________________*/

    public static int array11(int[] nums, int index)
    {
        
    }

    public static void main(String[] args) {
        _Array11.Validate(true);  // pass 'false' to print failed tests only.
    }
}
