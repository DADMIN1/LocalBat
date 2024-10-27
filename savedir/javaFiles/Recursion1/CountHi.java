package Recursion1;
import Recursion1.Testcases._CountHi;

// https://codingbat.com/prob/p184029
// Difficulty: 333.0

public final class CountHi
{
    /* Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | countHi("xxhixx")         → 1 |
    | countHi("xhixhix")        → 2 |
    | countHi("hi")             → 1 |
    | countHi("hihih")          → 2 |
    | countHi("h")              → 0 |
    | countHi("")               → 0 |
    | countHi("ihihihihih")     → 4 |
    | countHi("ihihihihihi")    → 5 |
    | countHi("hiAAhi12hi")     → 3 |
    | countHi("xhixhxihihhhih") → 3 |
    | countHi("ship")           → 1 |
    |______________________________*/

    public static final int countHi(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountHi.Validate(true);  // pass 'false' to print failed tests only.
    }
}
