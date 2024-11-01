package Recursion1;
import Recursion1.Testcases._StrCount;

// https://codingbat.com/prob/p186177
// Difficulty: 384.0

public final class StrCount
{
    /* Given a string and a non-empty substring sub, 
    compute recursively the number of times that sub appears in the string, 
    without the sub strings overlapping. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    |  str (String) |   sub    | returns |
    |               | (String) |  (int)  |
    |_______________|__________|_________|
    |  "catcowcat"  |  "cat"   |    2    |
    |  "catcowcat"  |  "cow"   |    1    |
    |  "catcowcat"  |  "dog"   |    0    |
    | "cacatcowcat" |  "cat"   |    2    |
    |     "xyx"     |   "x"    |    2    |
    |    "iiiijj"   |   "i"    |    4    |
    |    "iiiijj"   |   "ii"   |    2    |
    |    "iiiijj"   |  "iii"   |    1    |
    |    "iiiijj"   |   "j"    |    2    |
    |    "iiiijj"   |   "jj"   |    1    |
    |  "aaabababab" |   "ab"   |    4    |
    |  "aaabababab" |   "aa"   |    1    |
    |  "aaabababab" |   "a"    |    6    |
    |  "aaabababab" |   "b"    |    4    |
    |_______________|__________|________*/

    public static final int strCount(String str, String sub)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _StrCount.Validate(true);  // pass 'false' to print failed tests only.
    }
}
