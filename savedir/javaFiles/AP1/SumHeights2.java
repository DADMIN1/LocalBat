package AP1;
import AP1.Testcases._SumHeights2;

// https://codingbat.com/prob/p157900
// Difficulty: 246.1

public final class SumHeights2
{
    /* (A variation on the sumHeights problem.) We have an array of heights, 
    representing the altitude along a walking trail. Given start/end indexes into the array, 
    return the sum of the changes for a walk beginning at the start index and ending at the end index, 
    however increases in height count double. For example, with the heights {5, 
    3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. 
    The start end end index will both be valid indexes into the array with start <= end. */

    /*__________________________________________________________
    |                         Testcases                         |
    |___________________________________________________________|
    | heights (int[])                | start | end   | expected |
    |                                | (int) | (int) | (int)    |
    |________________________________|_______|_______|__________|
    | { 5, 3, 6, 7, 2 }              | 2     | 4     | 7        |
    | { 5, 3, 6, 7, 2 }              | 0     | 1     | 2        |
    | { 5, 3, 6, 7, 2 }              | 0     | 4     | 15       |
    | { 5, 3, 6, 7, 2 }              | 1     | 1     | 0        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 0     | 3     | 6        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 4     | 8     | 19       |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 7     | 8     | 16       |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 8     | 8     | 0        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 2     | 2     | 0        |
    | { 1, 2, 3, 4, 5, 4, 3, 2, 10 } | 3     | 6     | 4        |
    | { 10, 8, 7, 7, 7, 6, 7 }       | 1     | 4     | 1        |
    | { 10, 8, 7, 7, 7, 6, 7 }       | 1     | 5     | 2        |
    |________________________________|_______|_______|_________*/

    public static final int sumHeights2(int[] heights, int start, int end)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _SumHeights2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
