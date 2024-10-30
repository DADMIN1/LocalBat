package String1;
import String1.Testcases._ExtraEnd;

// https://codingbat.com/prob/p108853
// Difficulty: 115.0

public final class ExtraEnd
{
    /* Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
    The string length will be at least 2. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | str      | expected |
    | (String) | (String) |
    |__________|__________|
    | "Hello"  | "lololo" |
    | "ab"     | "ababab" |
    | "Hi"     | "HiHiHi" |
    | "Candy"  | "dydydy" |
    | "Code"   | "dedede" |
    |__________|_________*/

    public static final String extraEnd(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ExtraEnd.Validate(true);  // pass 'false' to print failed tests only.
    }
}
