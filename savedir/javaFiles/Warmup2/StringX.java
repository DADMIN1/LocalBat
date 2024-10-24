package Warmup2;
import Warmup2.Testcases._StringX;

// https://codingbat.com/prob/p171260
// Difficulty: 230.0

public class StringX
{
    /* Given a string, return a version where all the "x" have been removed. 
    Except an "x" at the very start or end should not be removed. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | stringX("xxHxix")    → "xHix"     |
    | stringX("abxxxcd")   → "abcd"     |
    | stringX("xabxxxcdx") → "xabcdx"   |
    | stringX("xKittenx")  → "xKittenx" |
    | stringX("Hello")     → "Hello"    |
    | stringX("xx")        → "xx"       |
    | stringX("x")         → "x"        |
    | stringX("")          → ""         |
    |__________________________________*/

    public static String stringX(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _StringX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
