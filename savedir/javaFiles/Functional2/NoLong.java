package Functional2;
import Functional2.Testcases._NoLong;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p194496
// Difficulty: 209

public final class NoLong
{
    /* Given a list of strings, return a list of the strings, omitting any string length 4 or more. */

    /*_______________________________________________________________
    |                           Testcases                            |
    |________________________________________________________________|
    | noLong(["this", "not", "too", "long"]) → ["not", "too"]        |
    | noLong(["a", "bbb", "cccc"])           → ["a", "bbb"]          |
    | noLong(["cccc", "cccc", "cccc"])       → []                    |
    | noLong([])                             → []                    |
    | noLong([""])                           → [""]                  |
    | noLong(["empty", "", "empty"])         → [""]                  |
    | noLong(["a"])                          → ["a"]                 |
    | noLong(["aaaa", "bbb", "***", "333"])  → ["bbb", "***", "333"] |
    |_______________________________________________________________*/

    public static final List<String> noLong(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _NoLong.Validate(true);  // pass 'false' to print failed tests only.
    }
}
