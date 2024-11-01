package Recursion2;
import Recursion2.Testcases._SplitOdd10;

// https://codingbat.com/prob/p171660
// Difficulty: 421.0

public final class SplitOdd10
{
    /* Given an array of ints, is it possible to divide the ints into two groups, 
    so that the sum of one group is a multiple of 10, and the sum of the other group is odd. 
    Every int must be in one group or the other. 
    Write a recursive helper method that takes whatever arguments you like, 
    and make the initial call to your recursive helper from splitOdd10(). 
    (No loops needed.) */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | nums (int[])     | expected  |
    |                  | (boolean) |
    |__________________|___________|
    | {5, 5, 5}        | true      |
    | {5, 5, 6}        | false     |
    | {5, 5, 6, 1}     | true      |
    | {6, 5, 5, 1}     | true      |
    | {6, 5, 5, 1, 10} | true      |
    | {6, 5, 5, 5, 1}  | false     |
    | {1}              | true      |
    | {}               | false     |
    | {10, 7, 5, 5}    | true      |
    | {10, 0, 5, 5}    | false     |
    | {10, 7, 5, 5, 2} | true      |
    | {10, 7, 5, 5, 1} | false     |
    |__________________|__________*/

    public static final boolean splitOdd10(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SplitOdd10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
