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

    /*_________________________________________________________
    |                        Testcases                         |
    |__________________________________________________________|
    | strings (List<String>)                 | expected        |
    |                                        | (List<String>)  |
    |________________________________________|_________________|
    | new ArrayList<>(Arrays.asList("Hello"  | "Hi"))          |
    | new ArrayList<>(Arrays.asList("AAA"    | "BBB"           |
    | new ArrayList<>(Arrays.asList("KitteN" | "ChocolaTE"))   |
    | new ArrayList<>(Arrays.asList())       | Arrays.asList() |
    | new ArrayList<>(Arrays.asList("EMPTY"  | ""))            |
    | new ArrayList<>(Arrays.asList("aaX"    | "bYb"           |
    |________________________________________|________________*/

    public static final List<String> lower(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _Lower.Validate(true);  // pass 'false' to print failed tests only.
    }
}
