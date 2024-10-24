package String3;
import String3.Testcases._GHappy;

// https://codingbat.com/prob/p198664
// Difficulty: 312.0

public class GHappy
{
    /* We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. 
    Return true if all the g's in the given string are happy. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | gHappy("xxggxx")    → true  |
    | gHappy("xxgxx")     → false |
    | gHappy("xxggyygxx") → false |
    | gHappy("g")         → false |
    | gHappy("gg")        → true  |
    | gHappy("")          → true  |
    | gHappy("xxgggxyz")  → true  |
    | gHappy("xxgggxyg")  → false |
    | gHappy("xxgggxygg") → true  |
    | gHappy("mgm")       → false |
    | gHappy("mggm")      → true  |
    | gHappy("yyygggxyy") → true  |
    |____________________________*/

    public static boolean gHappy(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _GHappy.Validate(true);  // pass 'false' to print failed tests only.
    }
}
