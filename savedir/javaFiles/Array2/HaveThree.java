package Array2;
import Array2.Testcases._HaveThree;

// https://codingbat.com/prob/p109783
// Difficulty: 254.0

public class HaveThree
{
    /* Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
    and no 3's are next to each other. */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | haveThree([3, 1, 3, 1, 3])          → true  |
    | haveThree([3, 1, 3, 3])             → false |
    | haveThree([3, 4, 3, 3, 4])          → false |
    | haveThree([1, 3, 1, 3, 1, 2])       → false |
    | haveThree([1, 3, 1, 3, 1, 3])       → true  |
    | haveThree([1, 3, 3, 1, 3])          → false |
    | haveThree([1, 3, 1, 3, 1, 3, 4, 3]) → false |
    | haveThree([3, 4, 3, 4, 3, 4, 4])    → true  |
    | haveThree([3, 3, 3])                → false |
    | haveThree([1, 3])                   → false |
    | haveThree([3])                      → false |
    | haveThree([1])                      → false |
    |____________________________________________*/

    public static boolean haveThree(int[] nums)
    {
        return false;
    }

    public static void main(String[] args) {
        _HaveThree.Validate(true);  // pass 'false' to print failed tests only.
    }
}
