package Array2;
import Array2.Testcases._Lucky13;

// https://codingbat.com/prob/p194525
// Difficulty: 221.0

public final class Lucky13
{
    /* Given an array of ints, return true if the array contains no 1's and no 3's. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | nums (int[]) |  returns  |
    |              | (boolean) |
    |______________|___________|
    | {0, 2, 4}    |    true   |
    | {1, 2, 3}    |   false   |
    | {1, 2, 4}    |   false   |
    | {2, 7, 2, 8} |    true   |
    | {2, 7, 1, 8} |   false   |
    | {3, 7, 2, 8} |   false   |
    | {2, 7, 2, 1} |   false   |
    | {1, 2}       |   false   |
    | {2, 2}       |    true   |
    | {2}          |    true   |
    | {3}          |   false   |
    | {}           |    true   |
    |______________|__________*/

    public static final boolean lucky13(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Lucky13.Validate(true);  // pass 'false' to print failed tests only.
    }
}
