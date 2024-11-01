package Map1;
import Map1.Testcases._Topping1;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p182712
// Difficulty: 212

public final class Topping1
{
    /* Given a map of food keys and topping values, modify and return the map as follows: 
    if the key "ice cream" is present, set its value to "cherry". 
    In all cases, set the key "bread" to have the value "butter". */

    /*___________________________________________________________________________________________________________________________
    |                                                         Testcases                                                          |
    |____________________________________________________________________________________________________________________________|
    | map (Map<String, String>)                                     | expected (Map<String, String>)                             |
    |_______________________________________________________________|____________________________________________________________|
    | {"ice cream": "peanuts"}                                      | {"bread": "butter", "ice cream": "cherry"}                 |
    | {}                                                            | {"bread": "butter"}                                        |
    | {"pancake": "syrup"}                                          | {"bread": "butter", "pancake": "syrup"}                    |
    | {"bread": "dirt", "ice cream": "strawberries"}                | {"bread": "butter", "ice cream": "cherry"}                 |
    | {"bread": "jam", "ice cream": "strawberries", "salad": "oil"} | {"bread": "butter", "ice cream": "cherry", "salad": "oil"} |
    |_______________________________________________________________|___________________________________________________________*/

    public static final Map<String, String> topping1(Map<String, String> map)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _Topping1.Validate(true);  // pass 'false' to print failed tests only.
    }
}
