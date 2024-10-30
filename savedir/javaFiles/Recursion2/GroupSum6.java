package Recursion2;
import Recursion2.Testcases._GroupSum6;

// https://codingbat.com/prob/p199368
// Difficulty: 406.0

public final class GroupSum6
{
    /* Given an array of ints, is it possible to choose a group of some of the ints, 
    beginning at the start index, such that the group sums to the given target? However, 
    with the additional constraint that all 6's must be chosen. 
    (No loops needed.) */

    /*_______________________________________________
    |                   Testcases                    |
    |________________________________________________|
    | start | nums (int[])      | target | expected  |
    | (int) |                   | (int)  | (boolean) |
    |_______|___________________|________|___________|
    | 0     | { 5, 6, 2 }       | 8      | true      |
    | 0     | { 5, 6, 2 }       | 9      | false     |
    | 0     | { 5, 6, 2 }       | 7      | false     |
    | 0     | { 1 }             | 1      | true      |
    | 0     | { 9 }             | 1      | false     |
    | 0     | {  }              | 0      | true      |
    | 0     | { 3, 2, 4, 6 }    | 8      | true      |
    | 0     | { 6, 2, 4, 3 }    | 8      | true      |
    | 0     | { 5, 2, 4, 6 }    | 9      | false     |
    | 0     | { 6, 2, 4, 5 }    | 9      | false     |
    | 0     | { 3, 2, 4, 6 }    | 3      | false     |
    | 0     | { 1, 6, 2, 6, 4 } | 12     | true      |
    | 0     | { 1, 6, 2, 6, 4 } | 13     | true      |
    | 0     | { 1, 6, 2, 6, 4 } | 4      | false     |
    | 0     | { 1, 6, 2, 6, 4 } | 9      | false     |
    | 0     | { 1, 6, 2, 6, 5 } | 14     | true      |
    | 0     | { 1, 6, 2, 6, 5 } | 15     | true      |
    | 0     | { 1, 6, 2, 6, 5 } | 16     | false     |
    |_______|___________________|________|__________*/

    public static final boolean groupSum6(int start, int[] nums, int target)
    {
        return false;
    }

    public static final void main(String[] args) {
        _GroupSum6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
