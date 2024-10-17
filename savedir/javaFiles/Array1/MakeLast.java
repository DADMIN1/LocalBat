// https://codingbat.com/prob/p137188
package Array1;
import Array1.Testcases._MakeLast;

public class MakeLast
{
    /* Given an int array, return a new array with double the length where its last element is the same as the original array, 
    and all the other elements are 0. The original array will be length 1 or more. 
    Note: by default, a new int array contains all 0's. */

    /*__________________________________________
    |                Testcases                 |
    ____________________________________________
    | makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6] |
    | makeLast([1, 2])    → [0, 0, 0, 2]       |
    | makeLast([3])       → [0, 3]             |
    __________________________________________*/

    public static int[] makeLast(int[] nums)
    {
        
    }

    public static void main(String[] args) {
        _MakeLast.Validate(true);  // pass 'false' to print failed tests only.
    }
}
