package Logic2;
import Logic2.Testcases._Blackjack;

// https://codingbat.com/prob/p117019
// Difficulty: 218.0

public final class Blackjack
{
    /* Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
    Return 0 if they both go over. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | a (int) | b (int) | returns |
    |         |         |  (int)  |
    |_________|_________|_________|
    |    19   |    21   |    21   |
    |    21   |    19   |    21   |
    |    19   |    22   |    19   |
    |    22   |    19   |    19   |
    |    22   |    50   |    0    |
    |    22   |    22   |    0    |
    |    33   |    1    |    1    |
    |    1    |    2    |    2    |
    |    34   |    33   |    0    |
    |    17   |    19   |    19   |
    |    18   |    17   |    18   |
    |    16   |    23   |    16   |
    |    3    |    4    |    4    |
    |    3    |    2    |    3    |
    |    21   |    20   |    21   |
    |_________|_________|________*/

    public static final int blackjack(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_Blackjack.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Blackjack.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Blackjack.Validate();
    }
}
