package AP1;
import AP1.Testcases._Scores100;

// https://codingbat.com/prob/p179487
// Difficulty: 206.0

public final class Scores100
{
    /* Given an array of scores, return true if there are scores of 100 next to each other in the array. 
    The array length will be at least 2. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    |   scores (int[])   |  returns  |
    |                    | (boolean) |
    |____________________|___________|
    | {1, 100, 100}      |    true   |
    | {1, 100, 99, 100}  |   false   |
    | {100, 1, 100, 100} |    true   |
    | {100, 1, 100, 1}   |   false   |
    | {1, 2, 3, 4, 5}    |   false   |
    | {1, 2, 100, 4, 5}  |   false   |
    |____________________|__________*/

    public static final boolean scores100(int[] scores)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_Scores100.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Scores100.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Scores100.Validate();
    }
}
