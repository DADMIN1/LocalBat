package Functional1;
import Functional1.Testcases._NoX;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p105967
// Difficulty: 223

public class NoX
{
    /* Given a list of strings, return a list where each string has all its "x" removed. */

    /*____________________________________________________________
    |                          Testcases                          |
    |_____________________________________________________________|
    | noX(["ax", "bb", "cx"])         → ["a", "bb", "c"]          |
    | noX(["xxax", "xbxbx", "xxcx"])  → ["a", "bb", "c"]          |
    | noX(["x"])                      → [""]                      |
    | noX([""])                       → [""]                      |
    | noX([])                         → []                        |
    | noX(["the", "taxi"])            → ["the", "tai"]            |
    | noX(["the", "xxtxaxixxx"])      → ["the", "tai"]            |
    | noX(["this", "is", "the", "x"]) → ["this", "is", "the", ""] |
    |____________________________________________________________*/

    public static List<String> noX(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static void main(String[] args) {
        _NoX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
