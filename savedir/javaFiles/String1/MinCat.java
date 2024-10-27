package String1;
import String1.Testcases._MinCat;

// https://codingbat.com/prob/p105745
// Difficulty: 181.0

public final class MinCat
{
    /* Given two strings, append them together (known as "concatenation") and return the result. 
    However, if the strings are different lengths, 
    omit chars from the longer string so it is the same length as the shorter string. 
    So "Hello" and "Hi" yield "loHi". The strings may be any length. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | minCat("Hello", "Hi")   → "loHi"     |
    | minCat("Hello", "java") → "ellojava" |
    | minCat("java", "Hello") → "javaello" |
    | minCat("abc", "x")      → "cx"       |
    | minCat("x", "abc")      → "xc"       |
    | minCat("abc", "")       → ""         |
    |_____________________________________*/

    public static final String minCat(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        _MinCat.Validate(true);  // pass 'false' to print failed tests only.
    }
}
