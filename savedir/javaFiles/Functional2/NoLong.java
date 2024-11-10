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

    /*_______________________________________________________
    |                       Testcases                        |
    |________________________________________________________|
    |     strings (List<String>)     |        returns        |
    |                                |     (List<String>)    |
    |________________________________|_______________________|
    | ["this", "not", "too", "long"] | ["not", "too"]        |
    | ["a", "bbb", "cccc"]           | ["a", "bbb"]          |
    | ["cccc", "cccc", "cccc"]       | []                    |
    | []                             | []                    |
    | [""]                           | [""]                  |
    | ["empty", "", "empty"]         | [""]                  |
    | ["a"]                          | ["a"]                 |
    | ["aaaa", "bbb", "***", "333"]  | ["bbb", "***", "333"] |
    |________________________________|______________________*/

    public static final List<String> noLong(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        //_NoLong.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NoLong.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NoLong.Validate();
    }
}
