package Array1;
import Array1.Testcases._PlusTwo;

// https://codingbat.com/prob/p180840
// Difficulty: 160.0

public class PlusTwo
{
    /* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements. */

    /*_______________________________________
    |               Testcases                |
    |________________________________________|
    | plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4] |
    | plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2] |
    | plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4] |
    |_______________________________________*/

    public static int[] plusTwo(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _PlusTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
