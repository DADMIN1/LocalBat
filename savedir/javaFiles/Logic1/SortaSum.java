package Logic1;
import Logic1.Testcases._SortaSum;

// https://codingbat.com/prob/p183071
// Difficulty: 115.0

public class SortaSum
{
    /* Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
    are forbidden, so in that case just return 20. */

    /*______________________
    |       Testcases       |
    |_______________________|
    | sortaSum(3, 4)   → 7  |
    | sortaSum(9, 4)   → 20 |
    | sortaSum(10, 11) → 21 |
    | sortaSum(12, -3) → 9  |
    | sortaSum(-3, 12) → 9  |
    | sortaSum(4, 5)   → 9  |
    | sortaSum(4, 6)   → 20 |
    | sortaSum(14, 7)  → 21 |
    | sortaSum(14, 6)  → 20 |
    |______________________*/

    public static int sortaSum(int a, int b)
    {
        return 0;
    }

    public static void main(String[] args) {
        _SortaSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
