package AP1;
import AP1.Testcases._ScoresSpecial;

// https://codingbat.com/prob/p140485
// Difficulty: 245.0

public final class ScoresSpecial
{
    /* Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, 
    such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. 
    To practice decomposition, write a separate helper method which finds the largest special score in an array. 
    Write your helper method after your scoresSpecial() method in the JavaBat text area. */

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    |    a (int[])    |   b (int[])    | returns |
    |                 |                |  (int)  |
    |_________________|________________|_________|
    | {12, 10, 4}     | {2, 20, 30}    |    40   |
    | {20, 10, 4}     | {2, 20, 10}    |    40   |
    | {12, 11, 4}     | {2, 20, 31}    |    20   |
    | {1, 20, 2, 50}  | {3, 4, 5}      |    50   |
    | {3, 4, 5}       | {1, 50, 2, 20} |    50   |
    | {10, 4, 20, 30} | {20}           |    50   |
    | {10, 4, 20, 30} | {20}           |    50   |
    | {10, 4, 20, 30} | {3, 20, 99}    |    50   |
    | {10, 4, 20, 30} | {30, 20, 99}   |    60   |
    | {}              | {2}            |    0    |
    | {}              | {20}           |    20   |
    | {14, 10, 4}     | {4, 20, 30}    |    40   |
    |_________________|________________|________*/

    public static final int scoresSpecial(int[] a, int[] b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_ScoresSpecial.printSuccesses = false;  // set 'false' to print failing tests only.
        //_ScoresSpecial.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _ScoresSpecial.Validate();
    }
}
