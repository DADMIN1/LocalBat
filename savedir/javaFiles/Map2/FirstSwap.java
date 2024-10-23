// https://codingbat.com/prob/p150113
package Map2;
import Map2.Testcases._FirstSwap;

public class FirstSwap
{
    /* We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
    Loop over and then return the given array of non-empty strings as follows: 
    if a string matches an earlier string in the array, swap the 2 strings in the array. 
    A particular first char can only cause 1 swap, so once a char has caused a swap, 
    its later swaps are disabled. Using a map, this can be solved making just one pass over the array. 
    More difficult than it looks. */

    /*___________________________________________________________________________________________________________________
    |                                                     Testcases                                                      |
    |____________________________________________________________________________________________________________________|
    | firstSwap(["ab", "ac"])                                       → ["ac", "ab"]                                       |
    | firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"] |
    | firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"])   → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]   |
    |___________________________________________________________________________________________________________________*/

    public static String[] firstSwap(String[] strings)
    {
        
    }

    public static void main(String[] args) {
        _FirstSwap.Validate(true);  // pass 'false' to print failed tests only.
    }
}
