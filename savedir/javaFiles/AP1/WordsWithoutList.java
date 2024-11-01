package AP1;
import AP1.Testcases._WordsWithoutList;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p183407
// Difficulty: 221.0

public final class WordsWithoutList
{
    /* Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. 
    See wordsWithout() below which is more difficult because it uses arrays. */

    /*__________________________________________________________________
    |                             Testcases                             |
    |___________________________________________________________________|
    | words (String[])                | len   | expected (List)         |
    |                                 | (int) |                         |
    |_________________________________|_______|_________________________|
    | { "a", "bb", "b", "ccc" }       | 1     | ["bb", "ccc"]           |
    | { "a", "bb", "b", "ccc" }       | 3     | ["a", "bb", "b"]        |
    | { "a", "bb", "b", "ccc" }       | 4     | ["a", "bb", "b", "ccc"] |
    | { "xx", "yyy", "x", "yy", "z" } | 1     | ["xx", "yyy", "yy"]     |
    | { "xx", "yyy", "x", "yy", "z" } | 2     | ["yyy", "x", "z"]       |
    |_________________________________|_______|________________________*/

    public static final List wordsWithoutList(String[] words, int len)
    {
        return new ArrayList();
    }

    public static final void main(String[] args) {
        _WordsWithoutList.Validate(true);  // pass 'false' to print failed tests only.
    }
}
