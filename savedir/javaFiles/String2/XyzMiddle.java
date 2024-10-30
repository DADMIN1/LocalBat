package String2;
import String2.Testcases._XyzMiddle;

// https://codingbat.com/prob/p159772
// Difficulty: 242.0

public final class XyzMiddle
{
    /* Given a string, does "xyz" appear in the middle of the string? To define middle, 
    we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
    This problem is harder than it looks. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | str (String)        | expected  |
    |                     | (boolean) |
    |_____________________|___________|
    | "AAxyzBB"           | true      |
    | "AxyzBB"            | true      |
    | "AxyzBBB"           | false     |
    | "AxyzBBBB"          | false     |
    | "AAAxyzB"           | false     |
    | "AAAxyzBB"          | true      |
    | "AAAAxyzBB"         | false     |
    | "AAAAAxyzBBB"       | false     |
    | "1x345xyz12x4"      | true      |
    | "xyzAxyzBBB"        | true      |
    | "xyzAxyzBxyz"       | true      |
    | "xyzxyzAxyzBxyzxyz" | true      |
    | "xyzxyzxyzBxyzxyz"  | true      |
    | "xyzxyzAxyzxyzxyz"  | true      |
    | "xyzxyzAxyzxyzxy"   | false     |
    | "AxyzxyzBB"         | false     |
    | ""                  | false     |
    | "x"                 | false     |
    | "xy"                | false     |
    | "xyz"               | true      |
    | "xyzz"              | true      |
    |_____________________|__________*/

    public static final boolean xyzMiddle(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _XyzMiddle.Validate(true);  // pass 'false' to print failed tests only.
    }
}
