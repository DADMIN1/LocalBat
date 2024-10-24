package Map2;
import Map2.Testcases._Pairs;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p126332
// Difficulty: 320

public class Pairs
{
    /* Given an array of non-empty strings, create and return a Map<String, 
    String> as follows: for each string add its first character as a key with its last character as the value. */

    /*_______________________________________________________________________________________
    |                                       Testcases                                        |
    |________________________________________________________________________________________|
    | pairs(["code", "bug"])                      → {"b": "g", "c": "e"}                     |
    | pairs(["man", "moon", "main"])              → {"m": "n"}                               |
    | pairs(["man", "moon", "good", "night"])     → {"g": "d", "m": "n", "n": "t"}           |
    | pairs([])                                   → {}                                       |
    | pairs(["a", "b"])                           → {"a": "a", "b": "b"}                     |
    | pairs(["are", "codes", "and", "cods"])      → {"a": "d", "c": "s"}                     |
    | pairs(["apple", "banana", "tea", "coffee"]) → {"a": "e", "b": "a", "c": "e", "t": "a"} |
    |_______________________________________________________________________________________*/

    public static Map<String, String> pairs(String[] strings)
    {
        return new HashMap<String, String>();
    }

    public static void main(String[] args) {
        _Pairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
