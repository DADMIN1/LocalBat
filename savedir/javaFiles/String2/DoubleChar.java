package String2;
import String2.Testcases._DoubleChar;

// https://codingbat.com/prob/p165312
// Difficulty: 203.0

public final class DoubleChar
{
    /* Given a string, return a string where for every char in the original, 
    there are two chars. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    |    str     |  returns (String)  |
    |  (String)  |                    |
    |____________|____________________|
    |   "The"    |      "TThhee"      |
    |   "AAbb"   |     "AAAAbbbb"     |
    | "Hi-There" | "HHii--TThheerree" |
    |  "Word!"   |    "WWoorrdd!!"    |
    |    "!!"    |       "!!!!"       |
    |     ""     |         ""         |
    |    "a"     |        "aa"        |
    |    "."     |        ".."        |
    |    "aa"    |       "aaaa"       |
    |____________|___________________*/

    public static final String doubleChar(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_DoubleChar.printSuccesses = false;  // set 'false' to print failing tests only.
        //_DoubleChar.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _DoubleChar.Validate();
    }
}
