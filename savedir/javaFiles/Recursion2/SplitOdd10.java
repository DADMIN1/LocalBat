package Recursion2;
import Recursion2.Testcases._SplitOdd10;

// https://codingbat.com/prob/p171660
// Difficulty: 421.0

public class SplitOdd10
{
    /* Given an array of ints, is it possible to divide the ints into two groups, 
    so that the sum of one group is a multiple of 10, and the sum of the other group is odd. 
    Every int must be in one group or the other. 
    Write a recursive helper method that takes whatever arguments you like, 
    and make the initial call to your recursive helper from splitOdd10(). 
    (No loops needed.) */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | splitOdd10([5, 5, 5])        → true  |
    | splitOdd10([5, 5, 6])        → false |
    | splitOdd10([5, 5, 6, 1])     → true  |
    | splitOdd10([6, 5, 5, 1])     → true  |
    | splitOdd10([6, 5, 5, 1, 10]) → true  |
    | splitOdd10([6, 5, 5, 5, 1])  → false |
    | splitOdd10([1])              → true  |
    | splitOdd10([])               → false |
    | splitOdd10([10, 7, 5, 5])    → true  |
    | splitOdd10([10, 0, 5, 5])    → false |
    | splitOdd10([10, 7, 5, 5, 2]) → true  |
    | splitOdd10([10, 7, 5, 5, 1]) → false |
    |_____________________________________*/

    public static boolean splitOdd10(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _SplitOdd10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
