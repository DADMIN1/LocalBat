package Array1;
import Array1.Testcases._Start1;

// https://codingbat.com/prob/p109660
// Difficulty: 151.0

public final class Start1
{
    /* Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | start1([1, 2, 3], [1, 3]) → 2 |
    | start1([7, 2, 3], [1])    → 1 |
    | start1([1, 2], [])        → 1 |
    | start1([], [1, 2])        → 1 |
    | start1([7], [])           → 0 |
    | start1([7], [1])          → 1 |
    | start1([1], [1])          → 2 |
    | start1([7], [8])          → 0 |
    | start1([], [])            → 0 |
    | start1([1, 3], [1])       → 2 |
    |______________________________*/

    public static final int start1(int[] a, int[] b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Start1.Validate(true);  // pass 'false' to print failed tests only.
    }
}
