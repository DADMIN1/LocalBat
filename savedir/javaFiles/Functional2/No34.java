package Functional2;
import Functional2.Testcases._No34;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p184496
// Difficulty: 212

public final class No34
{
    /* Given a list of strings, return a list of the strings, omitting any string length 3 or 4. */

    /*_______________________________________________________________
    |                           Testcases                            |
    |________________________________________________________________|
    | no34(["a", "bb", "ccc"])              → ["a", "bb"]            |
    | no34(["a", "bb", "ccc", "dddd"])      → ["a", "bb"]            |
    | no34(["ccc", "dddd", "apple"])        → ["apple"]              |
    | no34(["this", "not", "too", "long"])  → []                     |
    | no34(["a", "bbb", "cccc", "xx"])      → ["a", "xx"]            |
    | no34(["dddd", "ddd", "xxxxxxx"])      → ["xxxxxxx"]            |
    | no34([])                              → []                     |
    | no34([""])                            → [""]                   |
    | no34(["empty", "", "empty"])          → ["empty", "", "empty"] |
    | no34(["a"])                           → ["a"]                  |
    | no34(["aaaa", "bbb", "*****", "333"]) → ["*****"]              |
    |_______________________________________________________________*/

    public static final List<String> no34(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _No34.Validate(true);  // pass 'false' to print failed tests only.
    }
}
