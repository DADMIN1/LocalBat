package Warmup1;
import Warmup1.Testcases._Front22;

// https://codingbat.com/prob/p183592
// Difficulty: 142.0

public class Front22
{
    /* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
    so "kitten" yields"kikittenki". If the string length is less than 2, 
    use whatever chars are there. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | front22("kitten") → "kikittenki" |
    | front22("Ha")     → "HaHaHa"     |
    | front22("abc")    → "ababcab"    |
    | front22("ab")     → "ababab"     |
    | front22("a")      → "aaa"        |
    | front22("")       → ""           |
    | front22("Logic")  → "LoLogicLo"  |
    |_________________________________*/

    public static String front22(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _Front22.Validate(true);  // pass 'false' to print failed tests only.
    }
}
