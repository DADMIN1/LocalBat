package String2;
import String2.Testcases._CountHi;

// https://codingbat.com/prob/p147448
// Difficulty: 206.0

public final class CountHi
{
    /* Return the number of times that the string "hi" appears anywhere in the given string. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | str (String)         | expected |
    |                      | (int)    |
    |______________________|__________|
    | "abc hi ho"          | 1        |
    | "ABChi hi"           | 2        |
    | "hihi"               | 2        |
    | "hiHIhi"             | 2        |
    | ""                   | 0        |
    | "h"                  | 0        |
    | "hi"                 | 1        |
    | "Hi is no HI on ahI" | 0        |
    | "hiho not HOHIhi"    | 2        |
    |______________________|_________*/

    public static final int countHi(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountHi.Validate(true);  // pass 'false' to print failed tests only.
    }
}
