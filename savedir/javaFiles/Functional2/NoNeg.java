// https://codingbat.com/prob/p103456
package Functional2;
import Functional2.Testcases._NoNeg;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class NoNeg
{
    /* Given a list of integers, return a list of the integers, 
    omitting any that are less than 0. */

    /*________________________________
    |           Testcases            |
    |________________________________|
    | noNeg([1, -2])        → [1]    |
    | noNeg([-3, -3, 3, 3]) → [3, 3] |
    | noNeg([-1, -1, -1])   → []     |
    |_______________________________*/

    public static List<Integer> noNeg(List<Integer> nums)
    {
        
    }

    public static void main(String[] args) {
        _NoNeg.Validate(true);  // pass 'false' to print failed tests only.
    }
}
