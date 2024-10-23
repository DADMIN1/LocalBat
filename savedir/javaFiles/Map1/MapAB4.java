// https://codingbat.com/prob/p136950
package Map1;
import Map1.Testcases._MapAB4;

import java.util.Map;

public class MapAB4
{
    /* Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, 
    then set "c" to have the longer value. If the values exist and have the same length, 
    change them both to the empty string in the map. */

    /*___________________________________________________________________________________
    |                                     Testcases                                      |
    |____________________________________________________________________________________|
    | mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"} |
    | mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"} |
    | mapAB4({"a": "aa", "b": "bbb"})              → {"a": "aa", "b": "bbb", "c": "bbb"} |
    |___________________________________________________________________________________*/

    public static Map<String, String> mapAB4(Map<String, String> map)
    {
        
    }

    public static void main(String[] args) {
        _MapAB4.Validate(true);  // pass 'false' to print failed tests only.
    }
}
