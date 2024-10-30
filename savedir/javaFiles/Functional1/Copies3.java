package Functional1;
import Functional1.Testcases._Copies3;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p181634
// Difficulty: 209

public final class Copies3
{
    /* Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together. */

    /*________________________________________________________________
    |                            Testcases                            |
    |_________________________________________________________________|
    | strings (List<String>)                | expected (List<String>) |
    |_______________________________________|_________________________|
    | new ArrayList<>(Arrays.asList("a"     | "bb"                    |
    | new ArrayList<>(Arrays.asList("24"    | "a"                     |
    | new ArrayList<>(Arrays.asList("hello" | "there"))               |
    | new ArrayList<>(Arrays.asList("no"))  | Arrays.asList("nonono") |
    | new ArrayList<>(Arrays.asList())      | Arrays.asList()         |
    | new ArrayList<>(Arrays.asList("this"  | "and"                   |
    |_______________________________________|________________________*/

    public static final List<String> copies3(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _Copies3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
