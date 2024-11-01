package Array2;
import Array2.Testcases._TenRun;

// https://codingbat.com/prob/p199484
// Difficulty: 269.0

public final class TenRun
{
    /* For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
    until encountering another multiple of 10. So {2, 10, 3, 
    4, 20, 5} yields {2, 10, 10, 10, 20, 20}. */

    /*_______________________________________________
    |                   Testcases                    |
    |________________________________________________|
    |     nums (int[])     |     returns (int[])     |
    |______________________|_________________________|
    | {2, 10, 3, 4, 20, 5} | {2, 10, 10, 10, 20, 20} |
    | {10, 1, 20, 2}       | {10, 10, 20, 20}        |
    | {10, 1, 9, 20}       | {10, 10, 10, 20}        |
    | {1, 2, 50, 1}        | {1, 2, 50, 50}          |
    | {1, 20, 50, 1}       | {1, 20, 50, 50}         |
    | {10, 10}             | {10, 10}                |
    | {10, 2}              | {10, 10}                |
    | {0, 2}               | {0, 0}                  |
    | {1, 2}               | {1, 2}                  |
    | {1}                  | {1}                     |
    | {}                   | {}                      |
    |______________________|________________________*/

    public static final int[] tenRun(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _TenRun.Validate(true);  // pass 'false' to print failed tests only.
    }
}
