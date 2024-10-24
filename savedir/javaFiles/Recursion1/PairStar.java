package Recursion1;
import Recursion1.Testcases._PairStar;

// https://codingbat.com/prob/p158175
// Difficulty: 357.0

public class PairStar
{
    /* Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*". */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | pairStar("hello")      → "hel*lo"     |
    | pairStar("xxyy")       → "x*xy*y"     |
    | pairStar("aaaa")       → "a*a*a*a"    |
    | pairStar("aaab")       → "a*a*ab"     |
    | pairStar("aa")         → "a*a"        |
    | pairStar("a")          → "a"          |
    | pairStar("")           → ""           |
    | pairStar("noadjacent") → "noadjacent" |
    | pairStar("abba")       → "ab*ba"      |
    | pairStar("abbba")      → "ab*b*ba"    |
    |______________________________________*/

    public static String pairStar(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _PairStar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
