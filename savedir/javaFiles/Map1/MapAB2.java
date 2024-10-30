package Map1;
import Map1.Testcases._MapAB2;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115011
// Difficulty: 221

public final class MapAB2
{
    /* Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, 
    remove them both. */

    /*_________________________________________________
    |                    Testcases                     |
    |__________________________________________________|
    | map                      | expected              |
    | (Map<String, String>)    | (Map<String, String>) |
    |__________________________|_______________________|
    | new HashMap<>(Map.of("a" | "aaa"                 |
    | new HashMap<>(Map.of("a" | "aaa"                 |
    | new HashMap<>(Map.of("a" | "aaa"                 |
    | new HashMap<>(Map.of("a" | "aaa"))               |
    | new HashMap<>(Map.of("b" | "bbb"))               |
    | new HashMap<>(Map.of("a" | ""                    |
    | new HashMap<>(Map.of())  | Map.of()              |
    | new HashMap<>(Map.of("a" | "a"                   |
    |__________________________|______________________*/

    public static final Map<String, String> mapAB2(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
