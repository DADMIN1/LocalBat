// https://codingbat.com/prob/p134133
package Map2;
import Map2.Testcases._AllSwap;

public class AllSwap
{
    /* We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
    Loop over and then return the given array of non-empty strings as follows: 
    if a string matches an earlier string in the array, swap the 2 strings in the array. 
    When a position in the array has been swapped, it no longer matches anything. 
    Using a map, this can be solved making just one pass over the array. 
    More difficult than it looks. */

    /*__________________________________________________________________________________________________________________
    |                                                    Testcases                                                     |
    |__________________________________________________________________________________________________________________|
    | allSwap(["ab", "ac"])                                       → ["ac", "ab"]                                       |
    | allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"] |
    | allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"])   → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]   |
    |_________________________________________________________________________________________________________________*/

    public static String[] allSwap(String[] strings)
    {
        
    }

    public static void main(String[] args) {
        _AllSwap.Validate(true);  // pass 'false' to print failed tests only.
    }
}
