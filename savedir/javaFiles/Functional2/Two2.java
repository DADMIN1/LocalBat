package Functional2;
import Functional2.Testcases._Two2;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p148198
// Difficulty: 223

public class Two2
{
    /* Given a list of non-negative integers, return a list of those numbers multiplied by 2, 
    omitting any of the resulting numbers that end in 2. */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    | two2([1, 2, 3])              → [4, 6]         |
    | two2([2, 6, 11])             → [4]            |
    | two2([0])                    → [0]            |
    | two2([])                     → []             |
    | two2([1, 11, 111, 16])       → []             |
    | two2([2, 3, 5, 7, 11])       → [4, 6, 10, 14] |
    | two2([3, 1, 4, 1, 6, 99, 0]) → [6, 8, 198, 0] |
    |______________________________________________*/

    public static List<Integer> two2(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        _Two2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
