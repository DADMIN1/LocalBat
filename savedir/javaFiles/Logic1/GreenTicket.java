package Logic1;
import Logic1.Testcases._GreenTicket;

// https://codingbat.com/prob/p120633
// Difficulty: 160.0

public final class GreenTicket
{
    /* You have a green lottery ticket, with ints a, b, and c on it. 
    If the numbers are all different from each other, the result is 0. 
    If all of the numbers are the same, the result is 20. If two of the numbers are the same, 
    the result is 10. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | a     | b     | c     | expected |
    | (int) | (int) | (int) | (int)    |
    |_______|_______|_______|__________|
    | 1     | 2     | 3     | 0        |
    | 2     | 2     | 2     | 20       |
    | 1     | 1     | 2     | 10       |
    | 2     | 1     | 1     | 10       |
    | 1     | 2     | 1     | 10       |
    | 3     | 2     | 1     | 0        |
    | 0     | 0     | 0     | 20       |
    | 2     | 0     | 0     | 10       |
    | 0     | 9     | 10    | 0        |
    | 0     | 10    | 0     | 10       |
    | 9     | 9     | 9     | 20       |
    | 9     | 0     | 9     | 10       |
    |_______|_______|_______|_________*/

    public static final int greenTicket(int a, int b, int c)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _GreenTicket.Validate(true);  // pass 'false' to print failed tests only.
    }
}
