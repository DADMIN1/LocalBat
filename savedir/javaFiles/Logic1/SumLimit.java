package Logic1;
import Logic1.Testcases._SumLimit;

// https://codingbat.com/prob/p118077
// Difficulty: 169

public final class SumLimit
{
    /* Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
    If the sum has more digits than a, just return a without b. 
    (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.) */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | sumLimit(2, 3)        → 5        |
    | sumLimit(8, 3)        → 8        |
    | sumLimit(8, 1)        → 9        |
    | sumLimit(11, 39)      → 50       |
    | sumLimit(11, 99)      → 11       |
    | sumLimit(0, 0)        → 0        |
    | sumLimit(99, 0)       → 99       |
    | sumLimit(99, 1)       → 99       |
    | sumLimit(123, 1)      → 124      |
    | sumLimit(1, 123)      → 1        |
    | sumLimit(23, 60)      → 83       |
    | sumLimit(23, 80)      → 23       |
    | sumLimit(9000, 1)     → 9001     |
    | sumLimit(90000000, 1) → 90000001 |
    | sumLimit(9000, 1000)  → 9000     |
    |_________________________________*/

    public static final int sumLimit(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _SumLimit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
