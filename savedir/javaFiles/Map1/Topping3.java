package Map1;
import Map1.Testcases._Topping3;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p128461
// Difficulty: 218

public final class Topping3
{
    /* Given a map of food keys and topping values, modify and return the map as follows: 
    if the key "potato" has a value, set that as the value for the key "fries". 
    If the key "salad" has a value, set that as the value for the key "spinach". */

    /*______________________________________________________
    |                       Testcases                       |
    |_______________________________________________________|
    | map (Map<String, String>)     | expected              |
    |                               | (Map<String, String>) |
    |_______________________________|_______________________|
    | new HashMap<>(Map.of("potato" | "ketchup"))           |
    | new HashMap<>(Map.of("potato" | "butter"))            |
    | new HashMap<>(Map.of("salad"  | "oil"                 |
    | new HashMap<>(Map.of("toast"  | "butter"              |
    | new HashMap<>(Map.of())       | Map.of()              |
    | new HashMap<>(Map.of("salad"  | "pepper"              |
    |_______________________________|______________________*/

    public static final Map<String, String> topping3(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _Topping3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
