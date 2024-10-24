package Recursion1;
import Recursion1.Testcases._CountAbc;

// https://codingbat.com/prob/p161124
// Difficulty: 366.0

public class CountAbc
{
    /* Count recursively the total number of "abc" and "aba" substrings that appear in the given string. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | countAbc("abc")      → 1 |
    | countAbc("abcxxabc") → 2 |
    | countAbc("abaxxaba") → 2 |
    | countAbc("ababc")    → 2 |
    | countAbc("abxbc")    → 0 |
    | countAbc("aaabc")    → 1 |
    | countAbc("hello")    → 0 |
    | countAbc("")         → 0 |
    | countAbc("ab")       → 0 |
    | countAbc("aba")      → 1 |
    | countAbc("aca")      → 0 |
    | countAbc("aaa")      → 0 |
    |_________________________*/

    public static int countAbc(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _CountAbc.Validate(true);  // pass 'false' to print failed tests only.
    }
}
