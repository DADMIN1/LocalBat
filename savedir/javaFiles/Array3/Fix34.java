package Array3;
import Array3.Testcases._Fix34;

// https://codingbat.com/prob/p159339
// Difficulty: 306.0

public final class Fix34
{
    /* Return an array that contains exactly the same numbers as the given array, 
    but rearranged so that every 3 is immediately followed by a 4. 
    Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, 
    every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4. */

    /*______________________________________________________________________________
    |                                   Testcases                                   |
    |_______________________________________________________________________________|
    | nums (int[])                           | expected (int[])                     |
    |________________________________________|______________________________________|
    | { 1, 3, 1, 4 }                         | {1, 3, 4, 1}                         |
    | { 1, 3, 1, 4, 4, 3, 1 }                | {1, 3, 4, 1, 1, 3, 4}                |
    | { 3, 2, 2, 4 }                         | {3, 4, 2, 2}                         |
    | { 3, 2, 3, 2, 4, 4 }                   | {3, 4, 3, 4, 2, 2}                   |
    | { 2, 3, 2, 3, 2, 4, 4 }                | {2, 3, 4, 3, 4, 2, 2}                |
    | { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 } | {5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4} |
    | { 3, 1, 4 }                            | {3, 4, 1}                            |
    | { 3, 4, 1 }                            | {3, 4, 1}                            |
    | { 1, 1, 1 }                            | {1, 1, 1}                            |
    | { 1 }                                  | {1}                                  |
    | {  }                                   | {}                                   |
    | { 7, 3, 7, 7, 4 }                      | {7, 3, 4, 7, 7}                      |
    | { 3, 1, 4, 3, 1, 4 }                   | {3, 4, 1, 3, 4, 1}                   |
    | { 3, 1, 1, 3, 4, 4 }                   | {3, 4, 1, 3, 4, 1}                   |
    |________________________________________|_____________________________________*/

    public static final int[] fix34(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _Fix34.Validate(true);  // pass 'false' to print failed tests only.
    }
}
