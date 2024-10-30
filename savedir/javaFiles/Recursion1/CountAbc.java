package Recursion1;
import Recursion1.Testcases._CountAbc;

// https://codingbat.com/prob/p161124
// Difficulty: 366.0

public final class CountAbc
{
    /* Count recursively the total number of "abc" and "aba" substrings that appear in the given string. */

    /*______________________
    |       Testcases       |
    |_______________________|
    | str        | expected |
    | (String)   | (int)    |
    |____________|__________|
    | "abc"      | 1        |
    | "abcxxabc" | 2        |
    | "abaxxaba" | 2        |
    | "ababc"    | 2        |
    | "abxbc"    | 0        |
    | "aaabc"    | 1        |
    | "hello"    | 0        |
    | ""         | 0        |
    | "ab"       | 0        |
    | "aba"      | 1        |
    | "aca"      | 0        |
    | "aaa"      | 0        |
    |____________|_________*/

    public static final int countAbc(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountAbc.Validate(true);  // pass 'false' to print failed tests only.
    }
}
