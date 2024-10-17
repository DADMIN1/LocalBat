// https://codingbat.com/prob/p154048
package Recursion1;
import Recursion1.Testcases._CountPairs;

public class CountPairs
{
    /* We'll say that a "pair" in a string is two instances of a char separated by a char. 
    So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. 
    Recursively compute the number of pairs in the given string. */

    /*________________________
    |       Testcases        |
    __________________________
    | countPairs("axa")  → 1 |
    | countPairs("axax") → 2 |
    | countPairs("axbx") → 1 |
    ________________________*/

    public static int countPairs(String str)
    {
        
    }

    public static void main(String[] args) {
        _CountPairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
