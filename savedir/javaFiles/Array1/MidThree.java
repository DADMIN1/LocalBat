package Array1;
import Array1.Testcases._MidThree;

// https://codingbat.com/prob/p155713
// Difficulty: 166.0

public final class MidThree
{
    /* Given an array of ints of odd length, 
    return a new array length 3 containing the elements from the middle of the array. 
    The array length will be at least 3. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | nums (int[])            | expected  |
    |                         | (int[])   |
    |_________________________|___________|
    | { 1, 2, 3, 4, 5 }       | {2, 3, 4} |
    | { 8, 6, 7, 5, 3, 0, 9 } | {7, 5, 3} |
    | { 1, 2, 3 }             | {1, 2, 3} |
    |_________________________|__________*/

    public static final int[] midThree(int[] nums)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _MidThree.Validate(true);  // pass 'false' to print failed tests only.
    }
}
