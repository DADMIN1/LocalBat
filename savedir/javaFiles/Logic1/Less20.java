package Logic1;
import Logic1.Testcases._Less20;

// https://codingbat.com/prob/p133158
// Difficulty: 123.8

public final class Less20
{
    /* Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
    So for example 38 and 39 return true, but 40 returns false. 
    See also: Introduction to Mod */

    /*_____________________
    |      Testcases       |
    |______________________|
    | less20(18)   → true  |
    | less20(19)   → true  |
    | less20(20)   → false |
    | less20(8)    → false |
    | less20(17)   → false |
    | less20(23)   → false |
    | less20(25)   → false |
    | less20(30)   → false |
    | less20(31)   → false |
    | less20(58)   → true  |
    | less20(59)   → true  |
    | less20(60)   → false |
    | less20(61)   → false |
    | less20(62)   → false |
    | less20(1017) → false |
    | less20(1018) → true  |
    | less20(1019) → true  |
    | less20(1020) → false |
    | less20(1021) → false |
    | less20(1022) → false |
    | less20(1023) → false |
    | less20(37)   → false |
    |_____________________*/

    public static final boolean less20(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Less20.Validate(true);  // pass 'false' to print failed tests only.
    }
}
