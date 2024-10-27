package Recursion1;
import Recursion1.Testcases._Count7;

// https://codingbat.com/prob/p101409
// Difficulty: 321.0

public final class Count7
{
    /* Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
    so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

    /*______________________
    |       Testcases       |
    |_______________________|
    | count7(717)       → 2 |
    | count7(7)         → 1 |
    | count7(123)       → 0 |
    | count7(77)        → 2 |
    | count7(7123)      → 1 |
    | count7(771237)    → 3 |
    | count7(771737)    → 4 |
    | count7(47571)     → 2 |
    | count7(777777)    → 6 |
    | count7(70701277)  → 4 |
    | count7(777576197) → 5 |
    | count7(99999)     → 0 |
    | count7(99799)     → 1 |
    |______________________*/

    public static final int count7(int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Count7.Validate(true);  // pass 'false' to print failed tests only.
    }
}
