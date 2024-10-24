package Map1;
import Map1.Testcases._Topping1;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p182712
// Difficulty: 212

public class Topping1
{
    /* Given a map of food keys and topping values, modify and return the map as follows: 
    if the key "ice cream" is present, set its value to "cherry". 
    In all cases, set the key "bread" to have the value "butter". */

    /*_____________________________________________________________________________________________________________________________________
    |                                                              Testcases                                                               |
    |______________________________________________________________________________________________________________________________________|
    | topping1({"ice cream": "peanuts"})                                      → {"bread": "butter", "ice cream": "cherry"}                 |
    | topping1({})                                                            → {"bread": "butter"}                                        |
    | topping1({"pancake": "syrup"})                                          → {"bread": "butter", "pancake": "syrup"}                    |
    | topping1({"bread": "dirt", "ice cream": "strawberries"})                → {"bread": "butter", "ice cream": "cherry"}                 |
    | topping1({"bread": "jam", "ice cream": "strawberries", "salad": "oil"}) → {"bread": "butter", "ice cream": "cherry", "salad": "oil"} |
    |_____________________________________________________________________________________________________________________________________*/

    public static Map<String, String> topping1(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static void main(String[] args) {
        _Topping1.Validate(true);  // pass 'false' to print failed tests only.
    }
}
