// https://codingbat.com/prob/p182712
package Map1;
import Map1.Testcases._Topping1;

import java.util.Map;

public class Topping1
{
    /* Given a map of food keys and topping values, modify and return the map as follows: 
    if the key "ice cream" is present, set its value to "cherry". 
    In all cases, set the key "bread" to have the value "butter". */

    /*________________________________________________________________________________
    |                                    Testcases                                    |
    |_________________________________________________________________________________|
    | topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"} |
    | topping1({})                       → {"bread": "butter"}                        |
    | topping1({"pancake": "syrup"})     → {"bread": "butter", "pancake": "syrup"}    |
    |________________________________________________________________________________*/

    public static Map<String, String> topping1(Map<String, String> map)
    {
        
    }

    public static void main(String[] args) {
        _Topping1.Validate(true);  // pass 'false' to print failed tests only.
    }
}
