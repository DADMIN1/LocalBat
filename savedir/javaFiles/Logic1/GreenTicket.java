// https://codingbat.com/prob/p120633
package Logic1;
import Logic1.Testcases._GreenTicket;

public class GreenTicket
{
    /* You have a green lottery ticket, with ints a, b, and c on it. 
    If the numbers are all different from each other, the result is 0. 
    If all of the numbers are the same, the result is 20. If two of the numbers are the same, 
    the result is 10. */

    /*___________________________
    |         Testcases         |
    |___________________________|
    | greenTicket(1, 2, 3) → 0  |
    | greenTicket(2, 2, 2) → 20 |
    | greenTicket(1, 1, 2) → 10 |
    |__________________________*/

    public static int greenTicket(int a, int b, int c)
    {
        
    }

    public static void main(String[] args) {
        _GreenTicket.Validate(true);  // pass 'false' to print failed tests only.
    }
}
