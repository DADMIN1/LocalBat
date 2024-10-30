package Array1;
import Array1.Testcases._MiddleWay;

// https://codingbat.com/prob/p146449
// Difficulty: 130.0

public final class MiddleWay
{
    /* Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | a (int[])   | b (int[])   | expected |
    |             |             | (int[])  |
    |_____________|_____________|__________|
    | { 1, 2, 3 } | { 4, 5, 6 } | {2, 5}   |
    | { 7, 7, 7 } | { 3, 8, 0 } | {7, 8}   |
    | { 5, 2, 9 } | { 1, 4, 5 } | {2, 4}   |
    | { 1, 9, 7 } | { 4, 8, 8 } | {9, 8}   |
    | { 1, 2, 3 } | { 3, 1, 4 } | {2, 1}   |
    | { 1, 2, 3 } | { 4, 1, 1 } | {2, 1}   |
    |_____________|_____________|_________*/

    public static final int[] middleWay(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _MiddleWay.Validate(true);  // pass 'false' to print failed tests only.
    }
}
