package Recursion1;
import Recursion1.Testcases._BunnyEars;

// https://codingbat.com/prob/p183649
// Difficulty: 306.0

public final class BunnyEars
{
    /* We have a number of bunnies and each bunny has two big floppy ears. 
    We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication). */

    /*__________________
    |     Testcases     |
    |___________________|
    | bunnies | returns |
    |  (int)  |  (int)  |
    |_________|_________|
    |    0    |    0    |
    |    1    |    2    |
    |    2    |    4    |
    |    3    |    6    |
    |    4    |    8    |
    |    5    |    10   |
    |    12   |    24   |
    |    50   |   100   |
    |   234   |   468   |
    |_________|________*/

    public static final int bunnyEars(int bunnies)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_BunnyEars.printSuccesses = false;  // set 'false' to print failing tests only.
        //_BunnyEars.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _BunnyEars.Validate();
    }
}
