// https://codingbat.com/prob/p169605
package Recursion2;
import Recursion2.Testcases._GroupNoAdj;

public class GroupNoAdj
{
    /* Given an array of ints, is it possible to choose a group of some of the ints, 
    such that the group sums to the given target with this additional constraint: 
    If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. 
    (No loops needed.) */

    /*__________________________________________
    |                Testcases                 |
    |__________________________________________|
    | groupNoAdj(0, [2, 5, 10, 4], 12) → true  |
    | groupNoAdj(0, [2, 5, 10, 4], 14) → false |
    | groupNoAdj(0, [2, 5, 10, 4], 7)  → false |
    |_________________________________________*/

    public static boolean groupNoAdj(int start, int[] nums, int target)
    {
        
    }

    public static void main(String[] args) {
        _GroupNoAdj.Validate(true);  // pass 'false' to print failed tests only.
    }
}
