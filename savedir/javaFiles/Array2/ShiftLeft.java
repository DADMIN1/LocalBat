package Array2;
import Array2.Testcases._ShiftLeft;

// https://codingbat.com/prob/p105031
// Difficulty: 266.0

public final class ShiftLeft
{
    /* Return an array that is "left shifted" by one -- so {6, 
    2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, 
    or return a new array. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | nums (int[])      | expected        |
    |                   | (int[])         |
    |___________________|_________________|
    | { 6, 2, 5, 3 }    | {2, 5, 3, 6}    |
    | { 1, 2 }          | {2, 1}          |
    | { 1 }             | {1}             |
    | {  }              | {}              |
    | { 1, 1, 2, 2, 4 } | {1, 2, 2, 4, 1} |
    | { 1, 1, 1 }       | {1, 1, 1}       |
    | { 1, 2, 3 }       | {2, 3, 1}       |
    |___________________|________________*/

    public static final int[] shiftLeft(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _ShiftLeft.Validate(true);  // pass 'false' to print failed tests only.
    }
}
