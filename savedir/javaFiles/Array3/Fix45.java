package Array3;
import Array3.Testcases._Fix45;

// https://codingbat.com/prob/p125819
// Difficulty: 309.0

public final class Fix45
{
    /* (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, 
    but rearranged so that every 4 is immediately followed by a 5. 
    Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, 
    and every 4 has a number after it that is not a 4. In this version, 
    5's may appear anywhere in the original array. */

    /*__________________________________________________________
    |                         Testcases                         |
    |___________________________________________________________|
    |         nums (int[])        |       returns (int[])       |
    |_____________________________|_____________________________|
    | {5, 4, 9, 4, 9, 5}          | {9, 4, 5, 4, 5, 9}          |
    | {1, 4, 1, 5}                | {1, 4, 5, 1}                |
    | {1, 4, 1, 5, 5, 4, 1}       | {1, 4, 5, 1, 1, 4, 5}       |
    | {4, 9, 4, 9, 5, 5, 4, 9, 5} | {4, 5, 4, 5, 9, 9, 4, 5, 9} |
    | {5, 5, 4, 1, 4, 1}          | {1, 1, 4, 5, 4, 5}          |
    | {4, 2, 2, 5}                | {4, 5, 2, 2}                |
    | {4, 2, 4, 2, 5, 5}          | {4, 5, 4, 5, 2, 2}          |
    | {4, 2, 4, 5, 5}             | {4, 5, 4, 5, 2}             |
    | {1, 1, 1}                   | {1, 1, 1}                   |
    | {4, 5}                      | {4, 5}                      |
    | {5, 4, 1}                   | {1, 4, 5}                   |
    | {}                          | {}                          |
    | {5, 4, 5, 4, 1}             | {1, 4, 5, 4, 5}             |
    | {4, 5, 4, 1, 5}             | {4, 5, 4, 5, 1}             |
    | {3, 4, 5}                   | {3, 4, 5}                   |
    | {4, 1, 5}                   | {4, 5, 1}                   |
    | {5, 4, 1}                   | {1, 4, 5}                   |
    | {2, 4, 2, 5}                | {2, 4, 5, 2}                |
    |_____________________________|____________________________*/

    public static final int[] fix45(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _Fix45.Validate(true);  // pass 'false' to print failed tests only.
    }
}
