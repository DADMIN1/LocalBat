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

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    |       strings       |        returns        |
    |    (List<String>)   |     (List<String>)    |
    |_____________________|_______________________|
    | ["a", "b", "c"]     | ["ay", "by", "cy"]    |
    | ["a", "b", "cy"]    | ["ay", "by"]          |
    | ["xx", "ya", "zz"]  | ["xxy", "yay", "zzy"] |
    | ["xx", "yay", "zz"] | ["xxy", "zzy"]        |
    | ["yyx", "y", "zzz"] | ["zzzy"]              |
    | ["hello", "there"]  | ["helloy", "therey"]  |
    | ["ya"]              | ["yay"]               |
    | []                  | []                    |
    | [""]                | ["y"]                 |
    | ["xx", "yy", "zz"]  | ["xxy", "zzy"]        |
    |_____________________|______________________*/

    public static final List<String> noYY(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        //_NoYY.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NoYY.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NoYY.Validate();
    }
}
