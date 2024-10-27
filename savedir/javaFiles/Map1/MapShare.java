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

    /*________________________________________________________________________________________________________________________________________
    |                                                                Testcases                                                                |
    |_________________________________________________________________________________________________________________________________________|
    | mapShare({"a": "aaa", "b": "bbb", "c": "ccc"})                                → {"a": "aaa", "b": "aaa"}                                |
    | mapShare({"b": "xyz", "c": "ccc"})                                            → {"b": "xyz"}                                            |
    | mapShare({"a": "aaa", "c": "meh", "d": "hi"})                                 → {"a": "aaa", "b": "aaa", "d": "hi"}                     |
    | mapShare({"a": "xyz", "b": "1234", "c": "yo", "z": "zzz"})                    → {"a": "xyz", "b": "xyz", "z": "zzz"}                    |
    | mapShare({"a": "xyz", "b": "1234", "c": "yo", "d": "ddd", "e": "everything"}) → {"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"} |
    |________________________________________________________________________________________________________________________________________*/

    public static final Map<String, String> mapShare(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapShare.Validate(true);  // pass 'false' to print failed tests only.
    }
}
