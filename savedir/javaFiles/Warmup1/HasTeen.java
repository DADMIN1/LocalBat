package Warmup1;
import Warmup1.Testcases._HasTeen;

// https://codingbat.com/prob/p178986
// Difficulty: 154.0

public final class HasTeen
{
    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 3 int values, return true if 1 or more of them are teen. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | hasTeen(13, 20, 10) → true  |
    | hasTeen(20, 19, 10) → true  |
    | hasTeen(20, 10, 13) → true  |
    | hasTeen(1, 20, 12)  → false |
    | hasTeen(19, 20, 12) → true  |
    | hasTeen(12, 20, 19) → true  |
    | hasTeen(12, 9, 20)  → false |
    | hasTeen(12, 18, 20) → true  |
    | hasTeen(14, 2, 20)  → true  |
    | hasTeen(4, 2, 20)   → false |
    | hasTeen(11, 22, 22) → false |
    |____________________________*/

    public static final boolean hasTeen(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        _HasTeen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
