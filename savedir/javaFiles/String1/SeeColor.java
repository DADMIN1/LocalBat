package String1;
import String1.Testcases._SeeColor;

// https://codingbat.com/prob/p199216
// Difficulty: 175.0

public final class SeeColor
{
    /* Given a string, if the string begins with "red" or "blue" return that color string, 
    otherwise return the empty string. */

    /*_______________________
    |       Testcases        |
    |________________________|
    |     str     | returns  |
    |   (String)  | (String) |
    |_____________|__________|
    |   "redxx"   |  "red"   |
    |   "xxred"   |    ""    |
    | "blueTimes" |  "blue"  |
    |  "NoColor"  |    ""    |
    |    "red"    |  "red"   |
    |     "re"    |    ""    |
    |    "blu"    |    ""    |
    |    "blue"   |  "blue"  |
    |     "a"     |    ""    |
    |      ""     |    ""    |
    |   "xyzred"  |    ""    |
    |_____________|_________*/

    public static final String seeColor(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_SeeColor.printSuccesses = false;  // set 'false' to print failing tests only.
        //_SeeColor.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _SeeColor.Validate();
    }
}
