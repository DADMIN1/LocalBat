package Array2;
import Array2.Testcases._NotAlone;

// https://codingbat.com/prob/p169506
// Difficulty: 278.0

public final class NotAlone
{
    /* We'll say that an element in an array is "alone" if there are values before and after it, 
    and those values are different from it. 
    Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger. */

    /*________________________________________________
    |                    Testcases                    |
    |_________________________________________________|
    |    nums (int[])    |  val  |  returns (int[])   |
    |                    | (int) |                    |
    |____________________|_______|____________________|
    | {1, 2, 3}          |   2   | {1, 3, 3}          |
    | {1, 2, 3, 2, 5, 2} |   2   | {1, 3, 3, 5, 5, 2} |
    | {3, 4}             |   3   | {3, 4}             |
    | {3, 3}             |   3   | {3, 3}             |
    | {1, 3, 1, 2}       |   1   | {1, 3, 3, 2}       |
    | {3}                |   3   | {3}                |
    | {}                 |   3   | {}                 |
    | {7, 1, 6}          |   1   | {7, 7, 6}          |
    | {1, 1, 1}          |   1   | {1, 1, 1}          |
    | {1, 1, 1, 2}       |   1   | {1, 1, 1, 2}       |
    |____________________|_______|___________________*/

    public static final int[] notAlone(int[] nums, int val)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_NotAlone.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NotAlone.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NotAlone.Validate();
    }
}
