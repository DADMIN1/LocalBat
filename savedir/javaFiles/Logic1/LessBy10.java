package Logic1;
import Logic1.Testcases._LessBy10;

// https://codingbat.com/prob/p179196
// Difficulty: 148.0

public final class LessBy10
{
    /* Given three ints, a b c, return true if one of them is 10 or more less than one of the others. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | lessBy10(1, 7, 11)  → true  |
    | lessBy10(1, 7, 10)  → false |
    | lessBy10(11, 1, 7)  → true  |
    | lessBy10(10, 7, 1)  → false |
    | lessBy10(-10, 2, 2) → true  |
    | lessBy10(2, 11, 11) → false |
    | lessBy10(3, 3, 30)  → true  |
    | lessBy10(3, 3, 3)   → false |
    | lessBy10(10, 1, 11) → true  |
    | lessBy10(10, 11, 1) → true  |
    | lessBy10(10, 11, 2) → false |
    | lessBy10(3, 30, 3)  → true  |
    | lessBy10(2, 2, -8)  → true  |
    | lessBy10(2, 8, 12)  → true  |
    |____________________________*/

    public static final boolean lessBy10(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        _LessBy10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
