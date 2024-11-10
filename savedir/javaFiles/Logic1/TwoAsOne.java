package Logic1;
import Logic1.Testcases._TwoAsOne;

// https://codingbat.com/prob/p113261
// Difficulty: 136.0

public final class TwoAsOne
{
    /* Given three ints, a b c, return true if it is possible to add two of the ints to get the third. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | a (int) | b (int) | c (int) |  returns  |
    |         |         |         | (boolean) |
    |_________|_________|_________|___________|
    |    1    |    2    |    3    |    true   |
    |    3    |    1    |    2    |    true   |
    |    3    |    2    |    2    |   false   |
    |    2    |    3    |    1    |    true   |
    |    5    |    3    |    -2   |    true   |
    |    5    |    3    |    -3   |   false   |
    |    2    |    5    |    3    |    true   |
    |    9    |    5    |    5    |   false   |
    |    9    |    4    |    5    |    true   |
    |    5    |    4    |    9    |    true   |
    |    3    |    3    |    0    |    true   |
    |    3    |    3    |    2    |   false   |
    |_________|_________|_________|__________*/

    public static final boolean twoAsOne(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_TwoAsOne.printSuccesses = false;  // set 'false' to print failing tests only.
        //_TwoAsOne.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _TwoAsOne.Validate();
    }
}
