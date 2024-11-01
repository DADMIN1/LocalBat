package Recursion1;
import Recursion1.Testcases._Array220;

// https://codingbat.com/prob/p173469
// Difficulty: 351.0

public final class Array220
{
    /* Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. 
    We'll use the convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. */

    /*________________________________________________
    |                    Testcases                    |
    |_________________________________________________|
    |         nums (int[])        | index |  returns  |
    |                             | (int) | (boolean) |
    |_____________________________|_______|___________|
    | {1, 2, 20}                  |   0   |    true   |
    | {3, 30}                     |   0   |    true   |
    | {3}                         |   0   |   false   |
    | {}                          |   0   |   false   |
    | {3, 3, 30, 4}               |   0   |    true   |
    | {2, 19, 4}                  |   0   |   false   |
    | {20, 2, 21}                 |   0   |   false   |
    | {20, 2, 21, 210}            |   0   |    true   |
    | {2, 200, 2000}              |   0   |    true   |
    | {0, 0}                      |   0   |    true   |
    | {1, 2, 3, 4, 5, 6}          |   0   |   false   |
    | {1, 2, 3, 4, 5, 50, 6}      |   0   |    true   |
    | {1, 2, 3, 4, 5, 51, 6}      |   0   |   false   |
    | {1, 2, 3, 4, 4, 50, 500, 6} |   0   |    true   |
    |_____________________________|_______|__________*/

    public static final boolean array220(int[] nums, int index)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Array220.Validate(true);  // pass 'false' to print failed tests only.
    }
}
