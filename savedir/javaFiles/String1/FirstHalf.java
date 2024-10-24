package String1;
import String1.Testcases._FirstHalf;

// https://codingbat.com/prob/p172267
// Difficulty: 121.0

public class FirstHalf
{
    /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | firstHalf("WooHoo")     → "Woo"   |
    | firstHalf("HelloThere") → "Hello" |
    | firstHalf("abcdef")     → "abc"   |
    | firstHalf("ab")         → "a"     |
    | firstHalf("")           → ""      |
    | firstHalf("0123456789") → "01234" |
    | firstHalf("kitten")     → "kit"   |
    |__________________________________*/

    public static String firstHalf(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _FirstHalf.Validate(true);  // pass 'false' to print failed tests only.
    }
}
