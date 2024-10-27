package Functional2;
import Functional2.Testcases._NoYY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p115967
// Difficulty: 220

public final class NoYY
{
    /* Given a list of strings, return a list where each string has "y" added at its end, 
    omitting any resulting strings that contain "yy" as a substring anywhere. */

    /*__________________________________________________
    |                     Testcases                     |
    |___________________________________________________|
    | noYY(["a", "b", "c"])     → ["ay", "by", "cy"]    |
    | noYY(["a", "b", "cy"])    → ["ay", "by"]          |
    | noYY(["xx", "ya", "zz"])  → ["xxy", "yay", "zzy"] |
    | noYY(["xx", "yay", "zz"]) → ["xxy", "zzy"]        |
    | noYY(["yyx", "y", "zzz"]) → ["zzzy"]              |
    | noYY(["hello", "there"])  → ["helloy", "therey"]  |
    | noYY(["ya"])              → ["yay"]               |
    | noYY([])                  → []                    |
    | noYY([""])                → ["y"]                 |
    | noYY(["xx", "yy", "zz"])  → ["xxy", "zzy"]        |
    |__________________________________________________*/

    public static final List<String> noYY(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _NoYY.Validate(true);  // pass 'false' to print failed tests only.
    }
}
