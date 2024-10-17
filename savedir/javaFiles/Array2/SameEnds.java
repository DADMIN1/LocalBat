// https://codingbat.com/prob/p134300
package Array2;
import Array2.Testcases._SameEnds;

public class SameEnds
{
    /* Return true if the group of N numbers at the start and end of the array are the same. 
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, 
    and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive. */

    // sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    // sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    // sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false

    public static boolean sameEnds(int[] nums, int len)
    {
        
    }

    public static void main(String[] args) {
        _SameEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
