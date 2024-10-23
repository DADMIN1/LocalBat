// https://codingbat.com/prob/p148813
package Map1;
import Map1.Testcases._MapShare;

import java.util.Map;

public class MapShare
{
    /* Modify and return the given map as follows: if the key "a" has a value, 
    set the key "b" to have that same value. In all cases remove the key "c", 
    leaving the rest of the map unchanged. */

    /*_____________________________________________________________________________________
    |                                      Testcases                                       |
    |______________________________________________________________________________________|
    | mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}            |
    | mapShare({"b": "xyz", "c": "ccc"})             → {"b": "xyz"}                        |
    | mapShare({"a": "aaa", "c": "meh", "d": "hi"})  → {"a": "aaa", "b": "aaa", "d": "hi"} |
    |_____________________________________________________________________________________*/

    public static Map<String, String> mapShare(Map<String, String> map)
    {
        
    }

    public static void main(String[] args) {
        _MapShare.Validate(true);  // pass 'false' to print failed tests only.
    }
}
