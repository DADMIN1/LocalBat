package Array1;
import Array1.Testcases._Make2;

// https://codingbat.com/prob/p143461
// Difficulty: 178.0

public class Make2
{
    /* Given 2 int arrays, a and b, return a new array length 2 containing, 
    as much as will fit, the elements from a followed by the elements from b. 
    The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | make2([4, 5], [1, 2, 3]) → [4, 5] |
    | make2([4], [1, 2, 3])    → [4, 1] |
    | make2([], [1, 2])        → [1, 2] |
    | make2([1, 2], [])        → [1, 2] |
    | make2([3], [1, 2, 3])    → [3, 1] |
    | make2([3], [1])          → [3, 1] |
    | make2([3, 1, 4], [])     → [3, 1] |
    | make2([1], [1])          → [1, 1] |
    | make2([1, 2, 3], [7, 8]) → [1, 2] |
    | make2([7, 8], [1, 2, 3]) → [7, 8] |
    | make2([7], [1, 2, 3])    → [7, 1] |
    | make2([5, 4], [2, 3, 7]) → [5, 4] |
    |__________________________________*/

    public static int[] make2(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _Make2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
