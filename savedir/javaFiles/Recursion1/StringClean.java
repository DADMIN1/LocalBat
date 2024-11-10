package Recursion1;
import Recursion1.Testcases._StringClean;

// https://codingbat.com/prob/p104029
// Difficulty: 372.0

public final class StringClean
{
    /* Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. 
    So "yyzzza" yields "yza". */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    |    str (String)    |    returns     |
    |                    |    (String)    |
    |____________________|________________|
    |      "yyzzza"      |     "yza"      |
    |     "abbbcdd"      |     "abcd"     |
    |      "Hello"       |     "Helo"     |
    |     "XXabcYY"      |    "XabcY"     |
    |     "112ab445"     |    "12ab45"    |
    | "Hello Bookkeeper" | "Helo Bokeper" |
    |____________________|_______________*/

    public static final String stringClean(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_StringClean.printSuccesses = false;  // set 'false' to print failing tests only.
        //_StringClean.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _StringClean.Validate();
    }
}
