package Recursion1;
import Recursion1.Testcases._Triangle;

// https://codingbat.com/prob/p194781
// Difficulty: 315.0

public final class Triangle
{
    /* We have triangle made of blocks. The topmost row has 1 block, 
    the next row down has 2 blocks, the next row has 3 blocks, 
    and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows. */

    /*_________________
    |    Testcases     |
    |__________________|
    | triangle(0) → 0  |
    | triangle(1) → 1  |
    | triangle(2) → 3  |
    | triangle(3) → 6  |
    | triangle(4) → 10 |
    | triangle(5) → 15 |
    | triangle(6) → 21 |
    | triangle(7) → 28 |
    |_________________*/

    public static final int triangle(int rows)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Triangle.Validate(true);  // pass 'false' to print failed tests only.
    }
}
