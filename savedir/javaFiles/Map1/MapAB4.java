package Map1;
import Map1.Testcases._MapAB4;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136950
// Difficulty: 227

public final class MapAB4
{
    /* Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, 
    then set "c" to have the longer value. If the values exist and have the same length, 
    change them both to the empty string in the map. */

    /*____________________________________________________________________________________
    |                                      Testcases                                      |
    |_____________________________________________________________________________________|
    | mapAB4({"a": "aaa", "b": "bb", "c": "cake"})  → {"a": "aaa", "b": "bb", "c": "aaa"} |
    | mapAB4({"a": "aa", "b": "bbb", "c": "cake"})  → {"a": "aa", "b": "bbb", "c": "bbb"} |
    | mapAB4({"a": "aa", "b": "bbb"})               → {"a": "aa", "b": "bbb", "c": "bbb"} |
    | mapAB4({"a": "aaa"})                          → {"a": "aaa"}                        |
    | mapAB4({"b": "bbb"})                          → {"b": "bbb"}                        |
    | mapAB4({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "", "b": "", "c": "cake"}     |
    | mapAB4({"a": "a", "b": "b", "c": "cake"})     → {"a": "", "b": "", "c": "cake"}     |
    | mapAB4({"a": "", "b": "b", "c": "cake"})      → {"a": "", "b": "b", "c": "b"}       |
    | mapAB4({"a": "a", "b": "", "c": "cake"})      → {"a": "a", "b": "", "c": "a"}       |
    | mapAB4({"c": "cat", "d": "dog"})              → {"c": "cat", "d": "dog"}            |
    | mapAB4({"ccc": "ccc"})                        → {"ccc": "ccc"}                      |
    | mapAB4({"c": "a", "d": "b"})                  → {"c": "a", "d": "b"}                |
    | mapAB4({})                                    → {}                                  |
    | mapAB4({"a": "", "z": "z"})                   → {"a": "", "z": "z"}                 |
    | mapAB4({"b": "", "z": "z"})                   → {"b": "", "z": "z"}                 |
    |____________________________________________________________________________________*/

    public static final Map<String, String> mapAB4(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB4.Validate(true);  // pass 'false' to print failed tests only.
    }
}
