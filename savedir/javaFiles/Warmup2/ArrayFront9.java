package Warmup2;
import Warmup2.Testcases._ArrayFront9;

// https://codingbat.com/prob/p186031
// Difficulty: 221.0

public final class ArrayFront9
{
    /* Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
    The array length may be less than 4. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | arrayFront9([1, 2, 9, 3, 4]) → true  |
    | arrayFront9([1, 2, 3, 4, 9]) → false |
    | arrayFront9([1, 2, 3, 4, 5]) → false |
    | arrayFront9([9, 2, 3])       → true  |
    | arrayFront9([1, 9, 9])       → true  |
    | arrayFront9([1, 2, 3])       → false |
    | arrayFront9([1, 9])          → true  |
    | arrayFront9([5, 5])          → false |
    | arrayFront9([2])             → false |
    | arrayFront9([9])             → true  |
    | arrayFront9([])              → false |
    | arrayFront9([3, 9, 2, 3, 3]) → true  |
    |_____________________________________*/

    public static final boolean arrayFront9(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _ArrayFront9.Validate(true);  // pass 'false' to print failed tests only.
    }
}
