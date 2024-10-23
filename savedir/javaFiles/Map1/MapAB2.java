// https://codingbat.com/prob/p115011
package Map1;
import Map1.Testcases._MapAB2;

import java.util.Map;

public class MapAB2
{
    /* Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, 
    remove them both. */

    /*_____________________________________________________________________________________
    |                                      Testcases                                       |
    |______________________________________________________________________________________|
    | mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}                        |
    | mapAB2({"a": "aaa", "b": "bbb"})              → {"a": "aaa", "b": "bbb"}             |
    | mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"})  → {"a": "aaa", "b": "bbb", "c": "aaa"} |
    |_____________________________________________________________________________________*/

    public static Map<String, String> mapAB2(Map<String, String> map)
    {
        
    }

    public static void main(String[] args) {
        _MapAB2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
