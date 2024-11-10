package String1;
import String1.Testcases._TwoChar;

// https://codingbat.com/prob/p144623
// Difficulty: 154.0

public final class TwoChar
{
    /* Given a string and an index, return a string length 2 starting at the given index. 
    If the index is too big or too small to define a string length 2, 
    use the first 2 chars. The string length will be at least 2. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    |   str    | index | returns  |
    | (String) | (int) | (String) |
    |__________|_______|__________|
    |  "java"  |   0   |   "ja"   |
    |  "java"  |   2   |   "va"   |
    |  "java"  |   3   |   "ja"   |
    |  "java"  |   4   |   "ja"   |
    |  "java"  |   -1  |   "ja"   |
    | "Hello"  |   0   |   "He"   |
    | "Hello"  |   1   |   "el"   |
    | "Hello"  |   99  |   "He"   |
    | "Hello"  |   3   |   "lo"   |
    | "Hello"  |   4   |   "He"   |
    | "Hello"  |   5   |   "He"   |
    | "Hello"  |   -7  |   "He"   |
    | "Hello"  |   6   |   "He"   |
    | "Hello"  |   -1  |   "He"   |
    |  "yay"   |   0   |   "ya"   |
    |__________|_______|_________*/

    public static final String twoChar(String str, int index)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_TwoChar.printSuccesses = false;  // set 'false' to print failing tests only.
        //_TwoChar.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _TwoChar.Validate();
    }
}
