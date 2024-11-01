package Recursion1;
import Recursion1.Testcases._CountHi2;

// https://codingbat.com/prob/p143900
// Difficulty: 375.0

public final class CountHi2
{
    /* Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
    however do not count "hi" that have an 'x' immedately before them. */

    /*_____________________
    |      Testcases       |
    |______________________|
    |    str     | returns |
    |  (String)  |  (int)  |
    |____________|_________|
    |  "ahixhi"  |    1    |
    |  "ahibhi"  |    2    |
    |  "xhixhi"  |    0    |
    |  "hixhi"   |    1    |
    |  "hixhhi"  |    2    |
    |  "hihihi"  |    3    |
    | "hihihix"  |    3    |
    | "xhihihix" |    2    |
    |   "xxhi"   |    0    |
    |  "hixxhi"  |    1    |
    |    "hi"    |    1    |
    |   "xxxx"   |    0    |
    |    "h"     |    0    |
    |    "x"     |    0    |
    |     ""     |    0    |
    | "Hellohi"  |    1    |
    |____________|________*/

    public static final int countHi2(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountHi2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
