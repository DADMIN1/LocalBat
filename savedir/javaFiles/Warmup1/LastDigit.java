package Warmup1;
import Warmup1.Testcases._LastDigit;

// https://codingbat.com/prob/p125339
// Difficulty: 184.0

public final class LastDigit
{
    /* Given two non-negative int values, return true if they have the same last digit, 
    such as with 27 and 57. Note that the % "mod" operator computes remainders, 
    so 17 % 10 is 7. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | a (int) | b (int) |  returns  |
    |         |         | (boolean) |
    |_________|_________|___________|
    |    7    |    17   |    true   |
    |    6    |    17   |   false   |
    |    3    |   113   |    true   |
    |   114   |   113   |   false   |
    |   114   |    4    |    true   |
    |    10   |    0    |    true   |
    |    11   |    0    |   false   |
    |_________|_________|__________*/

    public static final boolean lastDigit(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_LastDigit.printSuccesses = false;  // set 'false' to print failing tests only.
        //_LastDigit.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _LastDigit.Validate();
    }
}
