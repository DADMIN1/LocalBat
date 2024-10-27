package Map1;
import Map1.Testcases._MapAB3;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115012
// Difficulty: 224

public final class MapAB3
{
    /* Modify and return the given map as follows: 
    if exactly one of the keys "a" or "b" has a value in the map (but not both), 
    set the other to have that same value in the map. */

    /*______________________________________________________________________________________________________
    |                                               Testcases                                               |
    |_______________________________________________________________________________________________________|
    | mapAB3({"a": "aaa", "c": "cake"})              → {"a": "aaa", "b": "aaa", "c": "cake"}                |
    | mapAB3({"b": "bbb", "c": "cake"})              → {"a": "bbb", "b": "bbb", "c": "cake"}                |
    | mapAB3({"a": "aaa", "b": "bbb", "c": "cake"})  → {"a": "aaa", "b": "bbb", "c": "cake"}                |
    | mapAB3({"ccc": "ccc"})                         → {"ccc": "ccc"}                                       |
    | mapAB3({"c": "a", "d": "b"})                   → {"c": "a", "d": "b"}                                 |
    | mapAB3({})                                     → {}                                                   |
    | mapAB3({"a": ""})                              → {"a": "", "b": ""}                                   |
    | mapAB3({"b": ""})                              → {"a": "", "b": ""}                                   |
    | mapAB3({"a": "", "b": ""})                     → {"a": "", "b": ""}                                   |
    | mapAB3({"aa": "aa", "a": "apple", "z": "zzz"}) → {"aa": "aa", "a": "apple", "b": "apple", "z": "zzz"} |
    |______________________________________________________________________________________________________*/

    public static final Map<String, String> mapAB3(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
