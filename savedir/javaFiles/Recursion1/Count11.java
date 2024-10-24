package Recursion1;
import Recursion1.Testcases._Count11;

// https://codingbat.com/prob/p167015
// Difficulty: 369.0

public class Count11
{
    /* Given a string, compute recursively (no loops) the number of "11" substrings in the string. 
    The "11" substrings should not overlap. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    | count11("11abc11")     → 2 |
    | count11("abc11x11x11") → 3 |
    | count11("111")         → 1 |
    | count11("1111")        → 2 |
    | count11("1")           → 0 |
    | count11("")            → 0 |
    | count11("hi")          → 0 |
    | count11("11x111x1111") → 4 |
    | count11("1x111")       → 1 |
    | count11("1Hello1")     → 0 |
    | count11("Hello")       → 0 |
    |___________________________*/

    public static int count11(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _Count11.Validate(true);  // pass 'false' to print failed tests only.
    }
}
