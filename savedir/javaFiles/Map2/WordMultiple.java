// https://codingbat.com/prob/p190862
package Map2;
import Map2.Testcases._WordMultiple;

import java.util.Map;
import java.util.HashMap;

public class WordMultiple
{
    /* Given an array of strings, return a Map<String, 
    Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array. */

    /*________________________________________________________________________________
    |                                   Testcases                                    |
    |________________________________________________________________________________|
    | wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}   |
    | wordMultiple(["c", "b", "a"])           → {"a": false, "b": false, "c": false} |
    | wordMultiple(["c", "c", "c", "c"])      → {"c": true}                          |
    |_______________________________________________________________________________*/

    public static Map<String, Boolean> wordMultiple(String[] strings)
    {
        
    }

    public static void main(String[] args) {
        _WordMultiple.Validate(true);  // pass 'false' to print failed tests only.
    }
}
