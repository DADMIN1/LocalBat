package Logic1;
import Logic1.Testcases._Love6;

// https://codingbat.com/prob/p137742
// Difficulty: 120

public final class Love6
{
    /* The number 6 is a truly great number. Given two int values, 
    a and b, return true if either one is 6. Or if their sum or difference is 6. 
    Note: the function Math.abs(num) computes the absolute value of a number. */

    /*_______________________
    |       Testcases        |
    |________________________|
    | love6(6, 4)    → true  |
    | love6(4, 5)    → false |
    | love6(1, 5)    → true  |
    | love6(1, 6)    → true  |
    | love6(1, 8)    → false |
    | love6(1, 7)    → true  |
    | love6(7, 5)    → false |
    | love6(8, 2)    → true  |
    | love6(6, 6)    → true  |
    | love6(-6, 2)   → false |
    | love6(-4, -10) → true  |
    | love6(-7, 1)   → false |
    | love6(7, -1)   → true  |
    | love6(-6, 12)  → true  |
    | love6(-2, -4)  → false |
    | love6(7, 1)    → true  |
    | love6(0, 9)    → false |
    | love6(8, 3)    → false |
    | love6(3, 3)    → true  |
    | love6(3, 4)    → false |
    |_______________________*/

    public static final boolean love6(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Love6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
