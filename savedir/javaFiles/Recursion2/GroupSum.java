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

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    | start |  nums (int[]) | target |  returns  |
    | (int) |               | (int)  | (boolean) |
    |_______|_______________|________|___________|
    |   0   | {2, 4, 8}     |   10   |    true   |
    |   0   | {2, 4, 8}     |   14   |    true   |
    |   0   | {2, 4, 8}     |   9    |   false   |
    |   0   | {2, 4, 8}     |   8    |    true   |
    |   1   | {2, 4, 8}     |   8    |    true   |
    |   1   | {2, 4, 8}     |   2    |   false   |
    |   0   | {1}           |   1    |    true   |
    |   0   | {9}           |   1    |   false   |
    |   1   | {9}           |   0    |    true   |
    |   0   | {}            |   0    |    true   |
    |   0   | {10, 2, 2, 5} |   17   |    true   |
    |   0   | {10, 2, 2, 5} |   15   |    true   |
    |   0   | {10, 2, 2, 5} |   9    |    true   |
    |_______|_______________|________|__________*/

    public static final boolean groupSum(int start, int[] nums, int target)
    {
        return false;
    }

    public static final void main(String[] args) {
        _GroupSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
