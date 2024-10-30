package String1;
import String1.Testcases._ComboString;

// https://codingbat.com/prob/p168564
// Difficulty: 127.0

public final class ComboString
{
    /* Given 2 strings, a and b, return a string of the form short+long+short, 
    with the shorter string on the outside and the longer string on the inside. 
    The strings will not be the same length, but they may be empty (length 0). */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | a        | b        | expected     |
    | (String) | (String) | (String)     |
    |__________|__________|______________|
    | "Hello"  | "hi"     | "hiHellohi"  |
    | "hi"     | "Hello"  | "hiHellohi"  |
    | "aaa"    | "b"      | "baaab"      |
    | "b"      | "aaa"    | "baaab"      |
    | "aaa"    | ""       | "aaa"        |
    | ""       | "bb"     | "bb"         |
    | "aaa"    | "1234"   | "aaa1234aaa" |
    | "aaa"    | "bb"     | "bbaaabb"    |
    | "a"      | "bb"     | "abba"       |
    | "bb"     | "a"      | "abba"       |
    | "xyz"    | "ab"     | "abxyzab"    |
    |__________|__________|_____________*/

    public static final String comboString(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ComboString.Validate(true);  // pass 'false' to print failed tests only.
    }
}
