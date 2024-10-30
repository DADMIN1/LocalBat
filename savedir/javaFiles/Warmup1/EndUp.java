package Warmup1;
import Warmup1.Testcases._EndUp;

// https://codingbat.com/prob/p125268
// Difficulty: 187.0

public final class EndUp
{
    /* Given a string, return a new string where the last 3 chars are now in upper case. 
    If the string has less than 3 chars, uppercase whatever is there. 
    Note that str.toUpperCase() returns the uppercase version of a string. */

    /*________________________
    |        Testcases        |
    |_________________________|
    | str        | expected   |
    | (String)   | (String)   |
    |____________|____________|
    | "Hello"    | "HeLLO"    |
    | "hi there" | "hi thERE" |
    | "hi"       | "HI"       |
    | "woo hoo"  | "woo HOO"  |
    | "xyz12"    | "xyZ12"    |
    | "x"        | "X"        |
    | ""         | ""         |
    |____________|___________*/

    public static final String endUp(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _EndUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
