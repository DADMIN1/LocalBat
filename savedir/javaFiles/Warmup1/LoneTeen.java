package Warmup1;
import Warmup1.Testcases._LoneTeen;

// https://codingbat.com/prob/p165701
// Difficulty: 157.0

public class LoneTeen
{
    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 2 int values, return true if one or the other is teen, 
    but not both. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | loneTeen(13, 99) → true  |
    | loneTeen(21, 19) → true  |
    | loneTeen(13, 13) → false |
    | loneTeen(14, 20) → true  |
    | loneTeen(20, 15) → true  |
    | loneTeen(16, 17) → false |
    | loneTeen(16, 9)  → true  |
    | loneTeen(16, 18) → false |
    | loneTeen(13, 19) → false |
    | loneTeen(13, 20) → true  |
    | loneTeen(6, 18)  → true  |
    | loneTeen(99, 13) → true  |
    | loneTeen(99, 99) → false |
    |_________________________*/

    public static boolean loneTeen(int a, int b)
    {
        return false;
    }

    public static void main(String[] args) {
        _LoneTeen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
