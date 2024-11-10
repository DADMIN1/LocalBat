package Warmup1;
import Warmup1.Testcases._NotString;

// https://codingbat.com/prob/p191914
// Difficulty: 127.0

public final class NotString
{
    /* Given a string, return a new string where "not " has been added to the front. 
    However, if the string already begins with "not", return the string unchanged. 
    Note: use .equals() to compare 2 strings. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    |    str    |   returns    |
    |  (String) |   (String)   |
    |___________|______________|
    |  "candy"  | "not candy"  |
    |    "x"    |   "not x"    |
    | "not bad" |  "not bad"   |
    |   "bad"   |  "not bad"   |
    |   "not"   |    "not"     |
    |  "is not" | "not is not" |
    |    "no"   |   "not no"   |
    |___________|_____________*/

    public static final String notString(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_NotString.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NotString.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NotString.Validate();
    }
}
