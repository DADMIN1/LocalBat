package Recursion1;
import Recursion1.Testcases._NestParen;

// https://codingbat.com/prob/p183174
// Difficulty: 381.0

public final class NestParen
{
    /* Given a string, return true if it is a nesting of zero or more pairs of parenthesis, 
    like "(())" or "((()))". Suggestion: check the first and last chars, 
    and then recur on what's inside them. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | nestParen("(())")      → true  |
    | nestParen("((()))")    → true  |
    | nestParen("(((x))")    → false |
    | nestParen("((())")     → false |
    | nestParen("((()()")    → false |
    | nestParen("()")        → true  |
    | nestParen("")          → true  |
    | nestParen("(yy)")      → false |
    | nestParen("(())")      → true  |
    | nestParen("(((y))")    → false |
    | nestParen("((y)))")    → false |
    | nestParen("((()))")    → true  |
    | nestParen("(())))")    → false |
    | nestParen("((yy())))") → false |
    | nestParen("(((())))")  → true  |
    |_______________________________*/

    public static final boolean nestParen(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _NestParen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
