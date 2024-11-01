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

    /*____________________________________________________________________________________________________________
    |                                                  Testcases                                                  |
    |_____________________________________________________________________________________________________________|
    | map (Map<String, String>)                  | expected (Map<String, String>)                                 |
    |____________________________________________|________________________________________________________________|
    | {"ice cream": "cherry"}                    | {"yogurt": "cherry", "ice cream": "cherry"}                    |
    | {"spinach": "dirt", "ice cream": "cherry"} | {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"} |
    | {"yogurt": "salt"}                         | {"yogurt": "salt"}                                             |
    | {"yogurt": "salt", "bread": "butter"}      | {"yogurt": "salt", "bread": "butter"}                          |
    | {}                                         | {}                                                             |
    | {"ice cream": "air", "salad": "oil"}       | {"yogurt": "air", "ice cream": "air", "salad": "oil"}          |
    |____________________________________________|_______________________________________________________________*/

    public static final Map<String, String> topping2(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _Topping2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
