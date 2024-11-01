package Recursion1;
import Recursion1.Testcases._Array11;

// https://codingbat.com/prob/p135988
// Difficulty: 348.0

public final class Array11
{
    /* Given an array of ints, compute recursively the number of times that the value 11 appears in the array. 
    We'll use the convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | nums (int[])         | index | expected |
    |                      | (int) | (int)    |
    |______________________|_______|__________|
    | {1, 2, 11}           | 0     | 1        |
    | {11, 11}             | 0     | 2        |
    | {1, 2, 3, 4}         | 0     | 0        |
    | {1, 11, 3, 11, 11}   | 0     | 3        |
    | {11}                 | 0     | 1        |
    | {1}                  | 0     | 0        |
    | {}                   | 0     | 0        |
    | {11, 2, 3, 4, 11, 5} | 0     | 2        |
    | {11, 5, 11}          | 0     | 2        |
    |______________________|_______|_________*/

    public static final int array11(int[] nums, int index)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Array11.Validate(true);  // pass 'false' to print failed tests only.
    }
}
