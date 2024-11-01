package Recursion1;
import Recursion1.Testcases._BunnyEars2;

// https://codingbat.com/prob/p107330
// Difficulty: 312.0

public final class BunnyEars2
{
    /* We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 
    3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, 
    because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 
    2, ... n (without loops or multiplication). */

    /*__________________
    |     Testcases     |
    |___________________|
    | bunnies | returns |
    |  (int)  |  (int)  |
    |_________|_________|
    |    0    |    0    |
    |    1    |    2    |
    |    2    |    5    |
    |    3    |    7    |
    |    4    |    10   |
    |    5    |    12   |
    |    6    |    15   |
    |    10   |    25   |
    |_________|________*/

    public static final int bunnyEars2(int bunnies)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _BunnyEars2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
