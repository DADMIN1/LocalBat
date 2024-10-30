package Logic2;
import Logic2.Testcases._RoundSum;

// https://codingbat.com/prob/p186753
// Difficulty: 214

public final class RoundSum
{
    /* For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, 
    so 15 rounds up to 20. Alternately, 
    round down to the previous multiple of 10 if its rightmost digit is less than 5, 
    so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. 
    To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. 
    Write the helper entirely below and at the same indent level as roundSum(). */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | a     | b     | c     | expected |
    | (int) | (int) | (int) | (int)    |
    |_______|_______|_______|__________|
    | 16    | 17    | 18    | 60       |
    | 12    | 13    | 14    | 30       |
    | 6     | 4     | 4     | 10       |
    | 4     | 6     | 5     | 20       |
    | 4     | 4     | 6     | 10       |
    | 9     | 4     | 4     | 10       |
    | 0     | 0     | 1     | 0        |
    | 0     | 9     | 0     | 10       |
    | 10    | 10    | 19    | 40       |
    | 20    | 30    | 40    | 90       |
    | 45    | 21    | 30    | 100      |
    | 23    | 11    | 26    | 60       |
    | 23    | 24    | 25    | 70       |
    | 25    | 24    | 25    | 80       |
    | 23    | 24    | 29    | 70       |
    | 11    | 24    | 36    | 70       |
    | 24    | 36    | 32    | 90       |
    | 14    | 12    | 26    | 50       |
    | 12    | 10    | 24    | 40       |
    |_______|_______|_______|_________*/

    public static final int roundSum(int a, int b, int c)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _RoundSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
