package Map1;
import Map1.Testcases._MapAB;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p107259
// Difficulty: 209

public class MapAB
{
    /* Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. 
    If both keys are present, append their 2 string values together and store the result under the key "ab". */

    /*_________________________________________________________________________________________________________________
    |                                                    Testcases                                                     |
    |__________________________________________________________________________________________________________________|
    | mapAB({"a": "Hi", "b": "There"})                          → {"a": "Hi", "ab": "HiThere", "b": "There"}           |
    | mapAB({"a": "Hi"})                                        → {"a": "Hi"}                                          |
    | mapAB({"b": "There"})                                     → {"b": "There"}                                       |
    | mapAB({"c": "meh"})                                       → {"c": "meh"}                                         |
    | mapAB({"a": "aaa", "ab": "nope", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "ab": "aaabbb", "b": "bbb", "c": "ccc"} |
    | mapAB({"ab": "nope", "b": "bbb", "c": "ccc"})             → {"ab": "nope", "b": "bbb", "c": "ccc"}               |
    |_________________________________________________________________________________________________________________*/

    public static Map<String, String> mapAB(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static void main(String[] args) {
        _MapAB.Validate(true);  // pass 'false' to print failed tests only.
    }
}
