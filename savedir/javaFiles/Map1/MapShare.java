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

    /*_________________________________________________
    |                    Testcases                     |
    |__________________________________________________|
    | map                      | expected              |
    | (Map<String, String>)    | (Map<String, String>) |
    |__________________________|_______________________|
    | new HashMap<>(Map.of("a" | "aaa"                 |
    | new HashMap<>(Map.of("b" | "xyz"                 |
    | new HashMap<>(Map.of("a" | "aaa"                 |
    | new HashMap<>(Map.of("a" | "xyz"                 |
    | new HashMap<>(Map.of("a" | "xyz"                 |
    |__________________________|______________________*/

    public static final Map<String, String> mapShare(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapShare.Validate(true);  // pass 'false' to print failed tests only.
    }
}
