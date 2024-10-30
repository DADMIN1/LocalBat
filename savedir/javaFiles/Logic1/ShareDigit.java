package Logic1;
import Logic1.Testcases._ShareDigit;

// https://codingbat.com/prob/p153748
// Difficulty: 166.0

public final class ShareDigit
{
    /* Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, 
    such as the 2 in 12 and 23. (Note: division, e.g. n/10, 
    gives the left digit while the % "mod" n%10 gives the right digit.) */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | a     | b     | expected  |
    | (int) | (int) | (boolean) |
    |_______|_______|___________|
    | 12    | 23    | true      |
    | 12    | 43    | false     |
    | 12    | 44    | false     |
    | 23    | 12    | true      |
    | 23    | 39    | true      |
    | 23    | 19    | false     |
    | 30    | 90    | true      |
    | 30    | 91    | false     |
    | 55    | 55    | true      |
    | 55    | 44    | false     |
    |_______|_______|__________*/

    public static final boolean shareDigit(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _ShareDigit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
