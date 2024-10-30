package Recursion2;
import Recursion2.Testcases._SplitArray;

// https://codingbat.com/prob/p185204
// Difficulty: 418.0

public final class SplitArray
{
    /* Given an array of ints, is it possible to divide the ints into two groups, 
    so that the sums of the two groups are the same. Every int must be in one group or the other. 
    Write a recursive helper method that takes whatever arguments you like, 
    and make the initial call to your recursive helper from splitArray(). 
    (No loops needed.) */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | nums (int[])              | expected  |
    |                           | (boolean) |
    |___________________________|___________|
    | { 2, 2 }                  | true      |
    | { 2, 3 }                  | false     |
    | { 5, 2, 3 }               | true      |
    | { 5, 2, 2 }               | false     |
    | { 1, 1, 1, 1, 1, 1 }      | true      |
    | { 1, 1, 1, 1, 1 }         | false     |
    | {  }                      | true      |
    | { 1 }                     | false     |
    | { 3, 5 }                  | false     |
    | { 5, 3, 2 }               | true      |
    | { 2, 2, 10, 10, 1, 1 }    | true      |
    | { 1, 2, 2, 10, 10, 1, 1 } | false     |
    | { 1, 2, 3, 10, 10, 1, 1 } | true      |
    |___________________________|__________*/

    public static final boolean splitArray(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SplitArray.Validate(true);  // pass 'false' to print failed tests only.
    }
}
