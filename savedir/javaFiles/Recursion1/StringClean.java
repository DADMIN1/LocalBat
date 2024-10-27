package Recursion1;
import Recursion1.Testcases._StringClean;

// https://codingbat.com/prob/p104029
// Difficulty: 372.0

public final class StringClean
{
    /* Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. 
    So "yyzzza" yields "yza". */

    /*_________________________________________________
    |                    Testcases                     |
    |__________________________________________________|
    | stringClean("yyzzza")           → "yza"          |
    | stringClean("abbbcdd")          → "abcd"         |
    | stringClean("Hello")            → "Helo"         |
    | stringClean("XXabcYY")          → "XabcY"        |
    | stringClean("112ab445")         → "12ab45"       |
    | stringClean("Hello Bookkeeper") → "Helo Bokeper" |
    |_________________________________________________*/

    public static final String stringClean(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _StringClean.Validate(true);  // pass 'false' to print failed tests only.
    }
}
