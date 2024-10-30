package Recursion1;
import Recursion1.Testcases._Count8;

// https://codingbat.com/prob/p192383
// Difficulty: 324.0

public final class Count8
{
    /* Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
    except that an 8 with another 8 immediately to its left counts double, 
    so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

    /*___________________
    |     Testcases      |
    |____________________|
    | n (int) | expected |
    |         | (int)    |
    |_________|__________|
    | 8       | 1        |
    | 818     | 2        |
    | 8818    | 4        |
    | 8088    | 4        |
    | 123     | 0        |
    | 81238   | 2        |
    | 88788   | 6        |
    | 8234    | 1        |
    | 2348    | 1        |
    | 23884   | 3        |
    | 0       | 0        |
    | 1818188 | 5        |
    | 8818181 | 5        |
    | 1080    | 1        |
    | 188     | 3        |
    | 88888   | 9        |
    | 9898    | 2        |
    | 78      | 1        |
    |_________|_________*/

    public static final int count8(int n)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Count8.Validate(true);  // pass 'false' to print failed tests only.
    }
}
