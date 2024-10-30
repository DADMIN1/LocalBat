package Logic1;
import Logic1.Testcases._TeenSum;

// https://codingbat.com/prob/p178728
// Difficulty: 127.0

public final class TeenSum
{
    /* Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, 
    are extra lucky. So if either value is a teen, just return 19. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | a     | b     | expected |
    | (int) | (int) | (int)    |
    |_______|_______|__________|
    | 3     | 4     | 7        |
    | 10    | 13    | 19       |
    | 13    | 2     | 19       |
    | 3     | 19    | 19       |
    | 13    | 13    | 19       |
    | 10    | 10    | 20       |
    | 6     | 14    | 19       |
    | 15    | 2     | 19       |
    | 19    | 19    | 19       |
    | 19    | 20    | 19       |
    | 2     | 18    | 19       |
    | 12    | 4     | 16       |
    | 2     | 20    | 22       |
    | 2     | 17    | 19       |
    | 2     | 16    | 19       |
    | 6     | 7     | 13       |
    |_______|_______|_________*/

    public static final int teenSum(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _TeenSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
