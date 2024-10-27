package Logic1;
import Logic1.Testcases._LastDigit;

// https://codingbat.com/prob/p169213
// Difficulty: 145.0

public final class LastDigit
{
    /* Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
    The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | lastDigit(23, 19, 13)     → true  |
    | lastDigit(23, 19, 12)     → false |
    | lastDigit(23, 19, 3)      → true  |
    | lastDigit(23, 19, 39)     → true  |
    | lastDigit(1, 2, 3)        → false |
    | lastDigit(1, 1, 2)        → true  |
    | lastDigit(1, 2, 2)        → true  |
    | lastDigit(14, 25, 43)     → false |
    | lastDigit(14, 25, 45)     → true  |
    | lastDigit(248, 106, 1002) → false |
    | lastDigit(248, 106, 1008) → true  |
    | lastDigit(10, 11, 20)     → true  |
    | lastDigit(0, 11, 0)       → true  |
    |__________________________________*/

    public static final boolean lastDigit(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        _LastDigit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
