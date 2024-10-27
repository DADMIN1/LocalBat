package Recursion1;
import Recursion1.Testcases._PowerN;

// https://codingbat.com/prob/p158888
// Difficulty: 327.0

public final class PowerN
{
    /* Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, 
    so powerN(3, 2) is 9 (3 squared). */

    /*_____________________
    |      Testcases       |
    |______________________|
    | powerN(3, 1)  → 3    |
    | powerN(3, 2)  → 9    |
    | powerN(3, 3)  → 27   |
    | powerN(2, 1)  → 2    |
    | powerN(2, 2)  → 4    |
    | powerN(2, 3)  → 8    |
    | powerN(2, 4)  → 16   |
    | powerN(2, 5)  → 32   |
    | powerN(10, 1) → 10   |
    | powerN(10, 2) → 100  |
    | powerN(10, 3) → 1000 |
    |_____________________*/

    public static final int powerN(int base, int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _PowerN.Validate(true);  // pass 'false' to print failed tests only.
    }
}
