package Logic1;
import Logic1.Testcases._Less20;

// https://codingbat.com/prob/p133158
// Difficulty: 123.8

public final class Less20
{
    /* Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
    So for example 38 and 39 return true, but 40 returns false. 
    See also: Introduction to Mod */

    /*____________________
    |      Testcases      |
    |_____________________|
    | n (int) |  returns  |
    |         | (boolean) |
    |_________|___________|
    |    18   |    true   |
    |    19   |    true   |
    |    20   |   false   |
    |    8    |   false   |
    |    17   |   false   |
    |    23   |   false   |
    |    25   |   false   |
    |    30   |   false   |
    |    31   |   false   |
    |    58   |    true   |
    |    59   |    true   |
    |    60   |   false   |
    |    61   |   false   |
    |    62   |   false   |
    |   1017  |   false   |
    |   1018  |    true   |
    |   1019  |    true   |
    |   1020  |   false   |
    |   1021  |   false   |
    |   1022  |   false   |
    |   1023  |   false   |
    |    37   |   false   |
    |_________|__________*/

    public static final boolean less20(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_Less20.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Less20.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Less20.Validate();
    }
}
