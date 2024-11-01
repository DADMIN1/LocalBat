package String2;
import String2.Testcases._CatDog;

// https://codingbat.com/prob/p111624
// Difficulty: 209.0

public final class CatDog
{
    /* Return true if the string "cat" and "dog" appear the same number of times in the given string. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    |    str (String)   |  returns  |
    |                   | (boolean) |
    |___________________|___________|
    |      "catdog"     |    true   |
    |      "catcat"     |   false   |
    |   "1cat1cadodog"  |    true   |
    |  "catxxdogxxxdog" |   false   |
    | "catxdogxdogxcat" |    true   |
    |  "catxdogxdogxca" |   false   |
    |    "dogdogcat"    |   false   |
    |     "dogogcat"    |    true   |
    |       "dog"       |   false   |
    |       "cat"       |   false   |
    |        "ca"       |    true   |
    |        "c"        |    true   |
    |         ""        |    true   |
    |___________________|__________*/

    public static final boolean catDog(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _CatDog.Validate(true);  // pass 'false' to print failed tests only.
    }
}
