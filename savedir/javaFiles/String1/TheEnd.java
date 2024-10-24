package String1;
import String1.Testcases._TheEnd;

// https://codingbat.com/prob/p162477
// Difficulty: 139.0

public class TheEnd
{
    /* Given a string, return a string length 1 from its front, 
    unless front is false, in which case return a string length 1 from its back. 
    The string will be non-empty. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | theEnd("Hello", true)      → "H" |
    | theEnd("Hello", false)     → "o" |
    | theEnd("oh", true)         → "o" |
    | theEnd("oh", false)        → "h" |
    | theEnd("x", true)          → "x" |
    | theEnd("x", false)         → "x" |
    | theEnd("java", true)       → "j" |
    | theEnd("chocolate", false) → "e" |
    | theEnd("1234", true)       → "1" |
    | theEnd("code", false)      → "e" |
    |_________________________________*/

    public static String theEnd(String str, boolean front)
    {
        return "";
    }

    public static void main(String[] args) {
        _TheEnd.Validate(true);  // pass 'false' to print failed tests only.
    }
}
