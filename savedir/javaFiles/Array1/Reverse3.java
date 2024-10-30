package Array1;
import Array1.Testcases._Reverse3;

// https://codingbat.com/prob/p112409
// Difficulty: 121.0

public final class Reverse3
{
    /* Given an array of ints length 3, return a new array with the elements in reverse order, 
    so {1, 2, 3} becomes {3, 2, 1}. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | nums (int[]) | expected   |
    |              | (int[])    |
    |______________|____________|
    | { 1, 2, 3 }  | {3, 2, 1}  |
    | { 5, 11, 9 } | {9, 11, 5} |
    | { 7, 0, 0 }  | {0, 0, 7}  |
    | { 2, 1, 2 }  | {2, 1, 2}  |
    | { 1, 2, 1 }  | {1, 2, 1}  |
    | { 2, 11, 3 } | {3, 11, 2} |
    | { 0, 6, 5 }  | {5, 6, 0}  |
    | { 7, 2, 3 }  | {3, 2, 7}  |
    |______________|___________*/

    public static final int[] reverse3(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _Reverse3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
