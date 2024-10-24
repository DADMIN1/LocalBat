package Array1;
import Array1.Testcases._MaxTriple;

// https://codingbat.com/prob/p185176
// Difficulty: 169.0

public class MaxTriple
{
    /* Given an array of ints of odd length, look at the first, 
    last, and middle values in the array and return the largest. 
    The array length will be a least 1. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | maxTriple([1, 2, 3])             → 3 |
    | maxTriple([1, 5, 3])             → 5 |
    | maxTriple([5, 2, 3])             → 5 |
    | maxTriple([1, 2, 3, 1, 1])       → 3 |
    | maxTriple([1, 7, 3, 1, 5])       → 5 |
    | maxTriple([5, 1, 3, 7, 1])       → 5 |
    | maxTriple([5, 1, 7, 3, 7, 8, 1]) → 5 |
    | maxTriple([5, 1, 7, 9, 7, 8, 1]) → 9 |
    | maxTriple([5, 1, 7, 3, 7, 8, 9]) → 9 |
    | maxTriple([2, 2, 5, 1, 1])       → 5 |
    |_____________________________________*/

    public static int maxTriple(int[] nums)
    {
        return 0;
    }

    public static void main(String[] args) {
        _MaxTriple.Validate(true);  // pass 'false' to print failed tests only.
    }
}
