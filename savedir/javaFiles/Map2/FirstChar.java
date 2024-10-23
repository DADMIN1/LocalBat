// https://codingbat.com/prob/p168493
package Map2;
import Map2.Testcases._FirstChar;

import java.util.Map;

public class FirstChar
{
    /* Given an array of non-empty strings, return a Map<String, 
    String> with a key for every different first character seen, 
    with the value of all the strings starting with that character appended together in the order they appear in the array. */

    /*_____________________________________________________________________________________________________
    |                                              Testcases                                               |
    |______________________________________________________________________________________________________|
    | firstChar(["salt", "tea", "soda", "toast"])      → {"s": "saltsoda", "t": "teatoast"}                |
    | firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"} |
    | firstChar([])                                    → {}                                                |
    |_____________________________________________________________________________________________________*/

    public static Map<String, String> firstChar(String[] strings)
    {
        
    }

    public static void main(String[] args) {
        _FirstChar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
