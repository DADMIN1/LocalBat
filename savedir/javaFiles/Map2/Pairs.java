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

    /*________________________________________________________________________________________
    |                                        Testcases                                        |
    |_________________________________________________________________________________________|
    | strings (String[])                     | expected (Map<String, String>)                 |
    |________________________________________|________________________________________________|
    | { "code", "bug" }                      | Map.of("b", "g", "c", "e")                     |
    | { "man", "moon", "main" }              | Map.of("m", "n")                               |
    | { "man", "moon", "good", "night" }     | Map.of("g", "d", "m", "n", "n", "t")           |
    | {  }                                   | Map.of()                                       |
    | { "a", "b" }                           | Map.of("a", "a", "b", "b")                     |
    | { "are", "codes", "and", "cods" }      | Map.of("a", "d", "c", "s")                     |
    | { "apple", "banana", "tea", "coffee" } | Map.of("a", "e", "b", "a", "c", "e", "t", "a") |
    |________________________________________|_______________________________________________*/

    public static final Map<String, String> pairs(String[] strings)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _Pairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
