package Map2;
import Map2.Testcases._WordLen;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p125327
// Difficulty: 306

public class WordLen
{
    /* Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, 
    and the value is that string's length. */

    /*____________________________________________________________________________
    |                                  Testcases                                  |
    |_____________________________________________________________________________|
    | wordLen(["a", "bb", "a", "bb"])          → {"bb": 2, "a": 1}                |
    | wordLen(["this", "and", "that", "and"])  → {"that": 4, "and": 3, "this": 4} |
    | wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}            |
    | wordLen([])                              → {}                               |
    | wordLen(["z"])                           → {"z": 1}                         |
    |____________________________________________________________________________*/

    public static Map<String, Integer> wordLen(String[] strings)
    {
        return new HashMap<String, Integer>();
    }

    public static void main(String[] args) {
        _WordLen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
