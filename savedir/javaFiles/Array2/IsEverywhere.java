// https://codingbat.com/prob/p110222
package Array2;
import Array2.Testcases._IsEverywhere;

public class IsEverywhere
{
    /* We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
    at least one of the pair is that value. Return true if the given value is everywhere in the array. */

    // isEverywhere([1, 2, 1, 3], 1) → true
    // isEverywhere([1, 2, 1, 3], 2) → false
    // isEverywhere([1, 2, 1, 3, 4], 1) → false

    public static boolean isEverywhere(int[] nums, int val)
    {
        
    }

    public static void main(String[] args) {
        _IsEverywhere.Validate(true);  // pass 'false' to print failed tests only.
    }
}
