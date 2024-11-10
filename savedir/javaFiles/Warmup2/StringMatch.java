package Warmup2;
import Warmup2.Testcases._StringMatch;

// https://codingbat.com/prob/p198640
// Difficulty: 227.0

public final class StringMatch
{
    /* Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
    and "az" substrings appear in the same place in both strings. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | a (String) | b (String) | returns |
    |            |            |  (int)  |
    |____________|____________|_________|
    | "xxcaazz"  |  "xxbaaz"  |    3    |
    |   "abc"    |   "abc"    |    2    |
    |   "abc"    |   "axc"    |    0    |
    |  "hello"   |    "he"    |    1    |
    |    "he"    |  "hello"   |    1    |
    |    "h"     |  "hello"   |    0    |
    |     ""     |  "hello"   |    0    |
    | "aabbccdd" | "abbbxxd"  |    1    |
    | "aaxxaaxx" |  "iaxxai"  |    3    |
    |  "iaxxai"  | "aaxxaaxx" |    3    |
    |____________|____________|________*/

    public static final int stringMatch(String a, String b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_StringMatch.printSuccesses = false;  // set 'false' to print failing tests only.
        //_StringMatch.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _StringMatch.Validate();
    }
}
