package Array3;
import Array3.Testcases._SeriesUp;

// https://codingbat.com/prob/p104090
// Difficulty: 321.0

public class SeriesUp
{
    /* Given n>=0, create an array with the pattern {1,    1, 2, 
       1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). 
    Note that the length of the array will be 1 + 2 + 3 ... 
    + n, which is known to sum to exactly n*(n + 1)/2. */

    /*______________________________________________________________________________
    |                                   Testcases                                   |
    |_______________________________________________________________________________|
    | seriesUp(3) → [1, 1, 2, 1, 2, 3]                                              |
    | seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]                                  |
    | seriesUp(2) → [1, 1, 2]                                                       |
    | seriesUp(1) → [1]                                                             |
    | seriesUp(0) → []                                                              |
    | seriesUp(6) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6] |
    |______________________________________________________________________________*/

    public static int[] seriesUp(int n)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _SeriesUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
