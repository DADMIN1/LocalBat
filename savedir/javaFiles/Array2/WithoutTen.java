package Array2;
import Array2.Testcases._WithoutTen;

// https://codingbat.com/prob/p196976
// Difficulty: 284.0

public final class WithoutTen
{
    /* Return a version of the given array where all the 10's have been removed. 
    The remaining elements should shift left towards the start of the array as needed, 
    and the empty spaces a the end of the array should be 0. 
    So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array. */

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    | nums (int[])           | expected (int[])  |
    |________________________|___________________|
    | { 1, 10, 10, 2 }       | {1, 2, 0, 0}      |
    | { 10, 2, 10 }          | {2, 0, 0}         |
    | { 1, 99, 10 }          | {1, 99, 0}        |
    | { 10, 13, 10, 14 }     | {13, 14, 0, 0}    |
    | { 10, 13, 10, 14, 10 } | {13, 14, 0, 0, 0} |
    | { 10, 10, 3 }          | {3, 0, 0}         |
    | { 1 }                  | {1}               |
    | { 13, 1 }              | {13, 1}           |
    | { 10 }                 | {0}               |
    | {  }                   | {}                |
    |________________________|__________________*/

    public static final int[] withoutTen(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _WithoutTen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
