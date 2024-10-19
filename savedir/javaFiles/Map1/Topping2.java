// https://codingbat.com/prob/p196458
package Map1;
import Map1.Testcases._Topping2;

import java.util.Map;
import java.util.HashMap;

public class Topping2
{
    /* Given a map of food keys and their topping values, modify and return the map as follows: 
    if the key "ice cream" has a value, set that as the value for the key "yogurt" also. 
    If the key "spinach" has a value, change that value to "nuts". */

    /*_______________________________________________________________________________________________________________________
    |                                                       Testcases                                                       |
    |_______________________________________________________________________________________________________________________|
    | topping2({"ice cream": "cherry"})                    → {"yogurt": "cherry", "ice cream": "cherry"}                    |
    | topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"} |
    | topping2({"yogurt": "salt"})                         → {"yogurt": "salt"}                                             |
    |______________________________________________________________________________________________________________________*/

    public static Map<String, String> topping2(Map<String, String> map)
    {
        
    }

    public static void main(String[] args) {
        _Topping2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
