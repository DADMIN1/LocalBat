package Recursion1;
import Recursion1.Testcases._CountX;

// https://codingbat.com/prob/p170371
// Difficulty: 330.0

public final class CountX
{
    /* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string. */

    /*________________________
    |        Testcases        |
    |_________________________|
    | str (String) | expected |
    |              | (int)    |
    |______________|__________|
    | "xxhixx"     | 4        |
    | "xhixhix"    | 3        |
    | "hi"         | 0        |
    | "h"          | 0        |
    | "x"          | 1        |
    | ""           | 0        |
    | "hihi"       | 0        |
    | "hiAAhi12hi" | 0        |
    |______________|_________*/

    public static final int countX(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
