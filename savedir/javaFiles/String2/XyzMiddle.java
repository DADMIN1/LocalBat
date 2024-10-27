package String2;
import String2.Testcases._XyzMiddle;

// https://codingbat.com/prob/p159772
// Difficulty: 242.0

public final class XyzMiddle
{
    /* Given a string, does "xyz" appear in the middle of the string? To define middle, 
    we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
    This problem is harder than it looks. */

    /*_______________________________________
    |               Testcases                |
    |________________________________________|
    | xyzMiddle("AAxyzBB")           → true  |
    | xyzMiddle("AxyzBB")            → true  |
    | xyzMiddle("AxyzBBB")           → false |
    | xyzMiddle("AxyzBBBB")          → false |
    | xyzMiddle("AAAxyzB")           → false |
    | xyzMiddle("AAAxyzBB")          → true  |
    | xyzMiddle("AAAAxyzBB")         → false |
    | xyzMiddle("AAAAAxyzBBB")       → false |
    | xyzMiddle("1x345xyz12x4")      → true  |
    | xyzMiddle("xyzAxyzBBB")        → true  |
    | xyzMiddle("xyzAxyzBxyz")       → true  |
    | xyzMiddle("xyzxyzAxyzBxyzxyz") → true  |
    | xyzMiddle("xyzxyzxyzBxyzxyz")  → true  |
    | xyzMiddle("xyzxyzAxyzxyzxyz")  → true  |
    | xyzMiddle("xyzxyzAxyzxyzxy")   → false |
    | xyzMiddle("AxyzxyzBB")         → false |
    | xyzMiddle("")                  → false |
    | xyzMiddle("x")                 → false |
    | xyzMiddle("xy")                → false |
    | xyzMiddle("xyz")               → true  |
    | xyzMiddle("xyzz")              → true  |
    |_______________________________________*/

    public static final boolean xyzMiddle(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _XyzMiddle.Validate(true);  // pass 'false' to print failed tests only.
    }
}
