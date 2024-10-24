package Logic2;
import Logic2.Testcases._EvenlySpaced;

// https://codingbat.com/prob/p198700
// Difficulty: 221.0

public class EvenlySpaced
{
    /* Given three ints, a b c, one of them is small, one is medium and one is large. 
    Return true if the three values are evenly spaced, 
    so the difference between small and medium is the same as the difference between medium and large. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | evenlySpaced(2, 4, 6)   → true  |
    | evenlySpaced(4, 6, 2)   → true  |
    | evenlySpaced(4, 6, 3)   → false |
    | evenlySpaced(6, 2, 4)   → true  |
    | evenlySpaced(6, 2, 8)   → false |
    | evenlySpaced(2, 2, 2)   → true  |
    | evenlySpaced(2, 2, 3)   → false |
    | evenlySpaced(9, 10, 11) → true  |
    | evenlySpaced(10, 9, 11) → true  |
    | evenlySpaced(10, 9, 9)  → false |
    | evenlySpaced(2, 4, 4)   → false |
    | evenlySpaced(2, 2, 4)   → false |
    | evenlySpaced(3, 6, 12)  → false |
    | evenlySpaced(12, 3, 6)  → false |
    |________________________________*/

    public static boolean evenlySpaced(int a, int b, int c)
    {
        return false;
    }

    public static void main(String[] args) {
        _EvenlySpaced.Validate(true);  // pass 'false' to print failed tests only.
    }
}
