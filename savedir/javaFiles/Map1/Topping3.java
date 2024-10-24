package Map1;
import Map1.Testcases._Topping3;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p128461
// Difficulty: 218

public class Topping3
{
    /* Given a map of food keys and topping values, modify and return the map as follows: 
    if the key "potato" has a value, set that as the value for the key "fries". 
    If the key "salad" has a value, set that as the value for the key "spinach". */

    /*____________________________________________________________________________________________________________________________________________________________________
    |                                                                              Testcases                                                                              |
    |_____________________________________________________________________________________________________________________________________________________________________|
    | topping3({"potato": "ketchup"})                                    → {"potato": "ketchup", "fries": "ketchup"}                                                      |
    | topping3({"potato": "butter"})                                     → {"potato": "butter", "fries": "butter"}                                                        |
    | topping3({"salad": "oil", "potato": "ketchup"})                    → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}                    |
    | topping3({"toast": "butter", "salad": "oil", "potato": "ketchup"}) → {"toast": "butter", "spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"} |
    | topping3({})                                                       → {}                                                                                             |
    | topping3({"salad": "pepper", "fries": "salt"})                     → {"spinach": "pepper", "salad": "pepper", "fries": "salt"}                                      |
    |____________________________________________________________________________________________________________________________________________________________________*/

    public static Map<String, String> topping3(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static void main(String[] args) {
        _Topping3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
