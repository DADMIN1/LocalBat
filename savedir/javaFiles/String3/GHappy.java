package String3;
import String3.Testcases._GHappy;

// https://codingbat.com/prob/p198664
// Difficulty: 312.0

public final class GHappy
{
    /* We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. 
    Return true if all the g's in the given string are happy. */

    /*________________________
    |        Testcases        |
    |_________________________|
    |     str     |  returns  |
    |   (String)  | (boolean) |
    |_____________|___________|
    |   "xxggxx"  |    true   |
    |   "xxgxx"   |   false   |
    | "xxggyygxx" |   false   |
    |     "g"     |   false   |
    |     "gg"    |    true   |
    |      ""     |    true   |
    |  "xxgggxyz" |    true   |
    |  "xxgggxyg" |   false   |
    | "xxgggxygg" |    true   |
    |    "mgm"    |   false   |
    |    "mggm"   |    true   |
    | "yyygggxyy" |    true   |
    |_____________|__________*/

    public static final boolean gHappy(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_GHappy.printSuccesses = false;  // set 'false' to print failing tests only.
        //_GHappy.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _GHappy.Validate();
    }
}
