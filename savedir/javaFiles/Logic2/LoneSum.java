package Logic2;
import Logic2.Testcases._LoneSum;

// https://codingbat.com/prob/p148972
// Difficulty: 206.0

public final class LoneSum
{
    /* Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, 
    it does not count towards the sum. */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | a (int) | b (int) | c (int) | returns |
    |         |         |         |  (int)  |
    |_________|_________|_________|_________|
    |    1    |    2    |    3    |    6    |
    |    3    |    2    |    3    |    2    |
    |    3    |    3    |    3    |    0    |
    |    9    |    2    |    2    |    9    |
    |    2    |    2    |    9    |    9    |
    |    2    |    9    |    2    |    9    |
    |    2    |    9    |    3    |    14   |
    |    4    |    2    |    3    |    9    |
    |    1    |    3    |    1    |    3    |
    |_________|_________|_________|________*/

    public static final int loneSum(int a, int b, int c)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _LoneSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
