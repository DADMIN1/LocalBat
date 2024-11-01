package Recursion1;
import Recursion1.Testcases._PowerN;

// https://codingbat.com/prob/p158888
// Difficulty: 327.0

public final class PowerN
{
    /* Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, 
    so powerN(3, 2) is 9 (3 squared). */

    /*__________________________
    |         Testcases         |
    |___________________________|
    |  base | n (int) | returns |
    | (int) |         |  (int)  |
    |_______|_________|_________|
    |   3   |    1    |    3    |
    |   3   |    2    |    9    |
    |   3   |    3    |    27   |
    |   2   |    1    |    2    |
    |   2   |    2    |    4    |
    |   2   |    3    |    8    |
    |   2   |    4    |    16   |
    |   2   |    5    |    32   |
    |   10  |    1    |    10   |
    |   10  |    2    |   100   |
    |   10  |    3    |   1000  |
    |_______|_________|________*/

    public static final int powerN(int base, int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _PowerN.Validate(true);  // pass 'false' to print failed tests only.
    }
}
