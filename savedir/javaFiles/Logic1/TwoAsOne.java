package Logic1;
import Logic1.Testcases._TwoAsOne;

// https://codingbat.com/prob/p113261
// Difficulty: 136.0

public final class TwoAsOne
{
    /* Given three ints, a b c, return true if it is possible to add two of the ints to get the third. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | a     | b     | c     | expected  |
    | (int) | (int) | (int) | (boolean) |
    |_______|_______|_______|___________|
    | 1     | 2     | 3     | true      |
    | 3     | 1     | 2     | true      |
    | 3     | 2     | 2     | false     |
    | 2     | 3     | 1     | true      |
    | 5     | 3     | -2    | true      |
    | 5     | 3     | -3    | false     |
    | 2     | 5     | 3     | true      |
    | 9     | 5     | 5     | false     |
    | 9     | 4     | 5     | true      |
    | 5     | 4     | 9     | true      |
    | 3     | 3     | 0     | true      |
    | 3     | 3     | 2     | false     |
    |_______|_______|_______|__________*/

    public static final boolean twoAsOne(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        _TwoAsOne.Validate(true);  // pass 'false' to print failed tests only.
    }
}
