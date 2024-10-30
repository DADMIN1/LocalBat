package Recursion1;
import Recursion1.Testcases._CountPairs;

// https://codingbat.com/prob/p154048
// Difficulty: 363.0

public final class CountPairs
{
    /* We'll say that a "pair" in a string is two instances of a char separated by a char. 
    So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. 
    Recursively compute the number of pairs in the given string. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | str      | expected |
    | (String) | (int)    |
    |__________|__________|
    | "axa"    | 1        |
    | "axax"   | 2        |
    | "axbx"   | 1        |
    | "hi"     | 0        |
    | "hihih"  | 3        |
    | "ihihhh" | 3        |
    | "ihjxhh" | 0        |
    | ""       | 0        |
    | "a"      | 0        |
    | "aa"     | 0        |
    | "aaa"    | 1        |
    |__________|_________*/

    public static final int countPairs(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountPairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
