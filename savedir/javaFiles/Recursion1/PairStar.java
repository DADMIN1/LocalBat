package Recursion1;
import Recursion1.Testcases._PairStar;

// https://codingbat.com/prob/p158175
// Difficulty: 357.0

public final class PairStar
{
    /* Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*". */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | str (String) | expected     |
    |              | (String)     |
    |______________|______________|
    | "hello"      | "hel*lo"     |
    | "xxyy"       | "x*xy*y"     |
    | "aaaa"       | "a*a*a*a"    |
    | "aaab"       | "a*a*ab"     |
    | "aa"         | "a*a"        |
    | "a"          | "a"          |
    | ""           | ""           |
    | "noadjacent" | "noadjacent" |
    | "abba"       | "ab*ba"      |
    | "abbba"      | "ab*b*ba"    |
    |______________|_____________*/

    public static final String pairStar(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _PairStar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
