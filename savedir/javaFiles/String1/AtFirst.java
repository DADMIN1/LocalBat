package String1;
import String1.Testcases._AtFirst;

// https://codingbat.com/prob/p139076
// Difficulty: 163.0

public class AtFirst
{
    /* Given a string, return a string length 2 made of its first 2 chars. 
    If the string length is less than 2, use '@' for the missing chars. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | atFirst("hello")  → "he" |
    | atFirst("hi")     → "hi" |
    | atFirst("h")      → "h@" |
    | atFirst("")       → "@@" |
    | atFirst("kitten") → "ki" |
    | atFirst("java")   → "ja" |
    | atFirst("j")      → "j@" |
    |_________________________*/

    public static String atFirst(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _AtFirst.Validate(true);  // pass 'false' to print failed tests only.
    }
}
