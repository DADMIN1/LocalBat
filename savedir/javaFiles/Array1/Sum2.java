package Array1;
import Array1.Testcases._Sum2;

// https://codingbat.com/prob/p190968
// Difficulty: 127.0

public class Sum2
{
    /* Given an array of ints, return the sum of the first 2 elements in the array. 
    If the array length is less than 2, just sum up the elements that exist, 
    returning 0 if the array is length 0. */

    /*_______________________
    |       Testcases        |
    |________________________|
    | sum2([1, 2, 3])    → 3 |
    | sum2([1, 1])       → 2 |
    | sum2([1, 1, 1, 1]) → 2 |
    | sum2([1, 2])       → 3 |
    | sum2([1])          → 1 |
    | sum2([])           → 0 |
    | sum2([4, 5, 6])    → 9 |
    | sum2([4])          → 4 |
    |_______________________*/

    public static int sum2(int[] nums)
    {
        return 0;
    }

    public static void main(String[] args) {
        _Sum2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
