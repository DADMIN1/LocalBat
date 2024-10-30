package Functional1;
import Functional1.Testcases._NoX;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p105967
// Difficulty: 223

public final class NoX
{
    /* Given a list of strings, return a list where each string has all its "x" removed. */

    /*_________________________________________________________
    |                        Testcases                         |
    |__________________________________________________________|
    | strings (List<String>)               | expected          |
    |                                      | (List<String>)    |
    |______________________________________|___________________|
    | new ArrayList<>(Arrays.asList("ax"   | "bb"              |
    | new ArrayList<>(Arrays.asList("xxax" | "xbxbx"           |
    | new ArrayList<>(Arrays.asList("x"))  | Arrays.asList("") |
    | new ArrayList<>(Arrays.asList(""))   | Arrays.asList("") |
    | new ArrayList<>(Arrays.asList())     | Arrays.asList()   |
    | new ArrayList<>(Arrays.asList("the"  | "taxi"))          |
    | new ArrayList<>(Arrays.asList("the"  | "xxtxaxixxx"))    |
    | new ArrayList<>(Arrays.asList("this" | "is"              |
    |______________________________________|__________________*/

    public static final List<String> noX(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _NoX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
