package Functional1;
import Functional1.Testcases._Lower;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p186894
// Difficulty: 221

public class Lower
{
    /* Given a list of strings, return a list where each string is converted to lower case (Note: 
    String toLowerCase() method). */

    /*___________________________________________________________________
    |                             Testcases                              |
    |____________________________________________________________________|
    | lower(["Hello", "Hi"])              → ["hello", "hi"]              |
    | lower(["AAA", "BBB", "ccc"])        → ["aaa", "bbb", "ccc"]        |
    | lower(["KitteN", "ChocolaTE"])      → ["kitten", "chocolate"]      |
    | lower([])                           → []                           |
    | lower(["EMPTY", ""])                → ["empty", ""]                |
    | lower(["aaX", "bYb", "Ycc", "ZZZ"]) → ["aax", "byb", "ycc", "zzz"] |
    |___________________________________________________________________*/

    public static List<String> lower(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static void main(String[] args) {
        _Lower.Validate(true);  // pass 'false' to print failed tests only.
    }
}
