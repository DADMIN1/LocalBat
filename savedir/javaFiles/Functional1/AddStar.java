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

    /*____________________________________________________________________________________
    |                                      Testcases                                      |
    |_____________________________________________________________________________________|
    |         strings (List<String>)         |           returns (List<String>)           |
    |________________________________________|____________________________________________|
    | ["a", "bb", "ccc"]                     | ["a*", "bb*", "ccc*"]                      |
    | ["hello", "there"]                     | ["hello*", "there*"]                       |
    | ["*"]                                  | ["**"]                                     |
    | []                                     | []                                         |
    | ["kittens", "and", "chocolate", "and"] | ["kittens*", "and*", "chocolate*", "and*"] |
    | ["empty", "string", ""]                | ["empty*", "string*", "*"]                 |
    |________________________________________|___________________________________________*/

    public static final List<String> addStar(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        //_AddStar.printSuccesses = false;  // set 'false' to print failing tests only.
        //_AddStar.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _AddStar.Validate();
    }
}
