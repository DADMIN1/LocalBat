package String3;
import String3.Testcases._EqualIsNot;

// https://codingbat.com/prob/p141736
// Difficulty: 309.0

public final class EqualIsNot
{
    /* Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive). */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | str (String)         | expected  |
    |                      | (boolean) |
    |______________________|___________|
    | "This is not"        | false     |
    | "This is notnot"     | true      |
    | "noisxxnotyynotxisi" | true      |
    | "noisxxnotyynotxsi"  | false     |
    | "xxxyyyzzzintint"    | true      |
    | ""                   | true      |
    | "isisnotnot"         | true      |
    | "isisnotno7Not"      | false     |
    | "isnotis"            | false     |
    | "mis3notpotbotis"    | false     |
    |______________________|__________*/

    public static final boolean equalIsNot(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _EqualIsNot.Validate(true);  // pass 'false' to print failed tests only.
    }
}
