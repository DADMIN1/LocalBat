package Warmup1;
import Warmup1.Testcases._IcyHot;

// https://codingbat.com/prob/p192082
// Difficulty: 148.0

public final class IcyHot
{
    /* Given two temperatures, return true if one is less than 0 and the other is greater than 100. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | temp1 | temp2 |  returns  |
    | (int) | (int) | (boolean) |
    |_______|_______|___________|
    |  120  |   -1  |    true   |
    |   -1  |  120  |    true   |
    |   2   |  120  |   false   |
    |   -1  |  100  |   false   |
    |   -2  |   -2  |   false   |
    |  120  |  120  |   false   |
    |_______|_______|__________*/

    public static final boolean icyHot(int temp1, int temp2)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_IcyHot.printSuccesses = false;  // set 'false' to print failing tests only.
        //_IcyHot.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _IcyHot.Validate();
    }
}
