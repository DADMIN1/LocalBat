// https://codingbat.com/prob/p137274
package Functional2;
import Functional2.Testcases._NoTeen;

import java.util.List;

public class NoTeen
{
    /* Given a list of integers, return a list of those numbers, 
    omitting any that are between 13 and 19 inclusive. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | noTeen([12, 13, 19, 20]) → [12, 20] |
    | noTeen([1, 14, 1])       → [1, 1]   |
    | noTeen([15])             → []       |
    |____________________________________*/

    public static List<Integer> noTeen(List<Integer> nums)
    {
        
    }

    public static void main(String[] args) {
        _NoTeen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
