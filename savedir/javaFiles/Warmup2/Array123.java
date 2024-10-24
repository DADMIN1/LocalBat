package Warmup2;
import Warmup2.Testcases._Array123;

// https://codingbat.com/prob/p136041
// Difficulty: 224.0

public class Array123
{
    /* Given an array of ints, return true if the sequence of numbers 1, 
    2, 3 appears in the array somewhere. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | array123([1, 1, 2, 3, 1])    → true  |
    | array123([1, 1, 2, 4, 1])    → false |
    | array123([1, 1, 2, 1, 2, 3]) → true  |
    | array123([1, 1, 2, 1, 2, 1]) → false |
    | array123([1, 2, 3, 1, 2, 3]) → true  |
    | array123([1, 2, 3])          → true  |
    | array123([1, 1, 1])          → false |
    | array123([1, 2])             → false |
    | array123([1])                → false |
    | array123([])                 → false |
    |_____________________________________*/

    public static boolean array123(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _Array123.Validate(true);  // pass 'false' to print failed tests only.
    }
}
