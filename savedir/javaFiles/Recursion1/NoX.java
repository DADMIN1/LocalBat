package Recursion1;
import Recursion1.Testcases._NoX;

// https://codingbat.com/prob/p118230
// Difficulty: 342.0

public class NoX
{
    /* Given a string, compute recursively a new string where all the 'x' chars have been removed. */

    /*________________________
    |        Testcases        |
    |_________________________|
    | noX("xaxb")   → "ab"    |
    | noX("abc")    → "abc"   |
    | noX("xx")     → ""      |
    | noX("")       → ""      |
    | noX("axxbxx") → "ab"    |
    | noX("Hellox") → "Hello" |
    |________________________*/

    public static String noX(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _NoX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
