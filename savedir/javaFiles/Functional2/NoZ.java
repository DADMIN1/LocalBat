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

    /*____________________________________________________
    |                      Testcases                      |
    |_____________________________________________________|
    |      strings (List<String>)      |     returns      |
    |                                  |  (List<String>)  |
    |__________________________________|__________________|
    | ["aaa", "bbb", "aza"]            | ["aaa", "bbb"]   |
    | ["hziz", "hzello", "hi"]         | ["hi"]           |
    | ["hello", "howz", "are", "youz"] | ["hello", "are"] |
    | []                               | []               |
    | [""]                             | [""]             |
    | ["x", "y", "z"]                  | ["x", "y"]       |
    |__________________________________|_________________*/

    public static final List<String> noZ(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        //_NoZ.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NoZ.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NoZ.Validate();
    }
}
