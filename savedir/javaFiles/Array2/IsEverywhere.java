package Array2;
import Array2.Testcases._IsEverywhere;

// https://codingbat.com/prob/p110222
// Difficulty: 236.0

public final class IsEverywhere
{
    /* We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
    at least one of the pair is that value. Return true if the given value is everywhere in the array. */

    /*_____________________________________________
    |                  Testcases                   |
    |______________________________________________|
    |       nums (int[])       |  val  |  returns  |
    |                          | (int) | (boolean) |
    |__________________________|_______|___________|
    | {1, 2, 1, 3}             |   1   |    true   |
    | {1, 2, 1, 3}             |   2   |   false   |
    | {1, 2, 1, 3, 4}          |   1   |   false   |
    | {2, 1, 2, 1}             |   1   |    true   |
    | {2, 1, 2, 1}             |   2   |    true   |
    | {2, 1, 2, 3, 1}          |   2   |   false   |
    | {3, 1}                   |   3   |    true   |
    | {3, 1}                   |   2   |   false   |
    | {3}                      |   1   |    true   |
    | {}                       |   1   |    true   |
    | {1, 2, 1, 2, 3, 2, 5}    |   2   |    true   |
    | {1, 2, 1, 1, 1, 2}       |   2   |   false   |
    | {2, 1, 2, 1, 1, 2}       |   2   |   false   |
    | {2, 1, 2, 2, 2, 1, 1, 2} |   2   |   false   |
    | {2, 1, 2, 2, 2, 1, 2, 1} |   2   |    true   |
    | {2, 1, 2, 1, 2}          |   2   |    true   |
    |__________________________|_______|__________*/

    public static final boolean isEverywhere(int[] nums, int val)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_IsEverywhere.printSuccesses = false;  // set 'false' to print failing tests only.
        //_IsEverywhere.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _IsEverywhere.Validate();
    }
}
