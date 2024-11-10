package Logic2;
import Logic2.Testcases._MakeChocolate;

// https://codingbat.com/prob/p191363
// Difficulty: 224.0

public final class MakeChocolate
{
    /* We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
    Return the number of small bars to use, assuming we always use big bars before small bars. 
    Return -1 if it can't be done. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | small |   big   |   goal  | returns |
    | (int) |  (int)  |  (int)  |  (int)  |
    |_______|_________|_________|_________|
    |   4   |    1    |    9    |    4    |
    |   4   |    1    |    10   |    -1   |
    |   4   |    1    |    7    |    2    |
    |   6   |    2    |    7    |    2    |
    |   4   |    1    |    5    |    0    |
    |   4   |    1    |    4    |    4    |
    |   5   |    4    |    9    |    4    |
    |   9   |    3    |    18   |    3    |
    |   3   |    1    |    9    |    -1   |
    |   1   |    2    |    7    |    -1   |
    |   1   |    2    |    6    |    1    |
    |   1   |    2    |    5    |    0    |
    |   6   |    1    |    10   |    5    |
    |   6   |    1    |    11   |    6    |
    |   6   |    1    |    12   |    -1   |
    |   6   |    1    |    13   |    -1   |
    |   6   |    2    |    10   |    0    |
    |   6   |    2    |    11   |    1    |
    |   6   |    2    |    12   |    2    |
    |   60  |   100   |   550   |    50   |
    |  1000 | 1000000 | 5000006 |    6    |
    |   7   |    1    |    12   |    7    |
    |   7   |    1    |    13   |    -1   |
    |   7   |    2    |    13   |    3    |
    |_______|_________|_________|________*/

    public static final int makeChocolate(int small, int big, int goal)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_MakeChocolate.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MakeChocolate.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MakeChocolate.Validate();
    }
}
