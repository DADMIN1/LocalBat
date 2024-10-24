package String1;
import String1.Testcases._WithoutX2;

// https://codingbat.com/prob/p151359
// Difficulty: 199.0

public class WithoutX2
{
    /* Given a string, if one or both of the first 2 chars is 'x', 
    return the string without those 'x' chars, and otherwise return the string unchanged. 
    This is a little harder than it looks. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | withoutX2("xHi")    → "Hi"     |
    | withoutX2("Hxi")    → "Hi"     |
    | withoutX2("Hi")     → "Hi"     |
    | withoutX2("xxHi")   → "Hi"     |
    | withoutX2("Hix")    → "Hix"    |
    | withoutX2("xaxb")   → "axb"    |
    | withoutX2("xx")     → ""       |
    | withoutX2("x")      → ""       |
    | withoutX2("")       → ""       |
    | withoutX2("Hello")  → "Hello"  |
    | withoutX2("Hexllo") → "Hexllo" |
    | withoutX2("xHxllo") → "Hxllo"  |
    |_______________________________*/

    public static String withoutX2(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _WithoutX2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
