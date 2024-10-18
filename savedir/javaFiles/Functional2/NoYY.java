// https://codingbat.com/prob/p115967
package Functional2;
import Functional2.Testcases._NoYY;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class NoYY
{
    /* Given a list of strings, return a list where each string has "y" added at its end, 
    omitting any resulting strings that contain "yy" as a substring anywhere. */

    /*__________________________________________________
    |                    Testcases                     |
    |__________________________________________________|
    | noYY(["a", "b", "c"])    → ["ay", "by", "cy"]    |
    | noYY(["a", "b", "cy"])   → ["ay", "by"]          |
    | noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"] |
    |_________________________________________________*/

    public static List<String> noYY(List<String> strings)
    {
        
    }

    public static void main(String[] args) {
        _NoYY.Validate(true);  // pass 'false' to print failed tests only.
    }
}
