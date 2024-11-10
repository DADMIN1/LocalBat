package Warmup1;
import Warmup1.Testcases._BackAround;

// https://codingbat.com/prob/p161642
// Difficulty: 139.0

public final class BackAround
{
    /* Given a string, take the last char and return a new string with the last char added at the front and back, 
    so "cat" yields "tcatt". The original string will be length 1 or more. */

    /*_____________________
    |      Testcases       |
    |______________________|
    |   str    |  returns  |
    | (String) |  (String) |
    |__________|___________|
    |  "cat"   |  "tcatt"  |
    | "Hello"  | "oHelloo" |
    |   "a"    |   "aaa"   |
    |  "abc"   |  "cabcc"  |
    |  "read"  |  "dreadd" |
    |  "boo"   |  "obooo"  |
    |__________|__________*/

    public static final String backAround(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_BackAround.printSuccesses = false;  // set 'false' to print failing tests only.
        //_BackAround.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _BackAround.Validate();
    }
}
