package String1;
import String1.Testcases._HasBad;

// https://codingbat.com/prob/p139075
// Difficulty: 160.0

public final class HasBad
{
    /* Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
    including 0. Note: use .equals() to compare 2 strings. */

    /*______________________
    |       Testcases       |
    |_______________________|
    |    str    |  returns  |
    |  (String) | (boolean) |
    |___________|___________|
    |  "badxx"  |    true   |
    |  "xbadxx" |    true   |
    | "xxbadxx" |   false   |
    |   "code"  |   false   |
    |   "bad"   |    true   |
    |    "ba"   |   false   |
    |   "xba"   |   false   |
    |   "xbad"  |    true   |
    |     ""    |   false   |
    |  "badyy"  |    true   |
    |___________|__________*/

    public static final boolean hasBad(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_HasBad.printSuccesses = false;  // set 'false' to print failing tests only.
        //_HasBad.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _HasBad.Validate();
    }
}
