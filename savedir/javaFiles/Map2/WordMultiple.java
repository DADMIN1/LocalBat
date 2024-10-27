package Map2;
import Map2.Testcases._WordMultiple;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p190862
// Difficulty: 360

public final class WordMultiple
{
    /* Given an array of strings, return a Map<String, 
    Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array. */

    /*____________________________________________________________________________________________________________________________________________________________
    |                                                                          Testcases                                                                          |
    |_____________________________________________________________________________________________________________________________________________________________|
    | wordMultiple(["a", "b", "a", "c", "b"])                                              → {"a": true, "b": true, "c": false}                                   |
    | wordMultiple(["c", "b", "a"])                                                        → {"a": false, "b": false, "c": false}                                 |
    | wordMultiple(["c", "c", "c", "c"])                                                   → {"c": true}                                                          |
    | wordMultiple([])                                                                     → {}                                                                   |
    | wordMultiple(["this", "and", "this"])                                                → {"and": false, "this": true}                                         |
    | wordMultiple(["d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"]) → {"a": true, "b": true, "d": true, "e": false, "x": false, "z": true} |
    |____________________________________________________________________________________________________________________________________________________________*/

    public static final Map<String, Boolean> wordMultiple(String[] strings)
    {
        return new HashMap<String, Boolean>();
    }

    public static final void main(String[] args) {
        _WordMultiple.Validate(true);  // pass 'false' to print failed tests only.
    }
}
