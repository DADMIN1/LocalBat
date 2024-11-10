package String2;
import String2.Testcases._PrefixAgain;

// https://codingbat.com/prob/p136417
// Difficulty: 239.0

public final class PrefixAgain
{
    /* Given a string, consider the prefix string made of the first N chars of the string. 
    Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length(). */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    |     str (String)    | n (int) |  returns  |
    |                     |         | (boolean) |
    |_____________________|_________|___________|
    |      "abXYabc"      |    1    |    true   |
    |      "abXYabc"      |    2    |    true   |
    |      "abXYabc"      |    3    |   false   |
    |     "xyzxyxyxy"     |    2    |    true   |
    |     "xyzxyxyxy"     |    3    |   false   |
    | "Hi12345Hi6789Hi10" |    1    |    true   |
    | "Hi12345Hi6789Hi10" |    2    |    true   |
    | "Hi12345Hi6789Hi10" |    3    |    true   |
    | "Hi12345Hi6789Hi10" |    4    |   false   |
    |         "a"         |    1    |   false   |
    |         "aa"        |    1    |    true   |
    |         "ab"        |    1    |   false   |
    |_____________________|_________|__________*/

    public static final boolean prefixAgain(String str, int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_PrefixAgain.printSuccesses = false;  // set 'false' to print failing tests only.
        //_PrefixAgain.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _PrefixAgain.Validate();
    }
}
