package Recursion1;
import Recursion1.Testcases._CountPairs;

// https://codingbat.com/prob/p154048
// Difficulty: 363.0

public final class CountPairs
{
    /* We'll say that a "pair" in a string is two instances of a char separated by a char. 
    So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. 
    Recursively compute the number of pairs in the given string. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | countPairs("axa")    → 1 |
    | countPairs("axax")   → 2 |
    | countPairs("axbx")   → 1 |
    | countPairs("hi")     → 0 |
    | countPairs("hihih")  → 3 |
    | countPairs("ihihhh") → 3 |
    | countPairs("ihjxhh") → 0 |
    | countPairs("")       → 0 |
    | countPairs("a")      → 0 |
    | countPairs("aa")     → 0 |
    | countPairs("aaa")    → 1 |
    |_________________________*/

    public static final int countPairs(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountPairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
