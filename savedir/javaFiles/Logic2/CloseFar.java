package Logic2;
import Logic2.Testcases._CloseFar;

// https://codingbat.com/prob/p138990
// Difficulty: 215.0

public final class CloseFar
{
    /* Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), 
    while the other is "far", differing from both other values by 2 or more. 
    Note: Math.abs(num) computes the absolute value of a number. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | closeFar(1, 2, 10)  → true  |
    | closeFar(1, 2, 3)   → false |
    | closeFar(4, 1, 3)   → true  |
    | closeFar(4, 5, 3)   → false |
    | closeFar(4, 3, 5)   → false |
    | closeFar(-1, 10, 0) → true  |
    | closeFar(0, -1, 10) → true  |
    | closeFar(10, 10, 8) → true  |
    | closeFar(10, 8, 9)  → false |
    | closeFar(8, 9, 10)  → false |
    | closeFar(8, 9, 7)   → false |
    | closeFar(8, 6, 9)   → true  |
    |____________________________*/

    public static final boolean closeFar(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        _CloseFar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
