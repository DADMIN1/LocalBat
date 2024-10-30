package Logic1;
import Logic1.Testcases._RedTicket;

// https://codingbat.com/prob/p170833
// Difficulty: 157.0

public final class RedTicket
{
    /* You have a red lottery ticket showing ints a, b, and c, 
    each of which is 0, 1, or 2. If they are all the value 2, 
    the result is 10. Otherwise if they are all the same, the result is 5. 
    Otherwise so long as both b and c are different from a, 
    the result is 1. Otherwise the result is 0. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | a     | b     | c     | expected |
    | (int) | (int) | (int) | (int)    |
    |_______|_______|_______|__________|
    | 2     | 2     | 2     | 10       |
    | 2     | 2     | 1     | 0        |
    | 0     | 0     | 0     | 5        |
    | 2     | 0     | 0     | 1        |
    | 1     | 1     | 1     | 5        |
    | 1     | 2     | 1     | 0        |
    | 1     | 2     | 0     | 1        |
    | 0     | 2     | 2     | 1        |
    | 1     | 2     | 2     | 1        |
    | 0     | 2     | 0     | 0        |
    | 1     | 1     | 2     | 0        |
    |_______|_______|_______|_________*/

    public static final int redTicket(int a, int b, int c)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _RedTicket.Validate(true);  // pass 'false' to print failed tests only.
    }
}
