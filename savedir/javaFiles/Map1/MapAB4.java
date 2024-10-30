package Map1;
import Map1.Testcases._MapAB4;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136950
// Difficulty: 227

public final class MapAB4
{
    /* Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, 
    then set "c" to have the longer value. If the values exist and have the same length, 
    change them both to the empty string in the map. */

    /*___________________________________________________
    |                     Testcases                      |
    |____________________________________________________|
    | map (Map<String, String>)  | expected              |
    |                            | (Map<String, String>) |
    |____________________________|_______________________|
    | new HashMap<>(Map.of("a"   | "aaa"                 |
    | new HashMap<>(Map.of("a"   | "aa"                  |
    | new HashMap<>(Map.of("a"   | "aa"                  |
    | new HashMap<>(Map.of("a"   | "aaa"))               |
    | new HashMap<>(Map.of("b"   | "bbb"))               |
    | new HashMap<>(Map.of("a"   | "aaa"                 |
    | new HashMap<>(Map.of("a"   | "a"                   |
    | new HashMap<>(Map.of("a"   | ""                    |
    | new HashMap<>(Map.of("a"   | "a"                   |
    | new HashMap<>(Map.of("c"   | "cat"                 |
    | new HashMap<>(Map.of("ccc" | "ccc"))               |
    | new HashMap<>(Map.of("c"   | "a"                   |
    | new HashMap<>(Map.of())    | Map.of()              |
    | new HashMap<>(Map.of("a"   | ""                    |
    | new HashMap<>(Map.of("b"   | ""                    |
    |____________________________|______________________*/

    public static final Map<String, String> mapAB4(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB4.Validate(true);  // pass 'false' to print failed tests only.
    }
}
