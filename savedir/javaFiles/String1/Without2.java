package String1;
import String1.Testcases._Without2;

// https://codingbat.com/prob/p142247
// Difficulty: 187.0

public class Without2
{
    /* Given a string, if a length 2 substring appears at both its beginning and end, 
    return a string without the substring at the beginning, 
    so "HelloHe" yields "lloHe". The substring may overlap with itself, 
    so "Hi" yields "". Otherwise, return the original string unchanged. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | without2("HelloHe")   → "lloHe"     |
    | without2("HelloHi")   → "HelloHi"   |
    | without2("Hi")        → ""          |
    | without2("Chocolate") → "Chocolate" |
    | without2("xxx")       → "x"         |
    | without2("xx")        → ""          |
    | without2("x")         → "x"         |
    | without2("")          → ""          |
    | without2("Fruits")    → "Fruits"    |
    |____________________________________*/

    public static String without2(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _Without2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
