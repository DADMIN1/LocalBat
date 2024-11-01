package Recursion1;
import Recursion1.Testcases._Fibonacci;

// https://codingbat.com/prob/p120015
// Difficulty: 309.0

public final class Fibonacci
{
    /* The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. 
    The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
    Each subsequent value is the sum of the previous two values, 
    so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
    Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
    with n=0 representing the start of the sequence. */

    /*__________________
    |     Testcases     |
    |___________________|
    | n (int) | returns |
    |         |  (int)  |
    |_________|_________|
    |    0    |    0    |
    |    1    |    1    |
    |    2    |    1    |
    |    3    |    2    |
    |    4    |    3    |
    |    5    |    5    |
    |    6    |    8    |
    |    7    |    13   |
    |_________|________*/

    public static final int fibonacci(int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Fibonacci.Validate(true);  // pass 'false' to print failed tests only.
    }
}
