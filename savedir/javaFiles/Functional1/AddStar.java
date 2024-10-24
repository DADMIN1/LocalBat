package Functional1;
import Functional1.Testcases._AddStar;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p170181
// Difficulty: 206

public class AddStar
{
    /* Given a list of strings, return a list where each string has "*" added at its end. */

    /*_____________________________________________________________________________________________
    |                                          Testcases                                           |
    |______________________________________________________________________________________________|
    | addStar(["a", "bb", "ccc"])                     → ["a*", "bb*", "ccc*"]                      |
    | addStar(["hello", "there"])                     → ["hello*", "there*"]                       |
    | addStar(["*"])                                  → ["**"]                                     |
    | addStar([])                                     → []                                         |
    | addStar(["kittens", "and", "chocolate", "and"]) → ["kittens*", "and*", "chocolate*", "and*"] |
    | addStar(["empty", "string", ""])                → ["empty*", "string*", "*"]                 |
    |_____________________________________________________________________________________________*/

    public static List<String> addStar(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static void main(String[] args) {
        _AddStar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
