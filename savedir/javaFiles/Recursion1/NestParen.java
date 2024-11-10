package Recursion1;
import Recursion1.Testcases._NestParen;

// https://codingbat.com/prob/p183174
// Difficulty: 381.0

public final class NestParen
{
    /* Given a string, return true if it is a nesting of zero or more pairs of parenthesis, 
    like "(())" or "((()))". Suggestion: check the first and last chars, 
    and then recur on what's inside them. */

    /*________________________
    |        Testcases        |
    |_________________________|
    |     str     |  returns  |
    |   (String)  | (boolean) |
    |_____________|___________|
    |    "(())"   |    true   |
    |   "((()))"  |    true   |
    |   "(((x))"  |   false   |
    |   "((())"   |   false   |
    |   "((()()"  |   false   |
    |     "()"    |    true   |
    |      ""     |    true   |
    |    "(yy)"   |   false   |
    |    "(())"   |    true   |
    |   "(((y))"  |   false   |
    |   "((y)))"  |   false   |
    |   "((()))"  |    true   |
    |   "(())))"  |   false   |
    | "((yy())))" |   false   |
    |  "(((())))" |    true   |
    |_____________|__________*/

    public static final boolean nestParen(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_NestParen.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NestParen.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NestParen.Validate();
    }
}
