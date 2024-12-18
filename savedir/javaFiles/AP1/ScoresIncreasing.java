package AP1;
import AP1.Testcases._ScoresIncreasing;

// https://codingbat.com/prob/p146974
// Difficulty: 203.0

public final class ScoresIncreasing
{
    /* Given an array of scores, return true if each score is equal or greater than the one before. 
    The array will be length 2 or more. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    |   scores (int[])   |  returns  |
    |                    | (boolean) |
    |____________________|___________|
    | {1, 3, 4}          |    true   |
    | {1, 3, 2}          |   false   |
    | {1, 1, 4}          |    true   |
    | {1, 1, 2, 4, 4, 7} |    true   |
    | {1, 1, 2, 4, 3, 7} |   false   |
    | {-5, 4, 11}        |    true   |
    |____________________|__________*/

    public static final boolean scoresIncreasing(int[] scores)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_ScoresIncreasing.printSuccesses = false;  // set 'false' to print failing tests only.
        //_ScoresIncreasing.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _ScoresIncreasing.Validate();
    }
}
