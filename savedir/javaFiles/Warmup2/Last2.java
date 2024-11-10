package Warmup2;
import Warmup2.Testcases._Last2;

// https://codingbat.com/prob/p178318
// Difficulty: 215.0

public final class Last2
{
    /* Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, 
    so "hixxxhi" yields 1 (we won't count the end substring). */

    /*________________________
    |        Testcases        |
    |_________________________|
    |  str (String) | returns |
    |               |  (int)  |
    |_______________|_________|
    |    "hixxhi"   |    1    |
    |  "xaxxaxaxx"  |    1    |
    |   "axxxaaxx"  |    2    |
    | "xxaxxaxxaxx" |    3    |
    |   "xaxaxaxx"  |    0    |
    |     "xxxx"    |    2    |
    |   "13121312"  |    1    |
    |    "11212"    |    1    |
    |   "13121311"  |    0    |
    |   "1717171"   |    2    |
    |      "hi"     |    0    |
    |      "h"      |    0    |
    |       ""      |    0    |
    |_______________|________*/

    public static final int last2(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_Last2.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Last2.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Last2.Validate();
    }
}
