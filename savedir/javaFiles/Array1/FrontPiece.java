package Array1;
import Array1.Testcases._FrontPiece;

// https://codingbat.com/prob/p142455
// Difficulty: 172.0

public final class FrontPiece
{
    /* Given an int array of any length, return a new array of its first 2 elements. 
    If the array is smaller than length 2, use whatever elements are present. */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | nums (int[])      | expected |
    |                   | (int[])  |
    |___________________|__________|
    | { 1, 2, 3 }       | {1, 2}   |
    | { 1, 2 }          | {1, 2}   |
    | { 1 }             | {1}      |
    | {  }              | {}       |
    | { 6, 5, 0 }       | {6, 5}   |
    | { 6, 5 }          | {6, 5}   |
    | { 3, 1, 4, 1, 5 } | {3, 1}   |
    | { 6 }             | {6}      |
    |___________________|_________*/

    public static final int[] frontPiece(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _FrontPiece.Validate(true);  // pass 'false' to print failed tests only.
    }
}
