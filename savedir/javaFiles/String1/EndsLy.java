package String1;
import String1.Testcases._EndsLy;

// https://codingbat.com/prob/p103895
// Difficulty: 148.0

public final class EndsLy
{
    /* Given a string, return true if it ends in "ly". */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | endsLy("oddly")  → true  |
    | endsLy("y")      → false |
    | endsLy("oddy")   → false |
    | endsLy("oddl")   → false |
    | endsLy("olydd")  → false |
    | endsLy("ly")     → true  |
    | endsLy("")       → false |
    | endsLy("falsey") → false |
    | endsLy("evenly") → true  |
    |_________________________*/

    public static final boolean endsLy(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _EndsLy.Validate(true);  // pass 'false' to print failed tests only.
    }
}
