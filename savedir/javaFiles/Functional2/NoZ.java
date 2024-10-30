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

    /*__________________________________________________________
    |                         Testcases                         |
    |___________________________________________________________|
    | strings (List<String>)                | expected          |
    |                                       | (List<String>)    |
    |_______________________________________|___________________|
    | new ArrayList<>(Arrays.asList("aaa"   | "bbb"             |
    | new ArrayList<>(Arrays.asList("hziz"  | "hzello"          |
    | new ArrayList<>(Arrays.asList("hello" | "howz"            |
    | new ArrayList<>(Arrays.asList())      | Arrays.asList()   |
    | new ArrayList<>(Arrays.asList(""))    | Arrays.asList("") |
    | new ArrayList<>(Arrays.asList("x"     | "y"               |
    |_______________________________________|__________________*/

    public static final List<String> noZ(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _NoZ.Validate(true);  // pass 'false' to print failed tests only.
    }
}
