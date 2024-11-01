package Array1;
import Array1.Testcases._Unlucky1;

// https://codingbat.com/prob/p197308
// Difficulty: 175.0

public final class Unlucky1
{
    /* We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    |    nums (int[])    |  returns  |
    |                    | (boolean) |
    |____________________|___________|
    | {1, 3, 4, 5}       |    true   |
    | {2, 1, 3, 4, 5}    |    true   |
    | {1, 1, 1}          |   false   |
    | {1, 3, 1}          |    true   |
    | {1, 1, 3}          |    true   |
    | {1, 2, 3}          |   false   |
    | {3, 3, 3}          |   false   |
    | {1, 3}             |    true   |
    | {1, 4}             |   false   |
    | {1}                |   false   |
    | {}                 |   false   |
    | {1, 1, 1, 3, 1}    |   false   |
    | {1, 1, 3, 1, 1}    |    true   |
    | {1, 1, 1, 1, 3}    |    true   |
    | {1, 4, 1, 5}       |   false   |
    | {1, 1, 2, 3}       |   false   |
    | {2, 3, 2, 1}       |   false   |
    | {2, 3, 1, 3}       |    true   |
    | {1, 2, 3, 4, 1, 3} |    true   |
    |____________________|__________*/

    public static final boolean unlucky1(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Unlucky1.Validate(true);  // pass 'false' to print failed tests only.
    }
}
