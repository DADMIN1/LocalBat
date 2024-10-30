package Map2;
import Map2.Testcases._FirstChar;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p168493
// Difficulty: 353

public final class FirstChar
{
    /* Given an array of non-empty strings, return a Map<String, 
    String> with a key for every different first character seen, 
    with the value of all the strings starting with that character appended together in the order they appear in the array. */

    /*____________________________________________________________________________________________________________________________________________________________
    |                                                                          Testcases                                                                          |
    |_____________________________________________________________________________________________________________________________________________________________|
    | strings (String[])                                                       | expected (Map<String, String>)                                                   |
    |__________________________________________________________________________|__________________________________________________________________________________|
    | { "salt", "tea", "soda", "toast" }                                       | Map.of("s", "saltsoda", "t", "teatoast")                                         |
    | { "aa", "bb", "cc", "aAA", "cCC", "d" }                                  | Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d")                          |
    | {  }                                                                     | Map.of()                                                                         |
    | { "apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells" } | Map.of("a", "appleaardvark", "b", "bellsbellsbells", "s", "saltsun", "z", "zen") |
    |__________________________________________________________________________|_________________________________________________________________________________*/

    public static final Map<String, String> firstChar(String[] strings)
    {
        return new HashMap<String, String>();
    }

    public static final void main(String[] args) {
        _FirstChar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
