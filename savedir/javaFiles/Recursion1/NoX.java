package Recursion1;
import Recursion1.Testcases._NoX;

// https://codingbat.com/prob/p118230
// Difficulty: 342.0

public final class NoX
{
    /* Given a string, compute recursively a new string where all the 'x' chars have been removed. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | str      | expected |
    | (String) | (String) |
    |__________|__________|
    | "xaxb"   | "ab"     |
    | "abc"    | "abc"    |
    | "xx"     | ""       |
    | ""       | ""       |
    | "axxbxx" | "ab"     |
    | "Hellox" | "Hello"  |
    |__________|_________*/

    public static final String noX(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _NoX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
