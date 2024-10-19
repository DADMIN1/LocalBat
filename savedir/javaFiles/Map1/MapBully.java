// https://codingbat.com/prob/p197888
package Map1;
import Map1.Testcases._MapBully;

import java.util.Map;
import java.util.HashMap;

public class MapBully
{
    /* Modify and return the given map as follows: if the key "a" has a value, 
    set the key "b" to have that value, and set the key "a" to have the value "". 
    Basically "b" is a bully, taking the value and replacing it with the empty string. */

    /*___________________________________________________________________________________________
    |                                         Testcases                                         |
    |___________________________________________________________________________________________|
    | mapBully({"a": "candy", "b": "dirt"})               → {"a": "", "b": "candy"}             |
    | mapBully({"a": "candy"})                            → {"a": "", "b": "candy"}             |
    | mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"} |
    |__________________________________________________________________________________________*/

    public static Map<String, String> mapBully(Map<String, String> map)
    {
        
    }

    public static void main(String[] args) {
        _MapBully.Validate(true);  // pass 'false' to print failed tests only.
    }
}
