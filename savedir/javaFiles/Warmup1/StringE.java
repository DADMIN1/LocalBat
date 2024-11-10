package Warmup1;
import Warmup1.Testcases._StringE;

// https://codingbat.com/prob/p173784
// Difficulty: 181.0

public final class StringE
{
    /* Return true if the given string contains between 1 and 3 'e' chars. */

    /*______________________
    |       Testcases       |
    |_______________________|
    |    str    |  returns  |
    |  (String) | (boolean) |
    |___________|___________|
    |  "Hello"  |    true   |
    |  "Heelle" |    true   |
    | "Heelele" |   false   |
    |   "Hll"   |   false   |
    |    "e"    |    true   |
    |     ""    |   false   |
    |___________|__________*/

    public static final boolean stringE(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_StringE.printSuccesses = false;  // set 'false' to print failing tests only.
        //_StringE.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _StringE.Validate();
    }
}
