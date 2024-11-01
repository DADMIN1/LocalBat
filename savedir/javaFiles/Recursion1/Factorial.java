package Recursion1;
import Recursion1.Testcases._Factorial;

// https://codingbat.com/prob/p154669
// Difficulty: 303.0

public final class Factorial
{
    /* Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 
    1. Compute the result recursively (without loops). */

    /*____________________
    |      Testcases      |
    |_____________________|
    | n (int) |  returns  |
    |         |   (int)   |
    |_________|___________|
    |    1    |     1     |
    |    2    |     2     |
    |    3    |     6     |
    |    4    |     24    |
    |    5    |    120    |
    |    6    |    720    |
    |    7    |    5040   |
    |    8    |   40320   |
    |    12   | 479001600 |
    |_________|__________*/

    public static final int factorial(int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Factorial.Validate(true);  // pass 'false' to print failed tests only.
    }
}
