package Map1;
import Map1.Testcases._MapShare;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p148813
// Difficulty: 206

public final class MapShare
{
    /* Modify and return the given map as follows: if the key "a" has a value, 
    set the key "b" to have that same value. In all cases remove the key "c", 
    leaving the rest of the map unchanged. */

    /*______________________________________________________________________________________________________________________________
    |                                                           Testcases                                                           |
    |_______________________________________________________________________________________________________________________________|
    |                      map (Map<String, String>)                      |              returns (Map<String, String>)              |
    |_____________________________________________________________________|_________________________________________________________|
    | {"a": "aaa", "b": "bbb", "c": "ccc"}                                | {"a": "aaa", "b": "aaa"}                                |
    | {"b": "xyz", "c": "ccc"}                                            | {"b": "xyz"}                                            |
    | {"a": "aaa", "c": "meh", "d": "hi"}                                 | {"a": "aaa", "b": "aaa", "d": "hi"}                     |
    | {"a": "xyz", "b": "1234", "c": "yo", "z": "zzz"}                    | {"a": "xyz", "b": "xyz", "z": "zzz"}                    |
    | {"a": "xyz", "b": "1234", "c": "yo", "d": "ddd", "e": "everything"} | {"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"} |
    |_____________________________________________________________________|________________________________________________________*/

    public static final Map<String, String> mapShare(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        //_MapShare.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MapShare.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MapShare.Validate();
    }
}
