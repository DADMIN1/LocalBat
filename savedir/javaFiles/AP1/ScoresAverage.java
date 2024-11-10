package AP1;
import AP1.Testcases._ScoresAverage;

// https://codingbat.com/prob/p123837
// Difficulty: 212.0

public final class ScoresAverage
{
    /* Given an array of scores, compute the int average of the first half and the second half, 
    and return whichever is larger. We'll say that the second half begins at index length/2. 
    The array length will be at least 2. To practice decomposition, 
    write a separate helper methodint average(int[] scores, 
    int start, int end) { which computes the average of the elements between indexes start..end. 
    Call your helper method twice to implement scoresAverage(). 
    Write your helper method after your scoresAverage() method in the JavaBat text area. 
    Normally you would compute averages with doubles, but here we use ints so the expected results are exact. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    |      scores (int[])      | returns |
    |                          |  (int)  |
    |__________________________|_________|
    | {2, 2, 4, 4}             |    4    |
    | {4, 4, 4, 2, 2, 2}       |    4    |
    | {3, 4, 5, 1, 2, 3}       |    4    |
    | {5, 6}                   |    6    |
    | {5, 4}                   |    5    |
    | {5, 4, 5, 6, 2, 1, 2, 3} |    5    |
    |__________________________|________*/

    public static final int scoresAverage(int[] scores)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_ScoresAverage.printSuccesses = false;  // set 'false' to print failing tests only.
        //_ScoresAverage.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _ScoresAverage.Validate();
    }
}
