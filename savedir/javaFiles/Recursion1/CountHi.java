package Recursion1;
import Recursion1.Testcases._CountHi;

// https://codingbat.com/prob/p184029
// Difficulty: 333.0

public final class CountHi
{
    /* Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | str (String)     | expected |
    |                  | (int)    |
    |__________________|__________|
    | "xxhixx"         | 1        |
    | "xhixhix"        | 2        |
    | "hi"             | 1        |
    | "hihih"          | 2        |
    | "h"              | 0        |
    | ""               | 0        |
    | "ihihihihih"     | 4        |
    | "ihihihihihi"    | 5        |
    | "hiAAhi12hi"     | 3        |
    | "xhixhxihihhhih" | 3        |
    | "ship"           | 1        |
    |__________________|_________*/

    public static final int countHi(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountHi.Validate(true);  // pass 'false' to print failed tests only.
    }
}
