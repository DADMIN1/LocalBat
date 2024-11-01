package Functional1;
import Functional1.Testcases._Lower;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p186894
// Difficulty: 221

public final class Lower
{
    /* Given a list of strings, return a list where each string is converted to lower case (Note: 
    String toLowerCase() method). */

    /*____________________________________________________________
    |                          Testcases                          |
    |_____________________________________________________________|
    |    strings (List<String>)    |    returns (List<String>)    |
    |______________________________|______________________________|
    | ["Hello", "Hi"]              | ["hello", "hi"]              |
    | ["AAA", "BBB", "ccc"]        | ["aaa", "bbb", "ccc"]        |
    | ["KitteN", "ChocolaTE"]      | ["kitten", "chocolate"]      |
    | []                           | []                           |
    | ["EMPTY", ""]                | ["empty", ""]                |
    | ["aaX", "bYb", "Ycc", "ZZZ"] | ["aax", "byb", "ycc", "zzz"] |
    |______________________________|_____________________________*/

    public static final List<String> lower(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _Lower.Validate(true);  // pass 'false' to print failed tests only.
    }
}
