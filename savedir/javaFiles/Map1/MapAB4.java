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

    /*____________________________________________________________________________
    |                                  Testcases                                  |
    |_____________________________________________________________________________|
    | map (Map<String, String>)             | expected (Map<String, String>)      |
    |_______________________________________|_____________________________________|
    | {"a": "aaa", "b": "bb", "c": "cake"}  | {"a": "aaa", "b": "bb", "c": "aaa"} |
    | {"a": "aa", "b": "bbb", "c": "cake"}  | {"a": "aa", "b": "bbb", "c": "bbb"} |
    | {"a": "aa", "b": "bbb"}               | {"a": "aa", "b": "bbb", "c": "bbb"} |
    | {"a": "aaa"}                          | {"a": "aaa"}                        |
    | {"b": "bbb"}                          | {"b": "bbb"}                        |
    | {"a": "aaa", "b": "bbb", "c": "cake"} | {"a": "", "b": "", "c": "cake"}     |
    | {"a": "a", "b": "b", "c": "cake"}     | {"a": "", "b": "", "c": "cake"}     |
    | {"a": "", "b": "b", "c": "cake"}      | {"a": "", "b": "b", "c": "b"}       |
    | {"a": "a", "b": "", "c": "cake"}      | {"a": "a", "b": "", "c": "a"}       |
    | {"c": "cat", "d": "dog"}              | {"c": "cat", "d": "dog"}            |
    | {"ccc": "ccc"}                        | {"ccc": "ccc"}                      |
    | {"c": "a", "d": "b"}                  | {"c": "a", "d": "b"}                |
    | {}                                    | {}                                  |
    | {"a": "", "z": "z"}                   | {"a": "", "z": "z"}                 |
    | {"b": "", "z": "z"}                   | {"b": "", "z": "z"}                 |
    |_______________________________________|____________________________________*/

    public static final Map<String, String> mapAB4(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB4.Validate(true);  // pass 'false' to print failed tests only.
    }
}
