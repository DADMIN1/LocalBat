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

    /*___________________________________________________________
    |                         Testcases                          |
    |____________________________________________________________|
    | strings (List<String>)                | expected           |
    |                                       | (List<String>)     |
    |_______________________________________|____________________|
    | new ArrayList<>(Arrays.asList("this"  | "not"              |
    | new ArrayList<>(Arrays.asList("a"     | "bbb"              |
    | new ArrayList<>(Arrays.asList("cccc"  | "cccc"             |
    | new ArrayList<>(Arrays.asList())      | Arrays.asList()    |
    | new ArrayList<>(Arrays.asList(""))    | Arrays.asList("")  |
    | new ArrayList<>(Arrays.asList("empty" | ""                 |
    | new ArrayList<>(Arrays.asList("a"))   | Arrays.asList("a") |
    | new ArrayList<>(Arrays.asList("aaaa"  | "bbb"              |
    |_______________________________________|___________________*/

    public static final List<String> noLong(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _NoLong.Validate(true);  // pass 'false' to print failed tests only.
    }
}
