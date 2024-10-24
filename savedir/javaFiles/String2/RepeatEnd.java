package String2;
import String2.Testcases._RepeatEnd;

// https://codingbat.com/prob/p152339
// Difficulty: 230.0

public class RepeatEnd
{
    /* Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
    You may assume that n is between 0 and the length of the string, 
    inclusive. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | repeatEnd("Hello", 3) → "llollollo" |
    | repeatEnd("Hello", 2) → "lolo"      |
    | repeatEnd("Hello", 1) → "o"         |
    | repeatEnd("Hello", 0) → ""          |
    | repeatEnd("abc", 3)   → "abcabcabc" |
    | repeatEnd("1234", 2)  → "3434"      |
    | repeatEnd("1234", 3)  → "234234234" |
    | repeatEnd("", 0)      → ""          |
    |____________________________________*/

    public static String repeatEnd(String str, int n)
    {
        return "";
    }

    public static void main(String[] args) {
        _RepeatEnd.Validate(true);  // pass 'false' to print failed tests only.
    }
}
