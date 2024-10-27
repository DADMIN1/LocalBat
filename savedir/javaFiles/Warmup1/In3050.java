package Warmup1;
import Warmup1.Testcases._In3050;

// https://codingbat.com/prob/p132134
// Difficulty: 175.0

public final class In3050
{
    /* Given 2 int values, return true if they are both in the range 30..40 inclusive, 
    or they are both in the range 40..50 inclusive. */

    /*_______________________
    |       Testcases        |
    |________________________|
    | in3050(30, 31) → true  |
    | in3050(30, 41) → false |
    | in3050(40, 50) → true  |
    | in3050(40, 51) → false |
    | in3050(39, 50) → false |
    | in3050(50, 39) → false |
    | in3050(40, 39) → true  |
    | in3050(49, 48) → true  |
    | in3050(50, 40) → true  |
    | in3050(50, 51) → false |
    | in3050(35, 36) → true  |
    | in3050(35, 45) → false |
    |_______________________*/

    public static final boolean in3050(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _In3050.Validate(true);  // pass 'false' to print failed tests only.
    }
}
