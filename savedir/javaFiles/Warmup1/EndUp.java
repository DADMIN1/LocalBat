package Warmup1;
import Warmup1.Testcases._EndUp;

// https://codingbat.com/prob/p125268
// Difficulty: 187.0

public class EndUp
{
    /* Given a string, return a new string where the last 3 chars are now in upper case. 
    If the string has less than 3 chars, uppercase whatever is there. 
    Note that str.toUpperCase() returns the uppercase version of a string. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | endUp("Hello")    → "HeLLO"    |
    | endUp("hi there") → "hi thERE" |
    | endUp("hi")       → "HI"       |
    | endUp("woo hoo")  → "woo HOO"  |
    | endUp("xyz12")    → "xyZ12"    |
    | endUp("x")        → "X"        |
    | endUp("")         → ""         |
    |_______________________________*/

    public static String endUp(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _EndUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
