package String2;
import String2.Testcases._BobThere;

// https://codingbat.com/prob/p175762
// Difficulty: 221.0

public class BobThere
{
    /* Return true if the given string contains a "bob" string, 
    but where the middle 'o' char can be any char. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | bobThere("abcbob")          → true  |
    | bobThere("b9b")             → true  |
    | bobThere("bac")             → false |
    | bobThere("bbb")             → true  |
    | bobThere("abcdefb")         → false |
    | bobThere("123abcbcdbabxyz") → true  |
    | bobThere("b12")             → false |
    | bobThere("b1b")             → true  |
    | bobThere("b12b1b")          → true  |
    | bobThere("bbc")             → false |
    | bobThere("bbb")             → true  |
    | bobThere("bb")              → false |
    | bobThere("b")               → false |
    |____________________________________*/

    public static boolean bobThere(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _BobThere.Validate(true);  // pass 'false' to print failed tests only.
    }
}
