package String3;
import String3.Testcases._EqualIsNot;

// https://codingbat.com/prob/p141736
// Difficulty: 309.0

public class EqualIsNot
{
    /* Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive). */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | equalIsNot("This is not")        → false |
    | equalIsNot("This is notnot")     → true  |
    | equalIsNot("noisxxnotyynotxisi") → true  |
    | equalIsNot("noisxxnotyynotxsi")  → false |
    | equalIsNot("xxxyyyzzzintint")    → true  |
    | equalIsNot("")                   → true  |
    | equalIsNot("isisnotnot")         → true  |
    | equalIsNot("isisnotno7Not")      → false |
    | equalIsNot("isnotis")            → false |
    | equalIsNot("mis3notpotbotis")    → false |
    |_________________________________________*/

    public static boolean equalIsNot(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _EqualIsNot.Validate(true);  // pass 'false' to print failed tests only.
    }
}
