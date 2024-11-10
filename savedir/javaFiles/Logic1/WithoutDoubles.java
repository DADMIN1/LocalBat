package Logic1;
import Logic1.Testcases._WithoutDoubles;

// https://codingbat.com/prob/p115233
// Difficulty: 151.0

public final class WithoutDoubles
{
    /* Return the sum of two 6-sided dice rolls, each in the range 1..6. 
    However, if noDoubles is true, if the two dice show the same value, 
    increment one die to the next value, wrapping around to 1 if its value was 6. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    |  die1 |  die2 | noDoubles | returns |
    | (int) | (int) | (boolean) |  (int)  |
    |_______|_______|___________|_________|
    |   2   |   3   |    true   |    5    |
    |   3   |   3   |    true   |    7    |
    |   3   |   3   |   false   |    6    |
    |   2   |   3   |   false   |    5    |
    |   5   |   4   |    true   |    9    |
    |   5   |   4   |   false   |    9    |
    |   5   |   5   |    true   |    11   |
    |   5   |   5   |   false   |    10   |
    |   6   |   6   |    true   |    7    |
    |   6   |   6   |   false   |    12   |
    |   1   |   6   |    true   |    7    |
    |   6   |   1   |   false   |    7    |
    |_______|_______|___________|________*/

    public static final int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_WithoutDoubles.printSuccesses = false;  // set 'false' to print failing tests only.
        //_WithoutDoubles.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _WithoutDoubles.Validate();
    }
}
