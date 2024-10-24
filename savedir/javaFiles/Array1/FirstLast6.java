package Array1;
import Array1.Testcases._FirstLast6;

// https://codingbat.com/prob/p185685
// Difficulty: 103.0

public class FirstLast6
{
    /* Given an array of ints, return true if 6 appears as either the first or last element in the array. 
    The array will be length 1 or more. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | firstLast6([1, 2, 6])        → true  |
    | firstLast6([6, 1, 2, 3])     → true  |
    | firstLast6([13, 6, 1, 2, 3]) → false |
    | firstLast6([13, 6, 1, 2, 6]) → true  |
    | firstLast6([3, 2, 1])        → false |
    | firstLast6([3, 6, 1])        → false |
    | firstLast6([3, 6])           → true  |
    | firstLast6([6])              → true  |
    | firstLast6([3])              → false |
    | firstLast6([5, 6])           → true  |
    | firstLast6([5, 5])           → false |
    | firstLast6([1, 2, 3, 4, 6])  → true  |
    | firstLast6([1, 2, 3, 4])     → false |
    |_____________________________________*/

    public static boolean firstLast6(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _FirstLast6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
