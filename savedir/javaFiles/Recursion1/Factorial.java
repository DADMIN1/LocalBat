package Recursion1;
import Recursion1.Testcases._Factorial;

// https://codingbat.com/prob/p154669
// Difficulty: 303.0

public class Factorial
{
    /* Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 
    1. Compute the result recursively (without loops). */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | factorial(1)  → 1         |
    | factorial(2)  → 2         |
    | factorial(3)  → 6         |
    | factorial(4)  → 24        |
    | factorial(5)  → 120       |
    | factorial(6)  → 720       |
    | factorial(7)  → 5040      |
    | factorial(8)  → 40320     |
    | factorial(12) → 479001600 |
    |__________________________*/

    public static int factorial(int n)
    {
        return 0;
    }

    public static void main(String[] args) {
        _Factorial.Validate(true);  // pass 'false' to print failed tests only.
    }
}
