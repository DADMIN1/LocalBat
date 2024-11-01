package Map1;
import Map1.Testcases._MapBully;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p197888
// Difficulty: 203

public final class MapBully
{
    /* Modify and return the given map as follows: if the key "a" has a value, 
    set the key "b" to have that value, and set the key "a" to have the value "". 
    Basically "b" is a bully, taking the value and replacing it with the empty string. */

    /*__________________________________________________________________________________
    |                                     Testcases                                     |
    |___________________________________________________________________________________|
    |         map (Map<String, String>)         |     returns (Map<String, String>)     |
    |___________________________________________|_______________________________________|
    | {"a": "candy", "b": "dirt"}               | {"a": "", "b": "candy"}               |
    | {"a": "candy"}                            | {"a": "", "b": "candy"}               |
    | {"a": "candy", "b": "carrot", "c": "meh"} | {"a": "", "b": "candy", "c": "meh"}   |
    | {"b": "carrot"}                           | {"b": "carrot"}                       |
    | {"c": "meh"}                              | {"c": "meh"}                          |
    | {"a": "sparkle", "c": "meh"}              | {"a": "", "b": "sparkle", "c": "meh"} |
    |___________________________________________|______________________________________*/

    public static final Map<String, String> mapBully(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapBully.Validate(true);  // pass 'false' to print failed tests only.
    }
}
