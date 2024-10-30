package Recursion2;
import Recursion2.Testcases._GroupSumClump;

// https://codingbat.com/prob/p105136
// Difficulty: 415.0

public final class GroupSumClump
{
    /* Given an array of ints, is it possible to choose a group of some of the ints, 
    such that the group sums to the given target, with this additional constraint: 
    if there are numbers in the array that are adjacent and the identical value, 
    they must either all be chosen, or none of them chosen. 
    For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, 
    all as a group. (one loop can be used to find the extent of the identical values). */

    /*_______________________________________________
    |                   Testcases                    |
    |________________________________________________|
    | start | nums (int[])      | target | expected  |
    | (int) |                   | (int)  | (boolean) |
    |_______|___________________|________|___________|
    | 0     | { 2, 4, 8 }       | 10     | true      |
    | 0     | { 1, 2, 4, 8, 1 } | 14     | true      |
    | 0     | { 2, 4, 4, 8 }    | 14     | false     |
    | 0     | { 8, 2, 2, 1 }    | 9      | true      |
    | 0     | { 8, 2, 2, 1 }    | 11     | false     |
    | 0     | { 1 }             | 1      | true      |
    | 0     | { 9 }             | 1      | false     |
    |_______|___________________|________|__________*/

    public static final boolean groupSumClump(int start, int[] nums, int target)
    {
        return false;
    }

    public static final void main(String[] args) {
        _GroupSumClump.Validate(true);  // pass 'false' to print failed tests only.
    }
}
