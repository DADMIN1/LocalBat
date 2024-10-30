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

    /*_______________________________________________________________
    |                           Testcases                            |
    |________________________________________________________________|
    | strings (List<String>)                | expected               |
    |                                       | (List<String>)         |
    |_______________________________________|________________________|
    | new ArrayList<>(Arrays.asList("a"     | "b"                    |
    | new ArrayList<>(Arrays.asList("hello" | "there"))              |
    | new ArrayList<>(Arrays.asList("yay")) | Arrays.asList("yyayy") |
    | new ArrayList<>(Arrays.asList(""      | "a"                    |
    | new ArrayList<>(Arrays.asList())      | Arrays.asList()        |
    | new ArrayList<>(Arrays.asList("xx"    | "yy"                   |
    |_______________________________________|_______________________*/

    public static final List<String> moreY(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _MoreY.Validate(true);  // pass 'false' to print failed tests only.
    }
}
