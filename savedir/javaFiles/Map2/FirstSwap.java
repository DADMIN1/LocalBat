package Map2;
import Map2.Testcases._FirstSwap;

// https://codingbat.com/prob/p150113
// Difficulty: 380

public final class FirstSwap
{
    /* We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
    Loop over and then return the given array of non-empty strings as follows: 
    if a string matches an earlier string in the array, swap the 2 strings in the array. 
    A particular first char can only cause 1 swap, so once a char has caused a swap, 
    its later swaps are disabled. Using a map, this can be solved making just one pass over the array. 
    More difficult than it looks. */

    /*______________________________________________________________________________________________________________________________________
    |                                                               Testcases                                                               |
    |_______________________________________________________________________________________________________________________________________|
    |                         strings (String[])                        |                         returns (String[])                        |
    |___________________________________________________________________|___________________________________________________________________|
    | {"ab", "ac"}                                                      | {"ac", "ab"}                                                      |
    | {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}                | {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"}                |
    | {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}                  | {"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"}                  |
    | {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"}                      | {"ay", "bx", "cy", "ax", "cx", "aaa", "abb"}                      |
    | {"easy", "does", "it", "every", "ice", "eaten"}                   | {"every", "does", "ice", "easy", "it", "eaten"}                   |
    | {"list", "of", "words", "swims", "over", "lily", "water", "wait"} | {"lily", "over", "water", "swims", "of", "list", "words", "wait"} |
    | {"4", "8", "15", "16", "23", "42"}                                | {"42", "8", "16", "15", "23", "4"}                                |
    | {"aaa"}                                                           | {"aaa"}                                                           |
    | {}                                                                | {}                                                                |
    | {"a", "b", "c", "xx", "yy", "zz"}                                 | {"a", "b", "c", "xx", "yy", "zz"}                                 |
    |___________________________________________________________________|__________________________________________________________________*/

    public static final String[] firstSwap(String[] strings)
    {
        return new String[]{""};
    }

    public static final void main(String[] args) {
        //_FirstSwap.printSuccesses = false;  // set 'false' to print failing tests only.
        //_FirstSwap.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _FirstSwap.Validate();
    }
}
