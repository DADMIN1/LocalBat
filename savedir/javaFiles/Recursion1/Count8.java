// https://codingbat.com/prob/p192383
package Recursion1;
import Recursion1.Testcases._Count8;

public class Count8
{
    /* Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
    except that an 8 with another 8 immediately to its left counts double, 
    so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

    /*_________________
    |    Testcases     |
    |__________________|
    | count8(8)    → 1 |
    | count8(818)  → 2 |
    | count8(8818) → 4 |
    |_________________*/

    public static int count8(int n)
    {
        
    }

    public static void main(String[] args) {
        _Count8.Validate(true);  // pass 'false' to print failed tests only.
    }
}
