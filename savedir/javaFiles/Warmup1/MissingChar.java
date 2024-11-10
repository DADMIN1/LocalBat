package Warmup1;
import Warmup1.Testcases._MissingChar;

// https://codingbat.com/prob/p190570
// Difficulty: 130.0

public final class MissingChar
{
    /* Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
    The value of n will be a valid index of a char in the original string (i.e. 
    n will be in the range 0..str.length()-1 inclusive). */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    |     str     | n (int) |  returns   |
    |   (String)  |         |  (String)  |
    |_____________|_________|____________|
    |   "kitten"  |    1    |  "ktten"   |
    |   "kitten"  |    0    |  "itten"   |
    |   "kitten"  |    4    |  "kittn"   |
    |     "Hi"    |    0    |    "i"     |
    |     "Hi"    |    1    |    "H"     |
    |    "code"   |    0    |   "ode"    |
    |    "code"   |    1    |   "cde"    |
    |    "code"   |    2    |   "coe"    |
    |    "code"   |    3    |   "cod"    |
    | "chocolate" |    8    | "chocolat" |
    |_____________|_________|___________*/

    public static final String missingChar(String str, int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_MissingChar.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MissingChar.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MissingChar.Validate();
    }
}
