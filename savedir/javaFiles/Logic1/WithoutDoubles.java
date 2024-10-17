// https://codingbat.com/prob/p115233
package Logic1;
import Logic1.Testcases._WithoutDoubles;

public class WithoutDoubles
{
    /* Return the sum of two 6-sided dice rolls, each in the range 1..6. 
    However, if noDoubles is true, if the two dice show the same value, 
    increment one die to the next value, wrapping around to 1 if its value was 6. */

    /*_________________________________
    |            Testcases            |
    ___________________________________
    | withoutDoubles(2, 3, true)  → 5 |
    | withoutDoubles(3, 3, true)  → 7 |
    | withoutDoubles(3, 3, false) → 6 |
    _________________________________*/

    public static int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        
    }

    public static void main(String[] args) {
        _WithoutDoubles.Validate(true);  // pass 'false' to print failed tests only.
    }
}
