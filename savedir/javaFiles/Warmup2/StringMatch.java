package Warmup2;
import Warmup2.Testcases._StringMatch;

// https://codingbat.com/prob/p198640
// Difficulty: 227.0

public final class StringMatch
{
    /* Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
    and "az" substrings appear in the same place in both strings. */

    /*_______________________________________
    |               Testcases                |
    |________________________________________|
    | stringMatch("xxcaazz", "xxbaaz")   → 3 |
    | stringMatch("abc", "abc")          → 2 |
    | stringMatch("abc", "axc")          → 0 |
    | stringMatch("hello", "he")         → 1 |
    | stringMatch("he", "hello")         → 1 |
    | stringMatch("h", "hello")          → 0 |
    | stringMatch("", "hello")           → 0 |
    | stringMatch("aabbccdd", "abbbxxd") → 1 |
    | stringMatch("aaxxaaxx", "iaxxai")  → 3 |
    | stringMatch("iaxxai", "aaxxaaxx")  → 3 |
    |_______________________________________*/

    public static final int stringMatch(String a, String b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _StringMatch.Validate(true);  // pass 'false' to print failed tests only.
    }
}
