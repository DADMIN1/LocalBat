package Map1;
import Map1.Testcases._MapAB2;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115011
// Difficulty: 221

public final class MapAB2
{
    /* Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, 
    remove them both. */

    /*_____________________________________________________________________________
    |                                  Testcases                                   |
    |______________________________________________________________________________|
    |       map (Map<String, String>)       |    returns (Map<String, String>)     |
    |_______________________________________|______________________________________|
    | {"a": "aaa", "b": "aaa", "c": "cake"} | {"c": "cake"}                        |
    | {"a": "aaa", "b": "bbb"}              | {"a": "aaa", "b": "bbb"}             |
    | {"a": "aaa", "b": "bbb", "c": "aaa"}  | {"a": "aaa", "b": "bbb", "c": "aaa"} |
    | {"a": "aaa"}                          | {"a": "aaa"}                         |
    | {"b": "bbb"}                          | {"b": "bbb"}                         |
    | {"a": "", "b": "", "c": "ccc"}        | {"c": "ccc"}                         |
    | {}                                    | {}                                   |
    | {"a": "a", "b": "b", "z": "zebra"}    | {"a": "a", "b": "b", "z": "zebra"}   |
    |_______________________________________|_____________________________________*/

    public static final Map<String, String> mapAB2(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
