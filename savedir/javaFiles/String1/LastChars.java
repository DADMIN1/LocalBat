// https://codingbat.com/prob/p138183
package String1;
import String1.Testcases._LastChars;

public class LastChars
{
    /* Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, 
    so "yo" and "java" yields "ya". If either string is length 0, 
    use '@' for its missing char. */

    /*___________________________________
    |             Testcases             |
    _____________________________________
    | lastChars("last", "chars") → "ls" |
    | lastChars("yo", "java")    → "ya" |
    | lastChars("hi", "")        → "h@" |
    ___________________________________*/

    public static String lastChars(String a, String b)
    {
        
    }

    public static void main(String[] args) {
        _LastChars.Validate(true);  // pass 'false' to print failed tests only.
    }
}
