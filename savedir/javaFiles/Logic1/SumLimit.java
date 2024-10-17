// https://codingbat.com/prob/p118077
package Logic1;
import Logic1.Testcases._SumLimit;

public class SumLimit
{
    /* Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
    If the sum has more digits than a, just return a without b. 
    (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.) */

    /*____________________
    |     Testcases      |
    |____________________|
    | sumLimit(2, 3) → 5 |
    | sumLimit(8, 3) → 8 |
    | sumLimit(8, 1) → 9 |
    |___________________*/

    public static int sumLimit(int a, int b)
    {
        
    }

    public static void main(String[] args) {
        _SumLimit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
