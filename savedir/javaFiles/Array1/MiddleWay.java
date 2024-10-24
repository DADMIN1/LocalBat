package Array1;
import Array1.Testcases._MiddleWay;

// https://codingbat.com/prob/p146449
// Difficulty: 130.0

public class MiddleWay
{
    /* Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements. */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | middleWay([1, 2, 3], [4, 5, 6]) → [2, 5] |
    | middleWay([7, 7, 7], [3, 8, 0]) → [7, 8] |
    | middleWay([5, 2, 9], [1, 4, 5]) → [2, 4] |
    | middleWay([1, 9, 7], [4, 8, 8]) → [9, 8] |
    | middleWay([1, 2, 3], [3, 1, 4]) → [2, 1] |
    | middleWay([1, 2, 3], [4, 1, 1]) → [2, 1] |
    |_________________________________________*/

    public static int[] middleWay(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static void main(String[] args) {
        _MiddleWay.Validate(true);  // pass 'false' to print failed tests only.
    }
}
