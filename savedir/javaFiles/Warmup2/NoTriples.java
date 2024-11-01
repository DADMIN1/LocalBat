package Warmup2;
import Warmup2.Testcases._NoTriples;

// https://codingbat.com/prob/p170221
// Difficulty: 242.0

public final class NoTriples
{
    /* Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. 
    Return true if the array does not contain any triples. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | nums (int[])          | expected  |
    |                       | (boolean) |
    |_______________________|___________|
    | {1, 1, 2, 2, 1}       | true      |
    | {1, 1, 2, 2, 2, 1}    | false     |
    | {1, 1, 1, 2, 2, 2, 1} | false     |
    | {1, 1, 2, 2, 1, 2, 1} | true      |
    | {1, 2, 1}             | true      |
    | {1, 1, 1}             | false     |
    | {1, 1}                | true      |
    | {1}                   | true      |
    | {}                    | true      |
    |_______________________|__________*/

    public static final boolean noTriples(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _NoTriples.Validate(true);  // pass 'false' to print failed tests only.
    }
}
