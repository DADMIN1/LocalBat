// https://codingbat.com/prob/p169506
package Array2;
import Array2.Testcases._NotAlone;

public class NotAlone
{
    /* We'll say that an element in an array is "alone" if there are values before and after it, 
    and those values are different from it. 
    Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger. */

    /*______________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    | notAlone([1, 2, 3], 2)          → [1, 3, 3]          |
    | notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2] |
    | notAlone([3, 4], 3)             → [3, 4]             |
    |_____________________________________________________*/

    public static int[] notAlone(int[] nums, int val)
    {
        
    }

    public static void main(String[] args) {
        _NotAlone.Validate(true);  // pass 'false' to print failed tests only.
    }
}
