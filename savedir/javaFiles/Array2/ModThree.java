package Array2;
import Array2.Testcases._ModThree;

// https://codingbat.com/prob/p159979
// Difficulty: 251.0

public final class ModThree
{
    /* Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | nums (int[])            | expected  |
    |                         | (boolean) |
    |_________________________|___________|
    | { 2, 1, 3, 5 }          | true      |
    | { 2, 1, 2, 5 }          | false     |
    | { 2, 4, 2, 5 }          | true      |
    | { 1, 2, 1, 2, 1 }       | false     |
    | { 9, 9, 9 }             | true      |
    | { 1, 2, 1 }             | false     |
    | { 1, 2 }                | false     |
    | { 1 }                   | false     |
    | {  }                    | false     |
    | { 9, 7, 2, 9 }          | false     |
    | { 9, 7, 2, 9, 2, 2 }    | false     |
    | { 9, 7, 2, 9, 2, 2, 6 } | true      |
    |_________________________|__________*/

    public static final boolean modThree(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _ModThree.Validate(true);  // pass 'false' to print failed tests only.
    }
}
