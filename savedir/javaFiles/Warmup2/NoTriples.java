package Warmup2;
import Warmup2.Testcases._NoTriples;

// https://codingbat.com/prob/p170221
// Difficulty: 242.0

public class NoTriples
{
    /* Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. 
    Return true if the array does not contain any triples. */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | noTriples([1, 1, 2, 2, 1])       → true  |
    | noTriples([1, 1, 2, 2, 2, 1])    → false |
    | noTriples([1, 1, 1, 2, 2, 2, 1]) → false |
    | noTriples([1, 1, 2, 2, 1, 2, 1]) → true  |
    | noTriples([1, 2, 1])             → true  |
    | noTriples([1, 1, 1])             → false |
    | noTriples([1, 1])                → true  |
    | noTriples([1])                   → true  |
    | noTriples([])                    → true  |
    |_________________________________________*/

    public static boolean noTriples(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _NoTriples.Validate(true);  // pass 'false' to print failed tests only.
    }
}
