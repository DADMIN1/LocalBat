package Recursion1;
import Recursion1.Testcases._StrDist;

// https://codingbat.com/prob/p195413
// Difficulty: 390.0

public final class StrDist
{
    /* Given a string and a non-empty substring sub, 
    compute recursively the largest substring which starts and ends with sub and return its length. */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    |     str (String)     |   sub    | returns |
    |                      | (String) |  (int)  |
    |______________________|__________|_________|
    |     "catcowcat"      |  "cat"   |    9    |
    |     "catcowcat"      |  "cow"   |    3    |
    |   "cccatcowcatxx"    |  "cat"   |    9    |
    | "abccatcowcatcatxyz" |  "cat"   |    12   |
    |        "xyx"         |   "x"    |    3    |
    |        "xyx"         |   "y"    |    1    |
    |        "xyx"         |   "z"    |    0    |
    |         "z"          |   "z"    |    1    |
    |         "x"          |   "z"    |    0    |
    |          ""          |   "z"    |    0    |
    |   "hiHellohihihi"    |   "hi"   |    13   |
    |   "hiHellohihihi"    |  "hih"   |    5    |
    |   "hiHellohihihi"    |   "o"    |    1    |
    |   "hiHellohihihi"    |   "ll"   |    2    |
    |______________________|__________|________*/

    public static final int strDist(String str, String sub)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _StrDist.Validate(true);  // pass 'false' to print failed tests only.
    }
}
