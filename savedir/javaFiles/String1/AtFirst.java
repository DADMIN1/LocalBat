package String1;
import String1.Testcases._AtFirst;

// https://codingbat.com/prob/p139076
// Difficulty: 163.0

public final class AtFirst
{
    /* Given a string, return a string length 2 made of its first 2 chars. 
    If the string length is less than 2, use '@' for the missing chars. */

    /*____________________
    |      Testcases      |
    |_____________________|
    |   str    | returns  |
    | (String) | (String) |
    |__________|__________|
    | "hello"  |   "he"   |
    |   "hi"   |   "hi"   |
    |   "h"    |   "h@"   |
    |    ""    |   "@@"   |
    | "kitten" |   "ki"   |
    |  "java"  |   "ja"   |
    |   "j"    |   "j@"   |
    |__________|_________*/

    public static final String atFirst(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_AtFirst.printSuccesses = false;  // set 'false' to print failing tests only.
        //_AtFirst.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _AtFirst.Validate();
    }
}
