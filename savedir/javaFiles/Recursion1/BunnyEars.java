package Recursion1;
import Recursion1.Testcases._BunnyEars;

// https://codingbat.com/prob/p183649
// Difficulty: 306.0

public final class BunnyEars
{
    /* We have a number of bunnies and each bunny has two big floppy ears. 
    We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication). */

    /*_____________________
    |      Testcases       |
    |______________________|
    | bunnyEars(0)   → 0   |
    | bunnyEars(1)   → 2   |
    | bunnyEars(2)   → 4   |
    | bunnyEars(3)   → 6   |
    | bunnyEars(4)   → 8   |
    | bunnyEars(5)   → 10  |
    | bunnyEars(12)  → 24  |
    | bunnyEars(50)  → 100 |
    | bunnyEars(234) → 468 |
    |_____________________*/

    public static final int bunnyEars(int bunnies)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _BunnyEars.Validate(true);  // pass 'false' to print failed tests only.
    }
}
