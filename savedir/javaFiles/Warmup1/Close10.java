package Warmup1;
import Warmup1.Testcases._Close10;

// https://codingbat.com/prob/p172021
// Difficulty: 172.0

public class Close10
{
    /* Given 2 int values, return whichever value is nearest to the value 10, 
    or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. */

    /*_____________________
    |      Testcases       |
    |______________________|
    | close10(8, 13)  → 8  |
    | close10(13, 8)  → 8  |
    | close10(13, 7)  → 0  |
    | close10(7, 13)  → 0  |
    | close10(9, 13)  → 9  |
    | close10(13, 8)  → 8  |
    | close10(10, 12) → 10 |
    | close10(11, 10) → 10 |
    | close10(5, 21)  → 5  |
    | close10(0, 20)  → 0  |
    | close10(10, 10) → 0  |
    |_____________________*/

    public static int close10(int a, int b)
    {
        return 0;
    }

    public static void main(String[] args) {
        _Close10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
