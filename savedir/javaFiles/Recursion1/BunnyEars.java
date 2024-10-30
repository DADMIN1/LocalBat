package Recursion1;
import Recursion1.Testcases._BunnyEars;

// https://codingbat.com/prob/p183649
// Difficulty: 306.0

public final class BunnyEars
{
    /* We have a number of bunnies and each bunny has two big floppy ears. 
    We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication). */

    /*___________________
    |     Testcases      |
    |____________________|
    | bunnies | expected |
    | (int)   | (int)    |
    |_________|__________|
    | 0       | 0        |
    | 1       | 2        |
    | 2       | 4        |
    | 3       | 6        |
    | 4       | 8        |
    | 5       | 10       |
    | 12      | 24       |
    | 50      | 100      |
    | 234     | 468      |
    |_________|_________*/

    public static final int bunnyEars(int bunnies)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _BunnyEars.Validate(true);  // pass 'false' to print failed tests only.
    }
}
