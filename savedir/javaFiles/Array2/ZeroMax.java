// https://codingbat.com/prob/p187050
package Array2;
import Array2.Testcases._ZeroMax;

public class ZeroMax
{
    /* Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. 
    If there is no odd value to the right of the zero, leave the zero as a zero. */

    // zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    // zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    // zeroMax([0, 1, 0]) → [1, 1, 0]

    public static int[] zeroMax(int[] nums)
    {
        
    }

    public static void main(String[] args) {
        _ZeroMax.Validate(true);  // pass 'false' to print failed tests only.
    }
}
