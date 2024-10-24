package String1;
import String1.Testcases._ComboString;

// https://codingbat.com/prob/p168564
// Difficulty: 127.0

public class ComboString
{
    /* Given 2 strings, a and b, return a string of the form short+long+short, 
    with the shorter string on the outside and the longer string on the inside. 
    The strings will not be the same length, but they may be empty (length 0). */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    | comboString("Hello", "hi") → "hiHellohi"  |
    | comboString("hi", "Hello") → "hiHellohi"  |
    | comboString("aaa", "b")    → "baaab"      |
    | comboString("b", "aaa")    → "baaab"      |
    | comboString("aaa", "")     → "aaa"        |
    | comboString("", "bb")      → "bb"         |
    | comboString("aaa", "1234") → "aaa1234aaa" |
    | comboString("aaa", "bb")   → "bbaaabb"    |
    | comboString("a", "bb")     → "abba"       |
    | comboString("bb", "a")     → "abba"       |
    | comboString("xyz", "ab")   → "abxyzab"    |
    |__________________________________________*/

    public static String comboString(String a, String b)
    {
        return "";
    }

    public static void main(String[] args) {
        _ComboString.Validate(true);  // pass 'false' to print failed tests only.
    }
}
