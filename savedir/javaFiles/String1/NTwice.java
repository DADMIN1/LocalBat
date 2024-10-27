package String1;
import String1.Testcases._NTwice;

// https://codingbat.com/prob/p174148
// Difficulty: 151.0

public final class NTwice
{
    /* Given a string and an int n, return a string made of the first and last n chars from the string. 
    The string length will be at least n. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | nTwice("Hello", 2)     → "Helo"     |
    | nTwice("Chocolate", 3) → "Choate"   |
    | nTwice("Chocolate", 1) → "Ce"       |
    | nTwice("Chocolate", 0) → ""         |
    | nTwice("Hello", 4)     → "Hellello" |
    | nTwice("Code", 4)      → "CodeCode" |
    | nTwice("Code", 2)      → "Code"     |
    |____________________________________*/

    public static final String nTwice(String str, int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        _NTwice.Validate(true);  // pass 'false' to print failed tests only.
    }
}
