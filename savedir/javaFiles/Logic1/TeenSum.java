package Logic1;
import Logic1.Testcases._TeenSum;

// https://codingbat.com/prob/p178728
// Difficulty: 127.0

public final class TeenSum
{
    /* Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, 
    are extra lucky. So if either value is a teen, just return 19. */

    /*_____________________
    |      Testcases       |
    |______________________|
    | teenSum(3, 4)   → 7  |
    | teenSum(10, 13) → 19 |
    | teenSum(13, 2)  → 19 |
    | teenSum(3, 19)  → 19 |
    | teenSum(13, 13) → 19 |
    | teenSum(10, 10) → 20 |
    | teenSum(6, 14)  → 19 |
    | teenSum(15, 2)  → 19 |
    | teenSum(19, 19) → 19 |
    | teenSum(19, 20) → 19 |
    | teenSum(2, 18)  → 19 |
    | teenSum(12, 4)  → 16 |
    | teenSum(2, 20)  → 22 |
    | teenSum(2, 17)  → 19 |
    | teenSum(2, 16)  → 19 |
    | teenSum(6, 7)   → 13 |
    |_____________________*/

    public static final int teenSum(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _TeenSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
