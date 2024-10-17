// https://codingbat.com/prob/p130124
package AP1;
import AP1.Testcases._CopyEndy;

public class CopyEndy
{
    /* We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). 
    Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. 
    Decompose out a separate isEndy(int n) method to test if a number is endy. 
    The original array will contain at least "count" endy numbers. */

    /*_________________________________________________
    |                    Testcases                    |
    ___________________________________________________
    | copyEndy([9, 11, 90, 22, 6], 2)    → [9, 90]    |
    | copyEndy([9, 11, 90, 22, 6], 3)    → [9, 90, 6] |
    | copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]     |
    _________________________________________________*/

    public static int[] copyEndy(int[] nums, int count)
    {
        
    }

    public static void main(String[] args) {
        _CopyEndy.Validate(true);  // pass 'false' to print failed tests only.
    }
}
