package Warmup1;
import Warmup1.Testcases._In3050;

// https://codingbat.com/prob/p132134
// Difficulty: 175.0

public final class In3050
{
    /* Given 2 int values, return true if they are both in the range 30..40 inclusive, 
    or they are both in the range 40..50 inclusive. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | a     | b     | expected  |
    | (int) | (int) | (boolean) |
    |_______|_______|___________|
    | 30    | 31    | true      |
    | 30    | 41    | false     |
    | 40    | 50    | true      |
    | 40    | 51    | false     |
    | 39    | 50    | false     |
    | 50    | 39    | false     |
    | 40    | 39    | true      |
    | 49    | 48    | true      |
    | 50    | 40    | true      |
    | 50    | 51    | false     |
    | 35    | 36    | true      |
    | 35    | 45    | false     |
    |_______|_______|__________*/

    public static final boolean in3050(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _In3050.Validate(true);  // pass 'false' to print failed tests only.
    }
}
