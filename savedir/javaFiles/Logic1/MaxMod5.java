package Logic1;
import Logic1.Testcases._MaxMod5;

// https://codingbat.com/prob/p115384
// Difficulty: 154.0

public final class MaxMod5
{
    /* Given two int values, return whichever value is larger. 
    However if the two values have the same remainder when divided by 5, 
    then the return the smaller value. However, in all cases, 
    if the two values are the same, return 0. Note: 
    the % "mod" operator computes the remainder, e.g. 7 % 5 is 2. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | maxMod5(2, 3)  → 3  |
    | maxMod5(6, 2)  → 6  |
    | maxMod5(3, 2)  → 3  |
    | maxMod5(8, 12) → 12 |
    | maxMod5(7, 12) → 7  |
    | maxMod5(11, 6) → 6  |
    | maxMod5(2, 7)  → 2  |
    | maxMod5(7, 7)  → 0  |
    | maxMod5(9, 1)  → 9  |
    | maxMod5(9, 14) → 9  |
    | maxMod5(1, 2)  → 2  |
    |____________________*/

    public static final int maxMod5(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _MaxMod5.Validate(true);  // pass 'false' to print failed tests only.
    }
}
