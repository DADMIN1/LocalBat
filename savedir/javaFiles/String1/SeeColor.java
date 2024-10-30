package String1;
import String1.Testcases._SeeColor;

// https://codingbat.com/prob/p199216
// Difficulty: 175.0

public final class SeeColor
{
    /* Given a string, if the string begins with "red" or "blue" return that color string, 
    otherwise return the empty string. */

    /*_______________________
    |       Testcases        |
    |________________________|
    | str         | expected |
    | (String)    | (String) |
    |_____________|__________|
    | "redxx"     | "red"    |
    | "xxred"     | ""       |
    | "blueTimes" | "blue"   |
    | "NoColor"   | ""       |
    | "red"       | "red"    |
    | "re"        | ""       |
    | "blu"       | ""       |
    | "blue"      | "blue"   |
    | "a"         | ""       |
    | ""          | ""       |
    | "xyzred"    | ""       |
    |_____________|_________*/

    public static final String seeColor(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _SeeColor.Validate(true);  // pass 'false' to print failed tests only.
    }
}
