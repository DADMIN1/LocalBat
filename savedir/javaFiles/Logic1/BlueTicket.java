package Logic1;
import Logic1.Testcases._BlueTicket;

// https://codingbat.com/prob/p192267
// Difficulty: 163.0

public class BlueTicket
{
    /* You have a blue lottery ticket, with ints a, b, and c on it. 
    This makes three pairs, which we'll call ab, bc, and ac. 
    Consider the sum of the numbers in each pair. If any pair sums to exactly 10, 
    the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, 
    the result is 5. Otherwise the result is 0. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | blueTicket(9, 1, 0)  → 10 |
    | blueTicket(9, 2, 0)  → 0  |
    | blueTicket(6, 1, 4)  → 10 |
    | blueTicket(6, 1, 5)  → 0  |
    | blueTicket(10, 0, 0) → 10 |
    | blueTicket(15, 0, 5) → 5  |
    | blueTicket(5, 15, 5) → 10 |
    | blueTicket(4, 11, 1) → 5  |
    | blueTicket(13, 2, 3) → 5  |
    | blueTicket(8, 4, 3)  → 0  |
    | blueTicket(8, 4, 2)  → 10 |
    | blueTicket(8, 4, 1)  → 0  |
    |__________________________*/

    public static int blueTicket(int a, int b, int c)
    {
        return 0;
    }

    public static void main(String[] args) {
        _BlueTicket.Validate(true);  // pass 'false' to print failed tests only.
    }
}
