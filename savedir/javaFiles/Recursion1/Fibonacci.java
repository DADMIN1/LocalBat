// https://codingbat.com/prob/p120015
package Recursion1;
import Recursion1.Testcases._Fibonacci;

public class Fibonacci
{
    /* The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. 
    The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
    Each subsequent value is the sum of the previous two values, 
    so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
    Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
    with n=0 representing the start of the sequence. */

    /*_________________
    |    Testcases     |
    |__________________|
    | fibonacci(0) → 0 |
    | fibonacci(1) → 1 |
    | fibonacci(2) → 1 |
    |_________________*/

    public static int fibonacci(int n)
    {
        
    }

    public static void main(String[] args) {
        _Fibonacci.Validate(true);  // pass 'false' to print failed tests only.
    }
}
