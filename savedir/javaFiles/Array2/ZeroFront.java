// https://codingbat.com/prob/p193753
package Array2;
import Array2.Testcases._ZeroFront;

public class ZeroFront
{
    /* Return an array that contains the exact same numbers as the given array, 
    but rearranged so that all the zeros are grouped at the start of the array. 
    The order of the non-zero numbers does not matter. So {1, 
    0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array. */

    /*_____________________________________________
    |                  Testcases                   |
    |______________________________________________|
    | zeroFront([1, 0, 0, 1])    → [0, 0, 1, 1]    |
    | zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1] |
    | zeroFront([1, 0])          → [0, 1]          |
    |_____________________________________________*/

    public static int[] zeroFront(int[] nums)
    {
        
    }

    public static void main(String[] args) {
        _ZeroFront.Validate(true);  // pass 'false' to print failed tests only.
    }
}
