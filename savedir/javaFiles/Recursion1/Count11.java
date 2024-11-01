package Recursion1;
import Recursion1.Testcases._Count11;

// https://codingbat.com/prob/p167015
// Difficulty: 369.0

public final class Count11
{
    /* Given a string, compute recursively (no loops) the number of "11" substrings in the string. 
    The "11" substrings should not overlap. */

    /*________________________
    |        Testcases        |
    |_________________________|
    |  str (String) | returns |
    |               |  (int)  |
    |_______________|_________|
    |   "11abc11"   |    2    |
    | "abc11x11x11" |    3    |
    |     "111"     |    1    |
    |     "1111"    |    2    |
    |      "1"      |    0    |
    |       ""      |    0    |
    |      "hi"     |    0    |
    | "11x111x1111" |    4    |
    |    "1x111"    |    1    |
    |   "1Hello1"   |    0    |
    |    "Hello"    |    0    |
    |_______________|________*/

    public static final int count11(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Count11.Validate(true);  // pass 'false' to print failed tests only.
    }
}
