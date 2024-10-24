package Logic1;
import Logic1.Testcases._WithoutDoubles;

// https://codingbat.com/prob/p115233
// Difficulty: 151.0

public class WithoutDoubles
{
    /* Return the sum of two 6-sided dice rolls, each in the range 1..6. 
    However, if noDoubles is true, if the two dice show the same value, 
    increment one die to the next value, wrapping around to 1 if its value was 6. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | withoutDoubles(2, 3, true)  → 5  |
    | withoutDoubles(3, 3, true)  → 7  |
    | withoutDoubles(3, 3, false) → 6  |
    | withoutDoubles(2, 3, false) → 5  |
    | withoutDoubles(5, 4, true)  → 9  |
    | withoutDoubles(5, 4, false) → 9  |
    | withoutDoubles(5, 5, true)  → 11 |
    | withoutDoubles(5, 5, false) → 10 |
    | withoutDoubles(6, 6, true)  → 7  |
    | withoutDoubles(6, 6, false) → 12 |
    | withoutDoubles(1, 6, true)  → 7  |
    | withoutDoubles(6, 1, false) → 7  |
    |_________________________________*/

    public static int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        return 0;
    }

    public static void main(String[] args) {
        _WithoutDoubles.Validate(true);  // pass 'false' to print failed tests only.
    }
}
