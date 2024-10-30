package Functional2;
import Functional2.Testcases._NoYY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p115967
// Difficulty: 220

public final class NoYY
{
    /* Given a list of strings, return a list where each string has "y" added at its end, 
    omitting any resulting strings that contain "yy" as a substring anywhere. */

    /*_____________________________________________________________
    |                          Testcases                           |
    |______________________________________________________________|
    | strings (List<String>)                | expected             |
    |                                       | (List<String>)       |
    |_______________________________________|______________________|
    | new ArrayList<>(Arrays.asList("a"     | "b"                  |
    | new ArrayList<>(Arrays.asList("a"     | "b"                  |
    | new ArrayList<>(Arrays.asList("xx"    | "ya"                 |
    | new ArrayList<>(Arrays.asList("xx"    | "yay"                |
    | new ArrayList<>(Arrays.asList("yyx"   | "y"                  |
    | new ArrayList<>(Arrays.asList("hello" | "there"))            |
    | new ArrayList<>(Arrays.asList("ya"))  | Arrays.asList("yay") |
    | new ArrayList<>(Arrays.asList())      | Arrays.asList()      |
    | new ArrayList<>(Arrays.asList(""))    | Arrays.asList("y")   |
    | new ArrayList<>(Arrays.asList("xx"    | "yy"                 |
    |_______________________________________|_____________________*/

    public static final List<String> noYY(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _NoYY.Validate(true);  // pass 'false' to print failed tests only.
    }
}
