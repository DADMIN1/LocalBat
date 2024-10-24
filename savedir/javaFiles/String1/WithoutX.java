package String1;
import String1.Testcases._WithoutX;

// https://codingbat.com/prob/p151940
// Difficulty: 196.0

public class WithoutX
{
    /* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
    and otherwise return the string unchanged. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | withoutX("xHix")   → "Hi"     |
    | withoutX("xHi")    → "Hi"     |
    | withoutX("Hxix")   → "Hxi"    |
    | withoutX("Hi")     → "Hi"     |
    | withoutX("xxHi")   → "xHi"    |
    | withoutX("Hix")    → "Hi"     |
    | withoutX("xaxbx")  → "axb"    |
    | withoutX("xx")     → ""       |
    | withoutX("x")      → ""       |
    | withoutX("")       → ""       |
    | withoutX("Hello")  → "Hello"  |
    | withoutX("Hexllo") → "Hexllo" |
    |______________________________*/

    public static String withoutX(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _WithoutX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
