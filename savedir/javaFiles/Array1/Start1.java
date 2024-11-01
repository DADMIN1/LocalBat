package Array1;
import Array1.Testcases._Start1;

// https://codingbat.com/prob/p109660
// Difficulty: 151.0

public final class Start1
{
    /* Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | a (int[]) | b       | expected |
    |           | (int[]) | (int)    |
    |___________|_________|__________|
    | {1, 2, 3} | {1, 3}  | 2        |
    | {7, 2, 3} | {1}     | 1        |
    | {1, 2}    | {}      | 1        |
    | {}        | {1, 2}  | 1        |
    | {7}       | {}      | 0        |
    | {7}       | {1}     | 1        |
    | {1}       | {1}     | 2        |
    | {7}       | {8}     | 0        |
    | {}        | {}      | 0        |
    | {1, 3}    | {1}     | 2        |
    |___________|_________|_________*/

    public static final int start1(int[] a, int[] b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Start1.Validate(true);  // pass 'false' to print failed tests only.
    }
}
