package String1;
import String1.Testcases._FrontAgain;

// https://codingbat.com/prob/p196652
// Difficulty: 178.0

public final class FrontAgain
{
    /* Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
    such as with "edited". */

    /*_____________________
    |      Testcases       |
    |______________________|
    |   str    |  returns  |
    | (String) | (boolean) |
    |__________|___________|
    | "edited" |    true   |
    |  "edit"  |   false   |
    |   "ed"   |    true   |
    |   "jj"   |    true   |
    |  "jjj"   |    true   |
    |  "jjjj"  |    true   |
    |  "jjjk"  |   false   |
    |   "x"    |   false   |
    |    ""    |   false   |
    |  "java"  |   false   |
    | "javaja" |    true   |
    |__________|__________*/

    public static final boolean frontAgain(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _FrontAgain.Validate(true);  // pass 'false' to print failed tests only.
    }
}
