package Map2;
import Map2.Testcases._AllSwap;

// https://codingbat.com/prob/p134133
// Difficulty: 377

public final class AllSwap
{
    /* We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
    Loop over and then return the given array of non-empty strings as follows: 
    if a string matches an earlier string in the array, swap the 2 strings in the array. 
    When a position in the array has been swapped, it no longer matches anything. 
    Using a map, this can be solved making just one pass over the array. 
    More difficult than it looks. */

    /*________________________________________________________________________________________________________________________________________
    |                                                                Testcases                                                                |
    |_________________________________________________________________________________________________________________________________________|
    | strings (String[])                                                  | expected (String[])                                               |
    |_____________________________________________________________________|___________________________________________________________________|
    | { "ab", "ac" }                                                      | {"ac", "ab"}                                                      |
    | { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" }                | {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"}                |
    | { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" }                  | {"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"}                  |
    | { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" }                      | {"ay", "bx", "cy", "ax", "cx", "abb", "aaa"}                      |
    | { "easy", "does", "it", "every", "ice", "eaten" }                   | {"every", "does", "ice", "easy", "it", "eaten"}                   |
    | { "list", "of", "words", "swims", "over", "lily", "water", "wait" } | {"lily", "over", "water", "swims", "of", "list", "words", "wait"} |
    | { "4", "8", "15", "16", "23", "42" }                                | {"42", "8", "16", "15", "23", "4"}                                |
    | { "aaa" }                                                           | {"aaa"}                                                           |
    | {  }                                                                | {}                                                                |
    | { "a", "b", "c", "xx", "yy", "zz" }                                 | {"a", "b", "c", "xx", "yy", "zz"}                                 |
    |_____________________________________________________________________|__________________________________________________________________*/

    public static final String[] allSwap(String[] strings)
    {
        return new String[]{""};
    }

    public static final void main(String[] args) {
        _AllSwap.Validate(true);  // pass 'false' to print failed tests only.
    }
}
