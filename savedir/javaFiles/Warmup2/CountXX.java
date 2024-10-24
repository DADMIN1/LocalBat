package Warmup2;
import Warmup2.Testcases._CountXX;

// https://codingbat.com/prob/p194667
// Difficulty: 207.0

public class CountXX
{
    /* Count the number of "xx" in the given string. We'll say that overlapping is allowed, 
    so "xxx" contains 2 "xx". */

    /*___________________________
    |         Testcases          |
    |____________________________|
    | countXX("abcxx")       → 1 |
    | countXX("xxx")         → 2 |
    | countXX("xxxx")        → 3 |
    | countXX("abc")         → 0 |
    | countXX("Hello there") → 0 |
    | countXX("Hexxo thxxe") → 2 |
    | countXX("")            → 0 |
    | countXX("Kittens")     → 0 |
    | countXX("Kittensxxx")  → 2 |
    |___________________________*/

    public static int countXX(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _CountXX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
