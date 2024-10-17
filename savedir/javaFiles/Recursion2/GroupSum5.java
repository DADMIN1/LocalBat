// https://codingbat.com/prob/p138907
package Recursion2;
import Recursion2.Testcases._GroupSum5;

public class GroupSum5
{
    /* Given an array of ints, is it possible to choose a group of some of the ints, 
    such that the group sums to the given target with these additional constraints: 
    all multiples of 5 in the array must be included in the group. 
    If the value immediately following a multiple of 5 is 1, 
    it must not be chosen. (No loops needed.) */

    /*_________________________________________
    |                Testcases                |
    ___________________________________________
    | groupSum5(0, [2, 5, 10, 4], 19) → true  |
    | groupSum5(0, [2, 5, 10, 4], 17) → true  |
    | groupSum5(0, [2, 5, 10, 4], 12) → false |
    _________________________________________*/

    public static boolean groupSum5(int start, int[] nums, int target)
    {
        
    }

    public static void main(String[] args) {
        _GroupSum5.Validate(true);  // pass 'false' to print failed tests only.
    }
}
