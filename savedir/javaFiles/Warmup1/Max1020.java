package Warmup1;
import Warmup1.Testcases._Max1020;

// https://codingbat.com/prob/p177372
// Difficulty: 178.0

public final class Max1020
{
    /* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
    or return 0 if neither is in that range. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | a (int) | b (int) | returns |
    |         |         |  (int)  |
    |_________|_________|_________|
    |    11   |    19   |    19   |
    |    19   |    11   |    19   |
    |    11   |    9    |    11   |
    |    9    |    21   |    0    |
    |    10   |    21   |    10   |
    |    21   |    10   |    10   |
    |    9    |    11   |    11   |
    |    23   |    10   |    10   |
    |    20   |    10   |    20   |
    |    7    |    20   |    20   |
    |    17   |    16   |    17   |
    |_________|_________|________*/

    public static final int max1020(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Max1020.Validate(true);  // pass 'false' to print failed tests only.
    }
}
