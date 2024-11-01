package Warmup2;
import Warmup2.Testcases._Array123;

// https://codingbat.com/prob/p136041
// Difficulty: 224.0

public final class Array123
{
    /* Given an array of ints, return true if the sequence of numbers 1, 
    2, 3 appears in the array somewhere. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | nums (int[])       | expected  |
    |                    | (boolean) |
    |____________________|___________|
    | {1, 1, 2, 3, 1}    | true      |
    | {1, 1, 2, 4, 1}    | false     |
    | {1, 1, 2, 1, 2, 3} | true      |
    | {1, 1, 2, 1, 2, 1} | false     |
    | {1, 2, 3, 1, 2, 3} | true      |
    | {1, 2, 3}          | true      |
    | {1, 1, 1}          | false     |
    | {1, 2}             | false     |
    | {1}                | false     |
    | {}                 | false     |
    |____________________|__________*/

    public static final boolean array123(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Array123.Validate(true);  // pass 'false' to print failed tests only.
    }
}
