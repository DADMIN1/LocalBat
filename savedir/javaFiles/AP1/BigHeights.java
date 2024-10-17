// https://codingbat.com/prob/p197710
package AP1;
import AP1.Testcases._BigHeights;

public class BigHeights
{
    /* (A variation on the sumHeights problem.) We have an array of heights, 
    representing the altitude along a walking trail. Given start/end indexes into the array, 
    return the number of "big" steps for a walk starting at the start index and ending at the end index. 
    We'll say that step is big if it is 5 or more up or down. 
    The start end end index will both be valid indexes into the array with start <= end. */

    /*_______________________________________
    |               Testcases               |
    _________________________________________
    | bigHeights([5, 3, 6, 7, 2], 2, 4) → 1 |
    | bigHeights([5, 3, 6, 7, 2], 0, 1) → 0 |
    | bigHeights([5, 3, 6, 7, 2], 0, 4) → 1 |
    _______________________________________*/

    public static int bigHeights(int[] heights, int start, int end)
    {
        
    }

    public static void main(String[] args) {
        _BigHeights.Validate(true);  // pass 'false' to print failed tests only.
    }
}
