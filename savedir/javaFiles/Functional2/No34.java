package Functional2;
import Functional2.Testcases._No34;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p184496
// Difficulty: 212

public final class No34
{
    /* Given a list of strings, return a list of the strings, omitting any string length 3 or 4. */

    /*___________________________________________________________
    |                         Testcases                          |
    |____________________________________________________________|
    | strings (List<String>)                | expected           |
    |                                       | (List<String>)     |
    |_______________________________________|____________________|
    | new ArrayList<>(Arrays.asList("a"     | "bb"               |
    | new ArrayList<>(Arrays.asList("a"     | "bb"               |
    | new ArrayList<>(Arrays.asList("ccc"   | "dddd"             |
    | new ArrayList<>(Arrays.asList("this"  | "not"              |
    | new ArrayList<>(Arrays.asList("a"     | "bbb"              |
    | new ArrayList<>(Arrays.asList("dddd"  | "ddd"              |
    | new ArrayList<>(Arrays.asList())      | Arrays.asList()    |
    | new ArrayList<>(Arrays.asList(""))    | Arrays.asList("")  |
    | new ArrayList<>(Arrays.asList("empty" | ""                 |
    | new ArrayList<>(Arrays.asList("a"))   | Arrays.asList("a") |
    | new ArrayList<>(Arrays.asList("aaaa"  | "bbb"              |
    |_______________________________________|___________________*/

    public static final List<String> no34(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _No34.Validate(true);  // pass 'false' to print failed tests only.
    }
}
