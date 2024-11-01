package Functional1;
import Functional1.Testcases._MoreY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p177528
// Difficulty: 210

public final class MoreY
{
    /* Given a list of strings, return a list where each string has "y" added at its start and end. */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    | strings            | expected (List<String>)  |
    | (List<String>)     |                          |
    |____________________|__________________________|
    | ["a", "b", "c"]    | ["yay", "yby", "ycy"]    |
    | ["hello", "there"] | ["yhelloy", "ytherey"]   |
    | ["yay"]            | ["yyayy"]                |
    | ["", "a", "xx"]    | ["yy", "yay", "yxxy"]    |
    | []                 | []                       |
    | ["xx", "yy", "zz"] | ["yxxy", "yyyy", "yzzy"] |
    |____________________|_________________________*/

    public static final List<String> moreY(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _MoreY.Validate(true);  // pass 'false' to print failed tests only.
    }
}
