package Map1;
import Map1.Testcases._MapAB;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p107259
// Difficulty: 209

public final class MapAB
{
    /* Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. 
    If both keys are present, append their 2 string values together and store the result under the key "ab". */

    /*__________________________________________________
    |                     Testcases                     |
    |___________________________________________________|
    | map (Map<String, String>) | expected              |
    |                           | (Map<String, String>) |
    |___________________________|_______________________|
    | new HashMap<>(Map.of("a"  | "Hi"                  |
    | new HashMap<>(Map.of("a"  | "Hi"))                |
    | new HashMap<>(Map.of("b"  | "There"))             |
    | new HashMap<>(Map.of("c"  | "meh"))               |
    | new HashMap<>(Map.of("a"  | "aaa"                 |
    | new HashMap<>(Map.of("ab" | "nope"                |
    |___________________________|______________________*/

    public static final Map<String, String> mapAB(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _MapAB.Validate(true);  // pass 'false' to print failed tests only.
    }
}
