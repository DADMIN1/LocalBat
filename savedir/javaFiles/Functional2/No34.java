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

    /*_________________________________________________________
    |                        Testcases                         |
    |__________________________________________________________|
    |      strings (List<String>)     | returns (List<String>) |
    |_________________________________|________________________|
    | ["a", "bb", "ccc"]              | ["a", "bb"]            |
    | ["a", "bb", "ccc", "dddd"]      | ["a", "bb"]            |
    | ["ccc", "dddd", "apple"]        | ["apple"]              |
    | ["this", "not", "too", "long"]  | []                     |
    | ["a", "bbb", "cccc", "xx"]      | ["a", "xx"]            |
    | ["dddd", "ddd", "xxxxxxx"]      | ["xxxxxxx"]            |
    | []                              | []                     |
    | [""]                            | [""]                   |
    | ["empty", "", "empty"]          | ["empty", "", "empty"] |
    | ["a"]                           | ["a"]                  |
    | ["aaaa", "bbb", "*****", "333"] | ["*****"]              |
    |_________________________________|_______________________*/

    public static final List<String> no34(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        //_No34.printSuccesses = false;  // set 'false' to print failing tests only.
        //_No34.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _No34.Validate();
    }
}
