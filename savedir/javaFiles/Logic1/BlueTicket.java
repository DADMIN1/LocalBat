package Logic1;
import Logic1.Testcases._BlueTicket;

// https://codingbat.com/prob/p192267
// Difficulty: 163.0

public final class BlueTicket
{
    /* You have a blue lottery ticket, with ints a, b, and c on it. 
    This makes three pairs, which we'll call ab, bc, and ac. 
    Consider the sum of the numbers in each pair. If any pair sums to exactly 10, 
    the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, 
    the result is 5. Otherwise the result is 0. */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | a (int) | b (int) | c (int) | returns |
    |         |         |         |  (int)  |
    |_________|_________|_________|_________|
    |    9    |    1    |    0    |    10   |
    |    9    |    2    |    0    |    0    |
    |    6    |    1    |    4    |    10   |
    |    6    |    1    |    5    |    0    |
    |    10   |    0    |    0    |    10   |
    |    15   |    0    |    5    |    5    |
    |    5    |    15   |    5    |    10   |
    |    4    |    11   |    1    |    5    |
    |    13   |    2    |    3    |    5    |
    |    8    |    4    |    3    |    0    |
    |    8    |    4    |    2    |    10   |
    |    8    |    4    |    1    |    0    |
    |_________|_________|_________|________*/

    public static final int blueTicket(int a, int b, int c)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _BlueTicket.Validate(true);  // pass 'false' to print failed tests only.
    }
}
