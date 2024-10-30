package Functional1;
import Functional1.Testcases._AddStar;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p170181
// Difficulty: 206

public final class AddStar
{
    /* Given a list of strings, return a list where each string has "*" added at its end. */

    /*______________________________________________________________
    |                           Testcases                           |
    |_______________________________________________________________|
    | strings (List<String>)                  | expected            |
    |                                         | (List<String>)      |
    |_________________________________________|_____________________|
    | new ArrayList<>(Arrays.asList("a"       | "bb"                |
    | new ArrayList<>(Arrays.asList("hello"   | "there"))           |
    | new ArrayList<>(Arrays.asList("*"))     | Arrays.asList("**") |
    | new ArrayList<>(Arrays.asList())        | Arrays.asList()     |
    | new ArrayList<>(Arrays.asList("kittens" | "and"               |
    | new ArrayList<>(Arrays.asList("empty"   | "string"            |
    |_________________________________________|____________________*/

    public static final List<String> addStar(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _AddStar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
