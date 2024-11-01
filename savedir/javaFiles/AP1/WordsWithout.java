package AP1;
import AP1.Testcases._WordsWithout;

// https://codingbat.com/prob/p121236
// Difficulty: 242.0

public final class WordsWithout
{
    /* Given an array of strings, return a new array without the strings that are equal to the target string. 
    One approach is to count the occurrences of the target string, 
    make a new array of the correct length, and then copy over the correct strings. */

    /*___________________________________________________________________
    |                             Testcases                              |
    |____________________________________________________________________|
    |        words (String[])       |  target  |    returns (String[])   |
    |                               | (String) |                         |
    |_______________________________|__________|_________________________|
    | {"a", "b", "c", "a"}          |   "a"    | {"b", "c"}              |
    | {"a", "b", "c", "a"}          |   "b"    | {"a", "c", "a"}         |
    | {"a", "b", "c", "a"}          |   "c"    | {"a", "b", "a"}         |
    | {"b", "c", "a", "a"}          |   "b"    | {"c", "a", "a"}         |
    | {"xx", "yyy", "x", "yy", "x"} |   "x"    | {"xx", "yyy", "yy"}     |
    | {"xx", "yyy", "x", "yy", "x"} |   "yy"   | {"xx", "yyy", "x", "x"} |
    | {"aa", "ab", "ac", "aa"}      |   "aa"   | {"ab", "ac"}            |
    |_______________________________|__________|________________________*/

    public static final String[] wordsWithout(String[] words, String target)
    {
        return new String[]{""};
    }

    public static final void main(String[] args) {
        _WordsWithout.Validate(true);  // pass 'false' to print failed tests only.
    }
}
