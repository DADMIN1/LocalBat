package Logic1;
import Logic1.Testcases._SortaSum;

// https://codingbat.com/prob/p183071
// Difficulty: 115.0

public final class SortaSum
{
    /* Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
    are forbidden, so in that case just return 20. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | a (int) | b (int) | returns |
    |         |         |  (int)  |
    |_________|_________|_________|
    |    3    |    4    |    7    |
    |    9    |    4    |    20   |
    |    10   |    11   |    21   |
    |    12   |    -3   |    9    |
    |    -3   |    12   |    9    |
    |    4    |    5    |    9    |
    |    4    |    6    |    20   |
    |    14   |    7    |    21   |
    |    14   |    6    |    20   |
    |_________|_________|________*/

    public static final int sortaSum(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_SortaSum.printSuccesses = false;  // set 'false' to print failing tests only.
        //_SortaSum.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _SortaSum.Validate();
    }
}
