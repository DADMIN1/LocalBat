package Array1;
import Array1.Testcases._PlusTwo;

// https://codingbat.com/prob/p180840
// Difficulty: 160.0

public final class PlusTwo
{
    /* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | a (int[]) | b (int[]) |   returns    |
    |           |           |   (int[])    |
    |___________|___________|______________|
    | {1, 2}    | {3, 4}    | {1, 2, 3, 4} |
    | {4, 4}    | {2, 2}    | {4, 4, 2, 2} |
    | {9, 2}    | {3, 4}    | {9, 2, 3, 4} |
    |___________|___________|_____________*/

    public static final int[] plusTwo(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_PlusTwo.printSuccesses = false;  // set 'false' to print failing tests only.
        //_PlusTwo.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _PlusTwo.Validate();
    }
}
