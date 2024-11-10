package Logic1;
import Logic1.Testcases._In1To10;

// https://codingbat.com/prob/p137365
// Difficulty: 121.0

public final class In1To10
{
    /* Given a number n, return true if n is in the range 1..10, 
    inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, 
    or greater or equal to 10. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | n (int) | outsideMode |  returns  |
    |         |  (boolean)  | (boolean) |
    |_________|_____________|___________|
    |    5    |    false    |    true   |
    |    11   |    false    |   false   |
    |    11   |     true    |    true   |
    |    10   |    false    |    true   |
    |    10   |     true    |    true   |
    |    9    |    false    |    true   |
    |    9    |     true    |   false   |
    |    1    |    false    |    true   |
    |    1    |     true    |    true   |
    |    0    |    false    |   false   |
    |    0    |     true    |    true   |
    |    -1   |    false    |   false   |
    |    -1   |     true    |    true   |
    |    99   |    false    |   false   |
    |   -99   |     true    |    true   |
    |_________|_____________|__________*/

    public static final boolean in1To10(int n, boolean outsideMode)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_In1To10.printSuccesses = false;  // set 'false' to print failing tests only.
        //_In1To10.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _In1To10.Validate();
    }
}
