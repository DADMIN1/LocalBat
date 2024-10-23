// https://codingbat.com/prob/p105671
package Functional2;
import Functional2.Testcases._NoZ;

import java.util.List;

public class NoZ
{
    /* Given a list of strings, return a list of the strings, omitting any string that contains a "z". 
    (Note: the str.contains(x) method returns a boolean) */

    /*_________________________________________________________
    |                        Testcases                         |
    |__________________________________________________________|
    | noZ(["aaa", "bbb", "aza"])            → ["aaa", "bbb"]   |
    | noZ(["hziz", "hzello", "hi"])         → ["hi"]           |
    | noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"] |
    |_________________________________________________________*/

    public static List<String> noZ(List<String> strings)
    {
        
    }

    public static void main(String[] args) {
        _NoZ.Validate(true);  // pass 'false' to print failed tests only.
    }
}
