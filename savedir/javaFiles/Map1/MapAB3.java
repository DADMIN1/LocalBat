package Map1;
import Map1.Testcases._MapAB3;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115012
// Difficulty: 224

public final class MapAB3
{
    /* Modify and return the given map as follows: 
    if exactly one of the keys "a" or "b" has a value in the map (but not both), 
    set the other to have that same value in the map. */

    /*___________________________________________________
    |                     Testcases                      |
    |____________________________________________________|
    | map (Map<String, String>)  | expected              |
    |                            | (Map<String, String>) |
    |____________________________|_______________________|
    | new HashMap<>(Map.of("a"   | "aaa"                 |
    | new HashMap<>(Map.of("b"   | "bbb"                 |
    | new HashMap<>(Map.of("a"   | "aaa"                 |
    | new HashMap<>(Map.of("ccc" | "ccc"))               |
    | new HashMap<>(Map.of("c"   | "a"                   |
    | new HashMap<>(Map.of())    | Map.of()              |
    | new HashMap<>(Map.of("a"   | ""))                  |
    | new HashMap<>(Map.of("b"   | ""))                  |
    | new HashMap<>(Map.of("a"   | ""                    |
    | new HashMap<>(Map.of("aa"  | "aa"                  |
    |____________________________|______________________*/

    public static final Map<String, String> mapAB3(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
