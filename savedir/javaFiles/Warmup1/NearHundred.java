package Warmup1;
import Warmup1.Testcases._NearHundred;

// https://codingbat.com/prob/p184004
// Difficulty: 121.0

public final class NearHundred
{
    /* Given an int n, return true if it is within 10 of 100 or 200. 
    Note: Math.abs(num) computes the absolute value of a number. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | n (int) |  returns  |
    |         | (boolean) |
    |_________|___________|
    |    93   |    true   |
    |    90   |    true   |
    |    89   |   false   |
    |   110   |    true   |
    |   111   |   false   |
    |   121   |   false   |
    |   -101  |   false   |
    |   -209  |   false   |
    |   190   |    true   |
    |   209   |    true   |
    |    0    |   false   |
    |    5    |   false   |
    |   -50   |   false   |
    |   191   |    true   |
    |   189   |   false   |
    |   200   |    true   |
    |   210   |    true   |
    |   211   |   false   |
    |   290   |   false   |
    |_________|__________*/

    public static final boolean nearHundred(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _NearHundred.Validate(true);  // pass 'false' to print failed tests only.
    }
}
