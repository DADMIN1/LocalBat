package Recursion1;
import Recursion1.Testcases._CountHi2;

// https://codingbat.com/prob/p143900
// Difficulty: 375.0

public class CountHi2
{
    /* Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
    however do not count "hi" that have an 'x' immedately before them. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | countHi2("ahixhi")   → 1 |
    | countHi2("ahibhi")   → 2 |
    | countHi2("xhixhi")   → 0 |
    | countHi2("hixhi")    → 1 |
    | countHi2("hixhhi")   → 2 |
    | countHi2("hihihi")   → 3 |
    | countHi2("hihihix")  → 3 |
    | countHi2("xhihihix") → 2 |
    | countHi2("xxhi")     → 0 |
    | countHi2("hixxhi")   → 1 |
    | countHi2("hi")       → 1 |
    | countHi2("xxxx")     → 0 |
    | countHi2("h")        → 0 |
    | countHi2("x")        → 0 |
    | countHi2("")         → 0 |
    | countHi2("Hellohi")  → 1 |
    |_________________________*/

    public static int countHi2(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _CountHi2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
