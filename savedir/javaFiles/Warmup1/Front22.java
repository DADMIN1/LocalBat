package Warmup1;
import Warmup1.Testcases._Front22;

// https://codingbat.com/prob/p183592
// Difficulty: 142.0

public final class Front22
{
    /* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
    so "kitten" yields"kikittenki". If the string length is less than 2, 
    use whatever chars are there. */

    /*________________________
    |        Testcases        |
    |_________________________|
    | str      | expected     |
    | (String) | (String)     |
    |__________|______________|
    | "kitten" | "kikittenki" |
    | "Ha"     | "HaHaHa"     |
    | "abc"    | "ababcab"    |
    | "ab"     | "ababab"     |
    | "a"      | "aaa"        |
    | ""       | ""           |
    | "Logic"  | "LoLogicLo"  |
    |__________|_____________*/

    public static final String front22(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _Front22.Validate(true);  // pass 'false' to print failed tests only.
    }
}
