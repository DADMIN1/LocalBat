package Map2;
import Map2.Testcases._WordAppend;

// https://codingbat.com/prob/p103593
// Difficulty: 356

public class WordAppend
{
    /* Loop over the given array of strings to build a result string like this: 
    when a string appears the 2nd, 4th, 6th, etc. time in the array, 
    append the string to the result. Return the empty string if no string appears a 2nd time. */

    /*____________________________________________________________________________________________
    |                                          Testcases                                          |
    |_____________________________________________________________________________________________|
    | wordAppend(["a", "b", "a"])                                                 → "a"           |
    | wordAppend(["a", "b", "a", "c", "a", "d", "a"])                             → "aa"          |
    | wordAppend(["a", "", "a"])                                                  → "a"           |
    | wordAppend([])                                                              → ""            |
    | wordAppend(["a", "b", "b", "a", "a"])                                       → "ba"          |
    | wordAppend(["a", "b", "b", "b", "a", "c", "a", "a"])                        → "baa"         |
    | wordAppend(["a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"])         → "baaba"       |
    | wordAppend(["not", "and", "or", "and", "this", "and", "or", "that", "not"]) → "andornot"    |
    | wordAppend(["a", "b", "c"])                                                 → ""            |
    | wordAppend(["this", "or", "that", "and", "this", "and", "that"])            → "thisandthat" |
    | wordAppend(["xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"])                → "xxyyzzxx"    |
    |____________________________________________________________________________________________*/

    public static String wordAppend(String[] strings)
    {
        return "";
    }

    public static void main(String[] args) {
        _WordAppend.Validate(true);  // pass 'false' to print failed tests only.
    }
}
