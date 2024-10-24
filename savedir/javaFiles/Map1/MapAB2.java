package Map1;
import Map1.Testcases._MapAB2;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115011
// Difficulty: 221

public class MapAB2
{
    /* Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, 
    remove them both. */

    /*_____________________________________________________________________________________
    |                                      Testcases                                       |
    |______________________________________________________________________________________|
    | mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}                        |
    | mapAB2({"a": "aaa", "b": "bbb"})              → {"a": "aaa", "b": "bbb"}             |
    | mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"})  → {"a": "aaa", "b": "bbb", "c": "aaa"} |
    | mapAB2({"a": "aaa"})                          → {"a": "aaa"}                         |
    | mapAB2({"b": "bbb"})                          → {"b": "bbb"}                         |
    | mapAB2({"a": "", "b": "", "c": "ccc"})        → {"c": "ccc"}                         |
    | mapAB2({})                                    → {}                                   |
    | mapAB2({"a": "a", "b": "b", "z": "zebra"})    → {"a": "a", "b": "b", "z": "zebra"}   |
    |_____________________________________________________________________________________*/

    public static Map<String, String> mapAB2(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static void main(String[] args) {
        _MapAB2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
