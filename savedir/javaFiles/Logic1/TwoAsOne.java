package Logic1;
import Logic1.Testcases._TwoAsOne;

// https://codingbat.com/prob/p113261
// Difficulty: 136.0

public class TwoAsOne
{
    /* Given three ints, a b c, return true if it is possible to add two of the ints to get the third. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    | twoAsOne(1, 2, 3)  → true  |
    | twoAsOne(3, 1, 2)  → true  |
    | twoAsOne(3, 2, 2)  → false |
    | twoAsOne(2, 3, 1)  → true  |
    | twoAsOne(5, 3, -2) → true  |
    | twoAsOne(5, 3, -3) → false |
    | twoAsOne(2, 5, 3)  → true  |
    | twoAsOne(9, 5, 5)  → false |
    | twoAsOne(9, 4, 5)  → true  |
    | twoAsOne(5, 4, 9)  → true  |
    | twoAsOne(3, 3, 0)  → true  |
    | twoAsOne(3, 3, 2)  → false |
    |___________________________*/

    public static boolean twoAsOne(int a, int b, int c)
    {
        return false;
    }

    public static void main(String[] args) {
        _TwoAsOne.Validate(true);  // pass 'false' to print failed tests only.
    }
}
