package AP1;
import AP1.Testcases._SumHeights;

// https://codingbat.com/prob/p148138
// Difficulty: 246

public final class SumHeights
{
    /* We have an array of heights, representing the altitude along a walking trail. 
    Given start/end indexes into the array, 
    return the sum of the changes for a walk beginning at the start index and ending at the end index. 
    For example, with the heights {5, 3, 6, 7, 2} and start=2, 
    end=4 yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array with start <= end. */

    /*__________________________________________________________
    |                         Testcases                         |
    |___________________________________________________________|
    | heights (int[])                | start | end   | expected |
    |                                | (int) | (int) | (int)    |
    |________________________________|_______|_______|__________|
    | { 5, 3, 6, 7, 2 }              | 2     | 4     | 6        |
    | { 5, 3, 6, 7, 2 }              | 0     | 1     | 2        |
    | { 5, 3, 6, 7, 2 }              | 0     | 4     | 11       |
    | { 5, 3, 6, 7, 2 }              | 1     | 1     | 0        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 0     | 3     | 3        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 4     | 8     | 11       |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 7     | 8     | 8        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 8     | 8     | 0        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 2     | 2     | 0        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 3     | 6     | 3        |
    | { 10, 8, 7, 7, 7, 6, 7 }       | 1     | 4     | 1        |
    | { 10, 8, 7, 7, 7, 6, 7 }       | 1     | 5     | 2        |
    |________________________________|_______|_______|_________*/

    public static final int sumHeights(int[] heights, int start, int end)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _SumHeights.Validate(true);  // pass 'false' to print failed tests only.
    }
}
