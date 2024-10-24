package Functional1;
import Functional1.Testcases._MoreY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p177528
// Difficulty: 210

public class MoreY
{
    /* Given a list of strings, return a list where each string has "y" added at its start and end. */

    /*_____________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    | moreY(["a", "b", "c"])    → ["yay", "yby", "ycy"]    |
    | moreY(["hello", "there"]) → ["yhelloy", "ytherey"]   |
    | moreY(["yay"])            → ["yyayy"]                |
    | moreY(["", "a", "xx"])    → ["yy", "yay", "yxxy"]    |
    | moreY([])                 → []                       |
    | moreY(["xx", "yy", "zz"]) → ["yxxy", "yyyy", "yzzy"] |
    |_____________________________________________________*/

    public static List<String> moreY(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static void main(String[] args) {
        _MoreY.Validate(true);  // pass 'false' to print failed tests only.
    }
}
