package Logic2;
import Logic2.Testcases._CloseFar;

// https://codingbat.com/prob/p138990
// Difficulty: 215.0

public final class CloseFar
{
    /* Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), 
    while the other is "far", differing from both other values by 2 or more. 
    Note: Math.abs(num) computes the absolute value of a number. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | a (int) | b (int) | c (int) |  returns  |
    |         |         |         | (boolean) |
    |_________|_________|_________|___________|
    |    1    |    2    |    10   |    true   |
    |    1    |    2    |    3    |   false   |
    |    4    |    1    |    3    |    true   |
    |    4    |    5    |    3    |   false   |
    |    4    |    3    |    5    |   false   |
    |    -1   |    10   |    0    |    true   |
    |    0    |    -1   |    10   |    true   |
    |    10   |    10   |    8    |    true   |
    |    10   |    8    |    9    |   false   |
    |    8    |    9    |    10   |   false   |
    |    8    |    9    |    7    |   false   |
    |    8    |    6    |    9    |    true   |
    |_________|_________|_________|__________*/

    public static final boolean closeFar(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_CloseFar.printSuccesses = false;  // set 'false' to print failing tests only.
        //_CloseFar.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _CloseFar.Validate();
    }
}
