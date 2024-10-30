package Map1;
import Map1.Testcases._Topping2;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p196458
// Difficulty: 215

public final class Topping2
{
    /* Given a map of food keys and their topping values, modify and return the map as follows: 
    if the key "ice cream" has a value, set that as the value for the key "yogurt" also. 
    If the key "spinach" has a value, change that value to "nuts". */

    /*_________________________________________________________
    |                        Testcases                         |
    |__________________________________________________________|
    | map (Map<String, String>)        | expected              |
    |                                  | (Map<String, String>) |
    |__________________________________|_______________________|
    | new HashMap<>(Map.of("ice cream" | "cherry"))            |
    | new HashMap<>(Map.of("spinach"   | "dirt"                |
    | new HashMap<>(Map.of("yogurt"    | "salt"))              |
    | new HashMap<>(Map.of("yogurt"    | "salt"                |
    | new HashMap<>(Map.of())          | Map.of()              |
    | new HashMap<>(Map.of("ice cream" | "air"                 |
    |__________________________________|______________________*/

    public static final Map<String, String> topping2(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _Topping2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
