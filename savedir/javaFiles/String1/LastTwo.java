package String1;
import String1.Testcases._LastTwo;

// https://codingbat.com/prob/p194786
// Difficulty: 172.0

public final class LastTwo
{
    /* Given a string of any length, return a new string where the last 2 chars, 
    if present, are swapped, so "coding" yields "codign". */

    /*____________________
    |      Testcases      |
    |_____________________|
    | str      | expected |
    | (String) | (String) |
    |__________|__________|
    | "coding" | "codign" |
    | "cat"    | "cta"    |
    | "ab"     | "ba"     |
    | "a"      | "a"      |
    | ""       | ""       |
    |__________|_________*/

    public static final String lastTwo(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _LastTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
