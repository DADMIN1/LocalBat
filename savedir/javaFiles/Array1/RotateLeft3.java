package Array1;
import Array1.Testcases._RotateLeft3;

// https://codingbat.com/prob/p185139
// Difficulty: 118.0

public final class RotateLeft3
{
    /* Given an array of ints length 3, return an array with the elements "rotated left" so {1, 
    2, 3} yields {2, 3, 1}. */

    /*________________________
    |        Testcases        |
    |_________________________|
    | nums       | expected   |
    | (int[])    | (int[])    |
    |____________|____________|
    | {1, 2, 3}  | {2, 3, 1}  |
    | {5, 11, 9} | {11, 9, 5} |
    | {7, 0, 0}  | {0, 0, 7}  |
    | {1, 2, 1}  | {2, 1, 1}  |
    | {0, 0, 1}  | {0, 1, 0}  |
    |____________|___________*/

    public static final int[] rotateLeft3(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _RotateLeft3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
