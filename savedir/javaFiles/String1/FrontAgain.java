package String1;
import String1.Testcases._FrontAgain;

// https://codingbat.com/prob/p196652
// Difficulty: 178.0

public class FrontAgain
{
    /* Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
    such as with "edited". */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | frontAgain("edited") → true  |
    | frontAgain("edit")   → false |
    | frontAgain("ed")     → true  |
    | frontAgain("jj")     → true  |
    | frontAgain("jjj")    → true  |
    | frontAgain("jjjj")   → true  |
    | frontAgain("jjjk")   → false |
    | frontAgain("x")      → false |
    | frontAgain("")       → false |
    | frontAgain("java")   → false |
    | frontAgain("javaja") → true  |
    |_____________________________*/

    public static boolean frontAgain(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _FrontAgain.Validate(true);  // pass 'false' to print failed tests only.
    }
}
