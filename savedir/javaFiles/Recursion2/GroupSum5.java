package Recursion2;
import Recursion2.Testcases._GroupSum5;

// https://codingbat.com/prob/p138907
// Difficulty: 412.0

public final class GroupSum5
{
    /* Given an array of ints, is it possible to choose a group of some of the ints, 
    such that the group sums to the given target with these additional constraints: 
    all multiples of 5 in the array must be included in the group. 
    If the value immediately following a multiple of 5 is 1, 
    it must not be chosen. (No loops needed.) */

    /*_____________________________________________
    |                  Testcases                   |
    |______________________________________________|
    | start | nums (int[])    | target | expected  |
    | (int) |                 | (int)  | (boolean) |
    |_______|_________________|________|___________|
    | 0     | { 2, 5, 10, 4 } | 19     | true      |
    | 0     | { 2, 5, 10, 4 } | 17     | true      |
    | 0     | { 2, 5, 10, 4 } | 12     | false     |
    | 0     | { 2, 5, 4, 10 } | 12     | false     |
    | 0     | { 3, 5, 1 }     | 4      | false     |
    | 0     | { 3, 5, 1 }     | 5      | true      |
    | 0     | { 1, 3, 5 }     | 5      | true      |
    | 0     | { 3, 5, 1 }     | 9      | false     |
    | 0     | { 2, 5, 10, 4 } | 7      | false     |
    | 0     | { 2, 5, 10, 4 } | 15     | true      |
    | 0     | { 2, 5, 10, 4 } | 11     | false     |
    | 0     | { 1 }           | 1      | true      |
    | 0     | { 9 }           | 1      | false     |
    | 0     | { 9 }           | 0      | true      |
    | 0     | {  }            | 0      | true      |
    |_______|_________________|________|__________*/

    public static final boolean groupSum5(int start, int[] nums, int target)
    {
        return false;
    }

    public static final void main(String[] args) {
        _GroupSum5.Validate(true);  // pass 'false' to print failed tests only.
    }
}
