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

    /*___________________________________________________________________
    |                             Testcases                              |
    |____________________________________________________________________|
    |        strings (String[])       |  returns (Map<String, Integer>)  |
    |_________________________________|__________________________________|
    | {"a", "bb", "a", "bb"}          | {"bb": 2, "a": 1}                |
    | {"this", "and", "that", "and"}  | {"that": 4, "and": 3, "this": 4} |
    | {"code", "code", "code", "bug"} | {"code": 4, "bug": 3}            |
    | {}                              | {}                               |
    | {"z"}                           | {"z": 1}                         |
    |_________________________________|_________________________________*/

    public static final Map<String, Integer> wordLen(String[] strings)
    {
        return new HashMap<String, Integer>();
    }

    public static final void main(String[] args) {
        _WordLen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
