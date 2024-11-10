package Map1;
import Map1.Testcases._MapAB;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p107259
// Difficulty: 209

public final class MapAB
{
    /* Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. 
    If both keys are present, append their 2 string values together and store the result under the key "ab". */

    /*__________________________________________________________________________________________________________
    |                                                 Testcases                                                 |
    |___________________________________________________________________________________________________________|
    |             map (Map<String, String>)              |            returns (Map<String, String>)             |
    |____________________________________________________|______________________________________________________|
    | {"a": "Hi", "b": "There"}                          | {"a": "Hi", "ab": "HiThere", "b": "There"}           |
    | {"a": "Hi"}                                        | {"a": "Hi"}                                          |
    | {"b": "There"}                                     | {"b": "There"}                                       |
    | {"c": "meh"}                                       | {"c": "meh"}                                         |
    | {"a": "aaa", "ab": "nope", "b": "bbb", "c": "ccc"} | {"a": "aaa", "ab": "aaabbb", "b": "bbb", "c": "ccc"} |
    | {"ab": "nope", "b": "bbb", "c": "ccc"}             | {"ab": "nope", "b": "bbb", "c": "ccc"}               |
    |____________________________________________________|_____________________________________________________*/

    public static final Map<String, String> mapAB(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        //_MapAB.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MapAB.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MapAB.Validate();
    }
}
