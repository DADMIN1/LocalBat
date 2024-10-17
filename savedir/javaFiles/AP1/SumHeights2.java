// https://codingbat.com/prob/p157900
package AP1;
import AP1.Testcases._SumHeights2;

public class SumHeights2
{
    /* (A variation on the sumHeights problem.) We have an array of heights, 
    representing the altitude along a walking trail. Given start/end indexes into the array, 
    return the sum of the changes for a walk beginning at the start index and ending at the end index, 
    however increases in height count double. For example, with the heights {5, 
    3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. 
    The start end end index will both be valid indexes into the array with start <= end. */

    // sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
    // sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
    // sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15

    public static int sumHeights2(int[] heights, int start, int end)
    {
        
    }

    public static void main(String[] args) {
        _SumHeights2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
