package Warmup1;
import Warmup1.Testcases._LoneTeen;

// https://codingbat.com/prob/p165701
// Difficulty: 157.0

public final class LoneTeen
{
    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 2 int values, return true if one or the other is teen, 
    but not both. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | a     | b     | expected  |
    | (int) | (int) | (boolean) |
    |_______|_______|___________|
    | 13    | 99    | true      |
    | 21    | 19    | true      |
    | 13    | 13    | false     |
    | 14    | 20    | true      |
    | 20    | 15    | true      |
    | 16    | 17    | false     |
    | 16    | 9     | true      |
    | 16    | 18    | false     |
    | 13    | 19    | false     |
    | 13    | 20    | true      |
    | 6     | 18    | true      |
    | 99    | 13    | true      |
    | 99    | 99    | false     |
    |_______|_______|__________*/

    public static final boolean loneTeen(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _LoneTeen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
