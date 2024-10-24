package Warmup1;
import Warmup1.Testcases._StartHi;

// https://codingbat.com/prob/p191022
// Difficulty: 145.0

public class StartHi
{
    /* Given a string, return true if the string starts with "hi" and false otherwise. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | startHi("hi there") → true  |
    | startHi("hi")       → true  |
    | startHi("hello hi") → false |
    | startHi("he")       → false |
    | startHi("h")        → false |
    | startHi("")         → false |
    | startHi("ho hi")    → false |
    | startHi("hi ho")    → true  |
    |____________________________*/

    public static boolean startHi(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _StartHi.Validate(true);  // pass 'false' to print failed tests only.
    }
}
