package Warmup1;
import Warmup1.Testcases._Close10;

// https://codingbat.com/prob/p172021
// Difficulty: 172.0

public final class Close10
{
    /* Given 2 int values, return whichever value is nearest to the value 10, 
    or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | a (int) | b (int) | returns |
    |         |         |  (int)  |
    |_________|_________|_________|
    |    8    |    13   |    8    |
    |    13   |    8    |    8    |
    |    13   |    7    |    0    |
    |    7    |    13   |    0    |
    |    9    |    13   |    9    |
    |    13   |    8    |    8    |
    |    10   |    12   |    10   |
    |    11   |    10   |    10   |
    |    5    |    21   |    5    |
    |    0    |    20   |    0    |
    |    10   |    10   |    0    |
    |_________|_________|________*/

    public static final int close10(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_Close10.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Close10.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Close10.Validate();
    }
}
