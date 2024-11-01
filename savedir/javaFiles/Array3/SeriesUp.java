package Array3;
import Array3.Testcases._SeriesUp;

// https://codingbat.com/prob/p104090
// Difficulty: 321.0

public final class SeriesUp
{
    /* Given n>=0, create an array with the pattern {1,    1, 2, 
       1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). 
    Note that the length of the array will be 1 + 2 + 3 ... 
    + n, which is known to sum to exactly n*(n + 1)/2. */

    /*__________________________________________________________________________
    |                                 Testcases                                 |
    |___________________________________________________________________________|
    | n (int) |                         returns (int[])                         |
    |_________|_________________________________________________________________|
    |    3    | {1, 1, 2, 1, 2, 3}                                              |
    |    4    | {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}                                  |
    |    2    | {1, 1, 2}                                                       |
    |    1    | {1}                                                             |
    |    0    | {}                                                              |
    |    6    | {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6} |
    |_________|________________________________________________________________*/

    public static final int[] seriesUp(int n)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _SeriesUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
