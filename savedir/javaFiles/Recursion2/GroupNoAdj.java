package Recursion2;
import Recursion2.Testcases._GroupNoAdj;

// https://codingbat.com/prob/p169605
// Difficulty: 409.0

public final class GroupNoAdj
{
    /* Given an array of ints, is it possible to choose a group of some of the ints, 
    such that the group sums to the given target with this additional constraint: 
    If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. 
    (No loops needed.) */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    | start | nums (int[])     | target | expected  |
    | (int) |                  | (int)  | (boolean) |
    |_______|__________________|________|___________|
    | 0     | {2, 5, 10, 4}    | 12     | true      |
    | 0     | {2, 5, 10, 4}    | 14     | false     |
    | 0     | {2, 5, 10, 4}    | 7      | false     |
    | 0     | {2, 5, 10, 4, 2} | 7      | true      |
    | 0     | {2, 5, 10, 4}    | 9      | true      |
    | 0     | {10, 2, 2, 3, 3} | 15     | true      |
    | 0     | {10, 2, 2, 3, 3} | 7      | false     |
    | 0     | {}               | 0      | true      |
    | 0     | {1}              | 1      | true      |
    | 0     | {9}              | 1      | false     |
    | 0     | {9}              | 0      | true      |
    | 0     | {5, 10, 4, 1}    | 11     | true      |
    |_______|__________________|________|__________*/

    public static final boolean groupNoAdj(int start, int[] nums, int target)
    {
        return false;
    }

    public static final void main(String[] args) {
        _GroupNoAdj.Validate(true);  // pass 'false' to print failed tests only.
    }
}
