package Logic2;
import Logic2.Testcases._LuckySum;

// https://codingbat.com/prob/p130788
// Difficulty: 209.0

public final class LuckySum
{
    /* Given 3 int values, a b c, return their sum. However, 
    if one of the values is 13 then it does not count towards the sum and values to its right do not count. 
    So for example, if b is 13, then both b and c do not count. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | a     | b     | c     | expected |
    | (int) | (int) | (int) | (int)    |
    |_______|_______|_______|__________|
    | 1     | 2     | 3     | 6        |
    | 1     | 2     | 13    | 3        |
    | 1     | 13    | 3     | 1        |
    | 1     | 13    | 13    | 1        |
    | 6     | 5     | 2     | 13       |
    | 13    | 2     | 3     | 0        |
    | 13    | 2     | 13    | 0        |
    | 13    | 13    | 2     | 0        |
    | 9     | 4     | 13    | 13       |
    | 8     | 13    | 2     | 8        |
    | 7     | 2     | 1     | 10       |
    | 3     | 3     | 13    | 6        |
    |_______|_______|_______|_________*/

    public static final int luckySum(int a, int b, int c)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _LuckySum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
