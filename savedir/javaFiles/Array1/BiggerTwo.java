package Array1;
import Array1.Testcases._BiggerTwo;

// https://codingbat.com/prob/p109537
// Difficulty: 154.0

public final class BiggerTwo
{
    /* Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
    Return the array which has the largest sum. In event of a tie, 
    return a. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | a (int[]) | b (int[]) | returns |
    |           |           | (int[]) |
    |___________|___________|_________|
    | {1, 2}    | {3, 4}    | {3, 4}  |
    | {3, 4}    | {1, 2}    | {3, 4}  |
    | {1, 1}    | {1, 2}    | {1, 2}  |
    | {2, 1}    | {1, 1}    | {2, 1}  |
    | {2, 2}    | {1, 3}    | {2, 2}  |
    | {1, 3}    | {2, 2}    | {1, 3}  |
    | {6, 7}    | {3, 1}    | {6, 7}  |
    |___________|___________|________*/

    public static final int[] biggerTwo(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _BiggerTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
