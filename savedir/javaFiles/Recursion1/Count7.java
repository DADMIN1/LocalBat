package Recursion1;
import Recursion1.Testcases._Count7;

// https://codingbat.com/prob/p101409
// Difficulty: 321.0

public final class Count7
{
    /* Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
    so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

    /*_____________________
    |      Testcases       |
    |______________________|
    | n (int)   | expected |
    |           | (int)    |
    |___________|__________|
    | 717       | 2        |
    | 7         | 1        |
    | 123       | 0        |
    | 77        | 2        |
    | 7123      | 1        |
    | 771237    | 3        |
    | 771737    | 4        |
    | 47571     | 2        |
    | 777777    | 6        |
    | 70701277  | 4        |
    | 777576197 | 5        |
    | 99999     | 0        |
    | 99799     | 1        |
    |___________|_________*/

    public static final int count7(int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Count7.Validate(true);  // pass 'false' to print failed tests only.
    }
}
