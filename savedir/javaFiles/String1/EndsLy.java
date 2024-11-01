package String1;
import String1.Testcases._EndsLy;

// https://codingbat.com/prob/p103895
// Difficulty: 148.0

public final class EndsLy
{
    /* Given a string, return true if it ends in "ly". */

    /*_____________________
    |      Testcases       |
    |______________________|
    |   str    |  returns  |
    | (String) | (boolean) |
    |__________|___________|
    | "oddly"  |    true   |
    |   "y"    |   false   |
    |  "oddy"  |   false   |
    |  "oddl"  |   false   |
    | "olydd"  |   false   |
    |   "ly"   |    true   |
    |    ""    |   false   |
    | "falsey" |   false   |
    | "evenly" |    true   |
    |__________|__________*/

    public static final boolean endsLy(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _EndsLy.Validate(true);  // pass 'false' to print failed tests only.
    }
}
