// https://codingbat.com/prob/p104090
package Array3;
import Array3.Testcases._SeriesUp;

public class SeriesUp
{
    /* Given n>=0, create an array with the pattern {1,    1, 2, 
       1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). 
    Note that the length of the array will be 1 + 2 + 3 ... 
    + n, which is known to sum to exactly n*(n + 1)/2. */

    /*_____________________________________________
    |                  Testcases                   |
    |______________________________________________|
    | seriesUp(3) → [1, 1, 2, 1, 2, 3]             |
    | seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4] |
    | seriesUp(2) → [1, 1, 2]                      |
    |_____________________________________________*/

    public static int[] seriesUp(int n)
    {
        
    }

    public static void main(String[] args) {
        _SeriesUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
