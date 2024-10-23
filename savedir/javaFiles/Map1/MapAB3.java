// https://codingbat.com/prob/p115012
package Map1;
import Map1.Testcases._MapAB3;

import java.util.Map;

public class MapAB3
{
    /* Modify and return the given map as follows: 
    if exactly one of the keys "a" or "b" has a value in the map (but not both), 
    set the other to have that same value in the map. */

    /*______________________________________________________________________________________
    |                                       Testcases                                       |
    |_______________________________________________________________________________________|
    | mapAB3({"a": "aaa", "c": "cake"})             → {"a": "aaa", "b": "aaa", "c": "cake"} |
    | mapAB3({"b": "bbb", "c": "cake"})             → {"a": "bbb", "b": "bbb", "c": "cake"} |
    | mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"} |
    |______________________________________________________________________________________*/

    public static Map<String, String> mapAB3(Map<String, String> map)
    {
        
    }

    public static void main(String[] args) {
        _MapAB3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
