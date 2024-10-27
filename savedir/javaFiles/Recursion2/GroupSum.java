package Recursion2;
import Recursion2.Testcases._GroupSum;

// https://codingbat.com/prob/p145416
// Difficulty: 403.0

public final class GroupSum
{
    /* Given an array of ints, is it possible to choose a group of some of the ints, 
    such that the group sums to the given target? This is a classic backtracking recursion problem. 
    Once you understand the recursive backtracking strategy in this problem, 
    you can use the same pattern for many problems to search a space of choices. 
    Rather than looking at the whole array, 
    our convention is to consider the part of the array starting at index start and continuing to the end of the array. 
    The caller can specify the whole array simply by passing start as 0. 
    No loops are needed -- the recursive calls progress down the array. */

    /*_______________________________________
    |               Testcases                |
    |________________________________________|
    | groupSum(0, [2, 4, 8], 10)     → true  |
    | groupSum(0, [2, 4, 8], 14)     → true  |
    | groupSum(0, [2, 4, 8], 9)      → false |
    | groupSum(0, [2, 4, 8], 8)      → true  |
    | groupSum(1, [2, 4, 8], 8)      → true  |
    | groupSum(1, [2, 4, 8], 2)      → false |
    | groupSum(0, [1], 1)            → true  |
    | groupSum(0, [9], 1)            → false |
    | groupSum(1, [9], 0)            → true  |
    | groupSum(0, [], 0)             → true  |
    | groupSum(0, [10, 2, 2, 5], 17) → true  |
    | groupSum(0, [10, 2, 2, 5], 15) → true  |
    | groupSum(0, [10, 2, 2, 5], 9)  → true  |
    |_______________________________________*/

    public static final boolean groupSum(int start, int[] nums, int target)
    {
        return false;
    }

    public static final void main(String[] args) {
        _GroupSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
