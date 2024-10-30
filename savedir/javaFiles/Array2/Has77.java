package Array2;
import Array2.Testcases._Has77;

// https://codingbat.com/prob/p168357
// Difficulty: 245.0

public final class Has77
{
    /* Given an array of ints, return true if the array contains two 7's next to each other, 
    or there are two 7's separated by one element, such as with {7, 
    1, 7}. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | nums (int[])         | expected  |
    |                      | (boolean) |
    |______________________|___________|
    | { 1, 7, 7 }          | true      |
    | { 1, 7, 1, 7 }       | true      |
    | { 1, 7, 1, 1, 7 }    | false     |
    | { 7, 7, 1, 1, 7 }    | true      |
    | { 2, 7, 2, 2, 7, 2 } | false     |
    | { 2, 7, 2, 2, 7, 7 } | true      |
    | { 7, 2, 7, 2, 2, 7 } | true      |
    | { 7, 2, 6, 2, 2, 7 } | false     |
    | { 7, 7, 7 }          | true      |
    | { 7, 1, 7 }          | true      |
    | { 7, 1, 1 }          | false     |
    | { 1, 2 }             | false     |
    | { 1, 7 }             | false     |
    | { 7 }                | false     |
    |______________________|__________*/

    public static final boolean has77(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Has77.Validate(true);  // pass 'false' to print failed tests only.
    }
}
