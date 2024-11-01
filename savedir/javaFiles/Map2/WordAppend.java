package Map2;
import Map2.Testcases._WordAppend;

// https://codingbat.com/prob/p103593
// Difficulty: 356

public final class WordAppend
{
    /* Loop over the given array of strings to build a result string like this: 
    when a string appears the 2nd, 4th, 6th, etc. time in the array, 
    append the string to the result. Return the empty string if no string appears a 2nd time. */

    /*________________________________________________________________________________
    |                                    Testcases                                    |
    |_________________________________________________________________________________|
    | strings (String[])                                              | expected      |
    |                                                                 | (String)      |
    |_________________________________________________________________|_______________|
    | {"a", "b", "a"}                                                 | "a"           |
    | {"a", "b", "a", "c", "a", "d", "a"}                             | "aa"          |
    | {"a", "", "a"}                                                  | "a"           |
    | {}                                                              | ""            |
    | {"a", "b", "b", "a", "a"}                                       | "ba"          |
    | {"a", "b", "b", "b", "a", "c", "a", "a"}                        | "baa"         |
    | {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}         | "baaba"       |
    | {"not", "and", "or", "and", "this", "and", "or", "that", "not"} | "andornot"    |
    | {"a", "b", "c"}                                                 | ""            |
    | {"this", "or", "that", "and", "this", "and", "that"}            | "thisandthat" |
    | {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}                | "xxyyzzxx"    |
    |_________________________________________________________________|______________*/

    public static final String wordAppend(String[] strings)
    {
        return "";
    }

    public static final void main(String[] args) {
        _WordAppend.Validate(true);  // pass 'false' to print failed tests only.
    }
}
