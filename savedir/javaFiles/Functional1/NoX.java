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

    /*_______________________________________________________
    |                       Testcases                        |
    |________________________________________________________|
    |   strings (List<String>)   |   returns (List<String>)  |
    |____________________________|___________________________|
    | ["ax", "bb", "cx"]         | ["a", "bb", "c"]          |
    | ["xxax", "xbxbx", "xxcx"]  | ["a", "bb", "c"]          |
    | ["x"]                      | [""]                      |
    | [""]                       | [""]                      |
    | []                         | []                        |
    | ["the", "taxi"]            | ["the", "tai"]            |
    | ["the", "xxtxaxixxx"]      | ["the", "tai"]            |
    | ["this", "is", "the", "x"] | ["this", "is", "the", ""] |
    |____________________________|__________________________*/

    public static final List<String> noX(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        //_NoX.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NoX.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NoX.Validate();
    }
}
