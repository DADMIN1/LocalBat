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

    /*_________________________________________________
    |                    Testcases                     |
    |__________________________________________________|
    | map                      | expected              |
    | (Map<String, String>)    | (Map<String, String>) |
    |__________________________|_______________________|
    | new HashMap<>(Map.of("a" | "candy"               |
    | new HashMap<>(Map.of("a" | "candy"))             |
    | new HashMap<>(Map.of("a" | "candy"               |
    | new HashMap<>(Map.of("b" | "carrot"))            |
    | new HashMap<>(Map.of("c" | "meh"))               |
    | new HashMap<>(Map.of("a" | "sparkle"             |
    |__________________________|______________________*/

    public static final Map<String, String> mapBully(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapBully.Validate(true);  // pass 'false' to print failed tests only.
    }
}
