// https://codingbat.com/prob/p194496
package Functional2;
import Functional2.Testcases._NoLong;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class NoLong
{
    /* Given a list of strings, return a list of the strings, omitting any string length 4 or more. */

    /*_________________________________________________________
    |                        Testcases                        |
    |_________________________________________________________|
    | noLong(["this", "not", "too", "long"]) → ["not", "too"] |
    | noLong(["a", "bbb", "cccc"])           → ["a", "bbb"]   |
    | noLong(["cccc", "cccc", "cccc"])       → []             |
    |________________________________________________________*/

    public static List<String> noLong(List<String> strings)
    {
        
    }

    public static void main(String[] args) {
        _NoLong.Validate(true);  // pass 'false' to print failed tests only.
    }
}
