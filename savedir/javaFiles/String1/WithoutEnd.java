package String1;
import String1.Testcases._WithoutEnd;

// https://codingbat.com/prob/p130896
// Difficulty: 124.0

public class WithoutEnd
{
    /* Given a string, return a version without the first and last char, 
    so "Hello" yields "ell". The string length will be at least 2. */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | withoutEnd("Hello")      → "ell"      |
    | withoutEnd("java")       → "av"       |
    | withoutEnd("coding")     → "odin"     |
    | withoutEnd("code")       → "od"       |
    | withoutEnd("ab")         → ""         |
    | withoutEnd("Chocolate!") → "hocolate" |
    | withoutEnd("kitten")     → "itte"     |
    | withoutEnd("woohoo")     → "ooho"     |
    |______________________________________*/

    public static String withoutEnd(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _WithoutEnd.Validate(true);  // pass 'false' to print failed tests only.
    }
}
