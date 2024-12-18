package Warmup2;
import Warmup2.Testcases._DoubleX;

// https://codingbat.com/prob/p186759
// Difficulty: 208.0

public final class DoubleX
{
    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". */

    /*_____________________
    |      Testcases       |
    |______________________|
    |   str    |  returns  |
    | (String) | (boolean) |
    |__________|___________|
    | "axxbb"  |    true   |
    | "axaxax" |   false   |
    | "xxxxx"  |    true   |
    | "xaxxx"  |   false   |
    | "aaaax"  |   false   |
    |    ""    |   false   |
    |  "abc"   |   false   |
    |   "x"    |   false   |
    |   "xx"   |    true   |
    |  "xax"   |   false   |
    |  "xaxx"  |   false   |
    |__________|__________*/

    public static final boolean doubleX(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_DoubleX.printSuccesses = false;  // set 'false' to print failing tests only.
        //_DoubleX.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _DoubleX.Validate();
    }
}
