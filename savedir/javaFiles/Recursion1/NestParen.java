// https://codingbat.com/prob/p183174
package Recursion1;
import Recursion1.Testcases._NestParen;

public class NestParen
{
    /* Given a string, return true if it is a nesting of zero or more pairs of parenthesis, 
    like "(())" or "((()))". Suggestion: check the first and last chars, 
    and then recur on what's inside them. */

    /*_____________________________
    |          Testcases          |
    |_____________________________|
    | nestParen("(())")   → true  |
    | nestParen("((()))") → true  |
    | nestParen("(((x))") → false |
    |____________________________*/

    public static boolean nestParen(String str)
    {
        
    }

    public static void main(String[] args) {
        _NestParen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
