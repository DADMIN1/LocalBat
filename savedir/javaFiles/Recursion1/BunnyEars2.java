package Recursion1;
import Recursion1.Testcases._BunnyEars2;

// https://codingbat.com/prob/p107330
// Difficulty: 312.0

public class BunnyEars2
{
    /* We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 
    3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, 
    because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 
    2, ... n (without loops or multiplication). */

    /*____________________
    |      Testcases      |
    |_____________________|
    | bunnyEars2(0)  → 0  |
    | bunnyEars2(1)  → 2  |
    | bunnyEars2(2)  → 5  |
    | bunnyEars2(3)  → 7  |
    | bunnyEars2(4)  → 10 |
    | bunnyEars2(5)  → 12 |
    | bunnyEars2(6)  → 15 |
    | bunnyEars2(10) → 25 |
    |____________________*/

    public static int bunnyEars2(int bunnies)
    {
        return 0;
    }

    public static void main(String[] args) {
        _BunnyEars2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
