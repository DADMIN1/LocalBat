package Array2;
import Array2.Testcases._EvenOdd;

// https://codingbat.com/prob/p105771
// Difficulty: 290.0

public final class EvenOdd
{
    /* Return an array that contains the exact same numbers as the given array, 
    but rearranged so that all the even numbers come before all the odd numbers. 
    Other than that, the numbers can be in any order. You may modify and return the given array, 
    or make a new array. */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    |      nums (int[])     |    returns (int[])    |
    |_______________________|_______________________|
    | {1, 0, 1, 0, 0, 1, 1} | {0, 0, 0, 1, 1, 1, 1} |
    | {3, 3, 2}             | {2, 3, 3}             |
    | {2, 2, 2}             | {2, 2, 2}             |
    | {3, 2, 2}             | {2, 2, 3}             |
    | {1, 1, 0, 1, 0}       | {0, 0, 1, 1, 1}       |
    | {1}                   | {1}                   |
    | {1, 2}                | {2, 1}                |
    | {2, 1}                | {2, 1}                |
    | {}                    | {}                    |
    |_______________________|______________________*/

    public static final int[] evenOdd(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _EvenOdd.Validate(true);  // pass 'false' to print failed tests only.
    }
}
