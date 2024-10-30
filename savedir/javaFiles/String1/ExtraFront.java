package String1;
import String1.Testcases._ExtraFront;

// https://codingbat.com/prob/p172063
// Difficulty: 184.0

public final class ExtraFront
{
    /* Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
    The string may be any length. If there are fewer than 2 chars, 
    use whatever is there. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | str      | expected |
    | (String) | (String) |
    |__________|__________|
    | "Hello"  | "HeHeHe" |
    | "ab"     | "ababab" |
    | "H"      | "HHH"    |
    | ""       | ""       |
    | "Candy"  | "CaCaCa" |
    | "Code"   | "CoCoCo" |
    |__________|_________*/

    public static final String extraFront(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ExtraFront.Validate(true);  // pass 'false' to print failed tests only.
    }
}
