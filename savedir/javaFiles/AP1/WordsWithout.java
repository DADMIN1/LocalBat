package AP1;
import AP1.Testcases._WordsWithout;

// https://codingbat.com/prob/p121236
// Difficulty: 242.0

public class WordsWithout
{
    /* Given an array of strings, return a new array without the strings that are equal to the target string. 
    One approach is to count the occurrences of the target string, 
    make a new array of the correct length, and then copy over the correct strings. */

    /*____________________________________________________________________________
    |                                  Testcases                                  |
    |_____________________________________________________________________________|
    | wordsWithout(["a", "b", "c", "a"], "a")           → ["b", "c"]              |
    | wordsWithout(["a", "b", "c", "a"], "b")           → ["a", "c", "a"]         |
    | wordsWithout(["a", "b", "c", "a"], "c")           → ["a", "b", "a"]         |
    | wordsWithout(["b", "c", "a", "a"], "b")           → ["c", "a", "a"]         |
    | wordsWithout(["xx", "yyy", "x", "yy", "x"], "x")  → ["xx", "yyy", "yy"]     |
    | wordsWithout(["xx", "yyy", "x", "yy", "x"], "yy") → ["xx", "yyy", "x", "x"] |
    | wordsWithout(["aa", "ab", "ac", "aa"], "aa")      → ["ab", "ac"]            |
    |____________________________________________________________________________*/

    public static String[] wordsWithout(String[] words, String target)
    {
        return new String[]{""};
    }

    public static void main(String[] args) {
        _WordsWithout.Validate(true);  // pass 'false' to print failed tests only.
    }
}
