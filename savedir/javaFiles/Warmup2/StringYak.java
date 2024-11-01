package Warmup2;
import Warmup2.Testcases._StringYak;

// https://codingbat.com/prob/p126212
// Difficulty: 236.0

public final class StringYak
{
    /* Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, 
    but the "a" can be any char. The "yak" strings will not overlap. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    |   str (String)   |  returns   |
    |                  |  (String)  |
    |__________________|____________|
    |     "yakpak"     |   "pak"    |
    |     "pakyak"     |   "pak"    |
    |    "yak123ya"    |  "123ya"   |
    |      "yak"       |     ""     |
    |   "yakxxxyak"    |   "xxx"    |
    |    "HiyakHi"     |   "HiHi"   |
    | "xxxyakyyyakzzz" | "xxxyyzzz" |
    |__________________|___________*/

    public static final String stringYak(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _StringYak.Validate(true);  // pass 'false' to print failed tests only.
    }
}
