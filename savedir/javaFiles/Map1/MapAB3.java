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

    /*______________________________________________________________________________________________
    |                                           Testcases                                           |
    |_______________________________________________________________________________________________|
    |       map (Map<String, String>)        |            returns (Map<String, String>)             |
    |________________________________________|______________________________________________________|
    | {"a": "aaa", "c": "cake"}              | {"a": "aaa", "b": "aaa", "c": "cake"}                |
    | {"b": "bbb", "c": "cake"}              | {"a": "bbb", "b": "bbb", "c": "cake"}                |
    | {"a": "aaa", "b": "bbb", "c": "cake"}  | {"a": "aaa", "b": "bbb", "c": "cake"}                |
    | {"ccc": "ccc"}                         | {"ccc": "ccc"}                                       |
    | {"c": "a", "d": "b"}                   | {"c": "a", "d": "b"}                                 |
    | {}                                     | {}                                                   |
    | {"a": ""}                              | {"a": "", "b": ""}                                   |
    | {"b": ""}                              | {"a": "", "b": ""}                                   |
    | {"a": "", "b": ""}                     | {"a": "", "b": ""}                                   |
    | {"aa": "aa", "a": "apple", "z": "zzz"} | {"aa": "aa", "a": "apple", "b": "apple", "z": "zzz"} |
    |________________________________________|_____________________________________________________*/

    public static final Map<String, String> mapAB3(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
