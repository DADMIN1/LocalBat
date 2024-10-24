package Functional2;
import Functional2.Testcases._No9;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p124510
// Difficulty: 203

public class No9
{
    /* Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. 
    (Note: % by 10) */

    /*________________________________________________________
    |                        Testcases                        |
    |_________________________________________________________|
    | no9([1, 2, 19])                   → [1, 2]              |
    | no9([9, 19, 29, 3])               → [3]                 |
    | no9([1, 2, 3])                    → [1, 2, 3]           |
    | no9([45, 99, 90, 28, 13, 999, 0]) → [45, 90, 28, 13, 0] |
    | no9([])                           → []                  |
    | no9([9])                          → []                  |
    | no9([0, 9, 0])                    → [0, 0]              |
    |________________________________________________________*/

    public static List<Integer> no9(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        _No9.Validate(true);  // pass 'false' to print failed tests only.
    }
}
