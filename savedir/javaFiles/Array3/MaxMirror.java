// https://codingbat.com/prob/p196409
package Array3;
import Array3.Testcases._MaxMirror;

public class MaxMirror
{
    /* We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, 
    the same group appears in reverse order. For example, the largest mirror section in {1, 
    2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). 
    Return the size of the largest mirror section found in the given array. */

    /*_________________________________________
    |                Testcases                |
    |_________________________________________|
    | maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3 |
    | maxMirror([1, 2, 1, 4])             → 3 |
    | maxMirror([7, 1, 2, 9, 7, 2, 1])    → 2 |
    |________________________________________*/

    public static int maxMirror(int[] nums)
    {
        
    }

    public static void main(String[] args) {
        _MaxMirror.Validate(true);  // pass 'false' to print failed tests only.
    }
}
