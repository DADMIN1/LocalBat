// https://codingbat.com/prob/p126332
package Map2;
import Map2.Testcases._Pairs;

import java.util.Map;

public class Pairs
{
    /* Given an array of non-empty strings, create and return a Map<String, 
    String> as follows: for each string add its first character as a key with its last character as the value. */

    /*_________________________________________________________________________
    |                                Testcases                                 |
    |__________________________________________________________________________|
    | pairs(["code", "bug"])                  → {"b": "g", "c": "e"}           |
    | pairs(["man", "moon", "main"])          → {"m": "n"}                     |
    | pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"} |
    |_________________________________________________________________________*/

    public static Map<String, String> pairs(String[] strings)
    {
        
    }

    public static void main(String[] args) {
        _Pairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
