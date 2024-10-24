package String1;
import String1.Testcases._SeeColor;

// https://codingbat.com/prob/p199216
// Difficulty: 175.0

public class SeeColor
{
    /* Given a string, if the string begins with "red" or "blue" return that color string, 
    otherwise return the empty string. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | seeColor("redxx")     → "red"  |
    | seeColor("xxred")     → ""     |
    | seeColor("blueTimes") → "blue" |
    | seeColor("NoColor")   → ""     |
    | seeColor("red")       → "red"  |
    | seeColor("re")        → ""     |
    | seeColor("blu")       → ""     |
    | seeColor("blue")      → "blue" |
    | seeColor("a")         → ""     |
    | seeColor("")          → ""     |
    | seeColor("xyzred")    → ""     |
    |_______________________________*/

    public static String seeColor(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _SeeColor.Validate(true);  // pass 'false' to print failed tests only.
    }
}
