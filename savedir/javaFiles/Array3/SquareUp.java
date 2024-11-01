package Array3;
import Array3.Testcases._SquareUp;

// https://codingbat.com/prob/p155405
// Difficulty: 318.0

public final class SquareUp
{
    /* Given n>=0, create an array length n*n with the following pattern, 
    shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups). */

    /*_______________________________________________________________________________________________________________________
    |                                                       Testcases                                                        |
    |________________________________________________________________________________________________________________________|
    | n (int) |                                               returns (int[])                                                |
    |_________|______________________________________________________________________________________________________________|
    |    3    | {0, 0, 1, 0, 2, 1, 3, 2, 1}                                                                                  |
    |    2    | {0, 1, 2, 1}                                                                                                 |
    |    4    | {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}                                                             |
    |    1    | {1}                                                                                                          |
    |    0    | {}                                                                                                           |
    |    6    | {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1} |
    |_________|_____________________________________________________________________________________________________________*/

    public static final int[] squareUp(int n)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _SquareUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
