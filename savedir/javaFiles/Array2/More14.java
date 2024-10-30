package Array2;
import Array2.Testcases._More14;

// https://codingbat.com/prob/p104627
// Difficulty: 227.0

public final class More14
{
    /* Given an array of ints, return true if the number of 1's is greater than the number of 4's */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | nums (int[])         | expected  |
    |                      | (boolean) |
    |______________________|___________|
    | { 1, 4, 1 }          | true      |
    | { 1, 4, 1, 4 }       | false     |
    | { 1, 1 }             | true      |
    | { 1, 6, 6 }          | true      |
    | { 1 }                | true      |
    | { 1, 4 }             | false     |
    | { 6, 1, 1 }          | true      |
    | { 1, 6, 4 }          | false     |
    | { 1, 1, 4, 4, 1 }    | true      |
    | { 1, 1, 6, 4, 4, 1 } | true      |
    | {  }                 | false     |
    | { 4, 1, 4, 6 }       | false     |
    | { 4, 1, 4, 6, 1 }    | false     |
    | { 1, 4, 1, 4, 1, 6 } | true      |
    |______________________|__________*/

    public static final boolean more14(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _More14.Validate(true);  // pass 'false' to print failed tests only.
    }
}
