package Map2;
import Map2.Testcases._WordLen;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p125327
// Difficulty: 306

public final class WordLen
{
    /* Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, 
    and the value is that string's length. */

    /*___________________________________________________________________________
    |                                 Testcases                                  |
    |____________________________________________________________________________|
    | strings (String[])                | expected (Map<String, Integer>)        |
    |___________________________________|________________________________________|
    | { "a", "bb", "a", "bb" }          | Map.of("bb", 2, "a", 1)                |
    | { "this", "and", "that", "and" }  | Map.of("that", 4, "and", 3, "this", 4) |
    | { "code", "code", "code", "bug" } | Map.of("code", 4, "bug", 3)            |
    | {  }                              | Map.of()                               |
    | { "z" }                           | Map.of("z", 1)                         |
    |___________________________________|_______________________________________*/

    public static final Map<String, Integer> wordLen(String[] strings)
    {
        return new HashMap<String, Integer>();
    }

    public static final void main(String[] args) {
        _WordLen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
