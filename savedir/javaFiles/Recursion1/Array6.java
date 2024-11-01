package Recursion1;
import Recursion1.Testcases._Array6;

// https://codingbat.com/prob/p108997
// Difficulty: 345.0

public final class Array6
{
    /* Given an array of ints, compute recursively if the array contains a 6. 
    We'll use the convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | nums (int[])    | index | expected  |
    |                 | (int) | (boolean) |
    |_________________|_______|___________|
    | {1, 6, 4}       | 0     | true      |
    | {1, 4}          | 0     | false     |
    | {6}             | 0     | true      |
    | {}              | 0     | false     |
    | {6, 2, 2}       | 0     | true      |
    | {2, 5}          | 0     | false     |
    | {1, 9, 4, 6, 6} | 0     | true      |
    | {2, 5, 6}       | 0     | true      |
    |_________________|_______|__________*/

    public static final boolean array6(int[] nums, int index)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Array6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
