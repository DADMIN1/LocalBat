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

    /*__________________________________________________________________________________________________________________________________________________________
    |                                                                         Testcases                                                                         |
    |___________________________________________________________________________________________________________________________________________________________|
    |                map (Map<String, String>)                 |                                 returns (Map<String, String>)                                  |
    |__________________________________________________________|________________________________________________________________________________________________|
    | {"potato": "ketchup"}                                    | {"potato": "ketchup", "fries": "ketchup"}                                                      |
    | {"potato": "butter"}                                     | {"potato": "butter", "fries": "butter"}                                                        |
    | {"salad": "oil", "potato": "ketchup"}                    | {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}                    |
    | {"toast": "butter", "salad": "oil", "potato": "ketchup"} | {"toast": "butter", "spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"} |
    | {}                                                       | {}                                                                                             |
    | {"salad": "pepper", "fries": "salt"}                     | {"spinach": "pepper", "salad": "pepper", "fries": "salt"}                                      |
    |__________________________________________________________|_______________________________________________________________________________________________*/

    public static final Map<String, String> topping3(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        //_Topping3.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Topping3.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Topping3.Validate();
    }
}
