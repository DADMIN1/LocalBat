package Functional2;
import Functional2.Testcases._NoZ;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p105671
// Difficulty: 209

public final class NoZ
{
    /* Given a list of strings, return a list of the strings, omitting any string that contains a "z". 
    (Note: the str.contains(x) method returns a boolean) */

    /*_________________________________________________________
    |                        Testcases                         |
    |__________________________________________________________|
    | noZ(["aaa", "bbb", "aza"])            → ["aaa", "bbb"]   |
    | noZ(["hziz", "hzello", "hi"])         → ["hi"]           |
    | noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"] |
    | noZ([])                               → []               |
    | noZ([""])                             → [""]             |
    | noZ(["x", "y", "z"])                  → ["x", "y"]       |
    |_________________________________________________________*/

    public static final List<String> noZ(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _NoZ.Validate(true);  // pass 'false' to print failed tests only.
    }
}
