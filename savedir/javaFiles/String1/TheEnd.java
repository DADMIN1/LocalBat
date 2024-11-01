package String1;
import String1.Testcases._TheEnd;

// https://codingbat.com/prob/p162477
// Difficulty: 139.0

public final class TheEnd
{
    /* Given a string, return a string length 1 from its front, 
    unless front is false, in which case return a string length 1 from its back. 
    The string will be non-empty. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    |     str     |   front   | returns  |
    |   (String)  | (boolean) | (String) |
    |_____________|___________|__________|
    |   "Hello"   |    true   |   "H"    |
    |   "Hello"   |   false   |   "o"    |
    |     "oh"    |    true   |   "o"    |
    |     "oh"    |   false   |   "h"    |
    |     "x"     |    true   |   "x"    |
    |     "x"     |   false   |   "x"    |
    |    "java"   |    true   |   "j"    |
    | "chocolate" |   false   |   "e"    |
    |    "1234"   |    true   |   "1"    |
    |    "code"   |   false   |   "e"    |
    |_____________|___________|_________*/

    public static final String theEnd(String str, boolean front)
    {
        return "";
    }

    public static final void main(String[] args) {
        _TheEnd.Validate(true);  // pass 'false' to print failed tests only.
    }
}
