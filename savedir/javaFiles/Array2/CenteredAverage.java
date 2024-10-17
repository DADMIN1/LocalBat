// https://codingbat.com/prob/p136585
package Array2;
import Array2.Testcases._CenteredAverage;

public class CenteredAverage
{
    /* Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
    except ignoring the largest and smallest values in the array. 
    If there are multiple copies of the smallest value, ignore just one copy, 
    and likewise for the largest value. Use int division to produce the final average. 
    You may assume that the array is length 3 or more. */

    /*________________________________________________
    |                   Testcases                    |
    __________________________________________________
    | centeredAverage([1, 2, 3, 4, 100])        → 3  |
    | centeredAverage([1, 1, 5, 5, 10, 8, 7])   → 5  |
    | centeredAverage([-10, -4, -2, -4, -2, 0]) → -3 |
    ________________________________________________*/

    public static int centeredAverage(int[] nums)
    {
        
    }

    public static void main(String[] args) {
        _CenteredAverage.Validate(true);  // pass 'false' to print failed tests only.
    }
}
