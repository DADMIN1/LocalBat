package Array2;
import Array2.Testcases._TenRun;

// https://codingbat.com/prob/p199484
// Difficulty: 269.0

public final class TenRun
{
    /* For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
    until encountering another multiple of 10. So {2, 10, 3, 
    4, 20, 5} yields {2, 10, 10, 10, 20, 20}. */

    /*_______________________________________________________
    |                       Testcases                        |
    |________________________________________________________|
    | tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20] |
    | tenRun([10, 1, 20, 2])       → [10, 10, 20, 20]        |
    | tenRun([10, 1, 9, 20])       → [10, 10, 10, 20]        |
    | tenRun([1, 2, 50, 1])        → [1, 2, 50, 50]          |
    | tenRun([1, 20, 50, 1])       → [1, 20, 50, 50]         |
    | tenRun([10, 10])             → [10, 10]                |
    | tenRun([10, 2])              → [10, 10]                |
    | tenRun([0, 2])               → [0, 0]                  |
    | tenRun([1, 2])               → [1, 2]                  |
    | tenRun([1])                  → [1]                     |
    | tenRun([])                   → []                      |
    |_______________________________________________________*/

    public static final int[] tenRun(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _TenRun.Validate(true);  // pass 'false' to print failed tests only.
    }
}
