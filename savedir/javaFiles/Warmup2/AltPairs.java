package Warmup2;
import Warmup2.Testcases._AltPairs;

// https://codingbat.com/prob/p121596
// Difficulty: 233.0

public final class AltPairs
{
    /* Given a string, return a string made of the chars at indexes 0,1, 
    4,5, 8,9 ... so "kittens" yields "kien". */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    |    str (String)    |  returns   |
    |                    |  (String)  |
    |____________________|____________|
    |      "kitten"      |   "kien"   |
    |    "Chocolate"     |  "Chole"   |
    |   "CodingHorror"   |  "Congrr"  |
    |       "yak"        |    "ya"    |
    |        "ya"        |    "ya"    |
    |        "y"         |    "y"     |
    |         ""         |     ""     |
    | "ThisThatTheOther" | "ThThThth" |
    |____________________|___________*/

    public static final String altPairs(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _AltPairs.Validate(true);  // pass 'false' to print failed tests only.
    }
}
