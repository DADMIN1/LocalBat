package Array2;
import Array2.Testcases._Has77;

// https://codingbat.com/prob/p168357
// Difficulty: 245.0

public class Has77
{
    /* Given an array of ints, return true if the array contains two 7's next to each other, 
    or there are two 7's separated by one element, such as with {7, 
    1, 7}. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | has77([1, 7, 7])          → true  |
    | has77([1, 7, 1, 7])       → true  |
    | has77([1, 7, 1, 1, 7])    → false |
    | has77([7, 7, 1, 1, 7])    → true  |
    | has77([2, 7, 2, 2, 7, 2]) → false |
    | has77([2, 7, 2, 2, 7, 7]) → true  |
    | has77([7, 2, 7, 2, 2, 7]) → true  |
    | has77([7, 2, 6, 2, 2, 7]) → false |
    | has77([7, 7, 7])          → true  |
    | has77([7, 1, 7])          → true  |
    | has77([7, 1, 1])          → false |
    | has77([1, 2])             → false |
    | has77([1, 7])             → false |
    | has77([7])                → false |
    |__________________________________*/

    public static boolean has77(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _Has77.Validate(true);  // pass 'false' to print failed tests only.
    }
}
