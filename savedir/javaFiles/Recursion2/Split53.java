package Recursion2;
import Recursion2.Testcases._Split53;

// https://codingbat.com/prob/p168295
// Difficulty: 424.0

public class Split53
{
    /* Given an array of ints, is it possible to divide the ints into two groups, 
    so that the sum of the two groups is the same, with these constraints: 
    all the values that are multiple of 5 must be in one group, 
    and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. 
    (No loops needed.) */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | split53([1, 1])              → true  |
    | split53([1, 1, 1])           → false |
    | split53([2, 4, 2])           → true  |
    | split53([2, 2, 2, 1])        → false |
    | split53([3, 3, 5, 1])        → true  |
    | split53([3, 5, 8])           → false |
    | split53([2, 4, 6])           → true  |
    | split53([3, 5, 6, 10, 3, 3]) → true  |
    |_____________________________________*/

    public static boolean split53(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _Split53.Validate(true);  // pass 'false' to print failed tests only.
    }
}
