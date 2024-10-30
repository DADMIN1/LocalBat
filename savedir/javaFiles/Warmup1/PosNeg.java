package Warmup1;
import Warmup1.Testcases._PosNeg;

// https://codingbat.com/prob/p159227
// Difficulty: 124.0

public final class PosNeg
{
    /* Given 2 int values, return true if one is negative and one is positive. 
    Except if the parameter "negative" is true, then return true only if both are negative. */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | a     | b     | negative  | expected  |
    | (int) | (int) | (boolean) | (boolean) |
    |_______|_______|___________|___________|
    | 1     | -1    | false     | true      |
    | -1    | 1     | false     | true      |
    | -4    | -5    | true      | true      |
    | -4    | -5    | false     | false     |
    | -4    | 5     | false     | true      |
    | -4    | 5     | true      | false     |
    | 1     | 1     | false     | false     |
    | -1    | -1    | false     | false     |
    | 1     | -1    | true      | false     |
    | -1    | 1     | true      | false     |
    | 1     | 1     | true      | false     |
    | -1    | -1    | true      | true      |
    | 5     | -5    | false     | true      |
    | -6    | 6     | false     | true      |
    | -5    | -6    | false     | false     |
    | -2    | -1    | false     | false     |
    | 1     | 2     | false     | false     |
    | -5    | 6     | true      | false     |
    | -5    | -5    | true      | true      |
    |_______|_______|___________|__________*/

    public static final boolean posNeg(int a, int b, boolean negative)
    {
        return false;
    }

    public static final void main(String[] args) {
        _PosNeg.Validate(true);  // pass 'false' to print failed tests only.
    }
}
