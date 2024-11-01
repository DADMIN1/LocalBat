package Recursion1;
import Recursion1.Testcases._Triangle;

// https://codingbat.com/prob/p194781
// Difficulty: 315.0

public final class Triangle
{
    /* We have triangle made of blocks. The topmost row has 1 block, 
    the next row down has 2 blocks, the next row has 3 blocks, 
    and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows. */

    /*________________
    |    Testcases    |
    |_________________|
    |  rows | returns |
    | (int) |  (int)  |
    |_______|_________|
    |   0   |    0    |
    |   1   |    1    |
    |   2   |    3    |
    |   3   |    6    |
    |   4   |    10   |
    |   5   |    15   |
    |   6   |    21   |
    |   7   |    28   |
    |_______|________*/

    public static final int triangle(int rows)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Triangle.Validate(true);  // pass 'false' to print failed tests only.
    }
}
