package Warmup1;
import Warmup1.Testcases._Makes10;

// https://codingbat.com/prob/p182873
// Difficulty: 118.0

public final class Makes10
{
    /* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | a     | b     | expected  |
    | (int) | (int) | (boolean) |
    |_______|_______|___________|
    | 9     | 10    | true      |
    | 9     | 9     | false     |
    | 1     | 9     | true      |
    | 10    | 1     | true      |
    | 10    | 10    | true      |
    | 8     | 2     | true      |
    | 8     | 3     | false     |
    | 10    | 42    | true      |
    | 12    | -2    | true      |
    |_______|_______|__________*/

    public static final boolean makes10(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Makes10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
