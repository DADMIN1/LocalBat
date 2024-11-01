package Map2;
import Map2.Testcases._Pairs;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p126332
// Difficulty: 320

public final class Pairs
{
    /* Given an array of non-empty strings, create and return a Map<String, 
    String> as follows: for each string add its first character as a key with its last character as the value. */

    /*________________________________________________________________________________
    |                                    Testcases                                    |
    |_________________________________________________________________________________|
    | strings (String[])                   | expected (Map<String, String>)           |
    |______________________________________|__________________________________________|
    | {"code", "bug"}                      | {"b": "g", "c": "e"}                     |
    | {"man", "moon", "main"}              | {"m": "n"}                               |
    | {"man", "moon", "good", "night"}     | {"g": "d", "m": "n", "n": "t"}           |
    | {}                                   | {}                                       |
    | {"a", "b"}                           | {"a": "a", "b": "b"}                     |
    | {"are", "codes", "and", "cods"}      | {"a": "d", "c": "s"}                     |
    | {"apple", "banana", "tea", "coffee"} | {"a": "e", "b": "a", "c": "e", "t": "a"} |
    |______________________________________|_________________________________________*/

    public static final Map<String, String> pairs(String[] strings)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _Pairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
