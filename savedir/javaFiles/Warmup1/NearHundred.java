package Warmup1;
import Warmup1.Testcases._NearHundred;

// https://codingbat.com/prob/p184004
// Difficulty: 121.0

public final class NearHundred
{
    /* Given an int n, return true if it is within 10 of 100 or 200. 
    Note: Math.abs(num) computes the absolute value of a number. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | nearHundred(93)   → true  |
    | nearHundred(90)   → true  |
    | nearHundred(89)   → false |
    | nearHundred(110)  → true  |
    | nearHundred(111)  → false |
    | nearHundred(121)  → false |
    | nearHundred(-101) → false |
    | nearHundred(-209) → false |
    | nearHundred(190)  → true  |
    | nearHundred(209)  → true  |
    | nearHundred(0)    → false |
    | nearHundred(5)    → false |
    | nearHundred(-50)  → false |
    | nearHundred(191)  → true  |
    | nearHundred(189)  → false |
    | nearHundred(200)  → true  |
    | nearHundred(210)  → true  |
    | nearHundred(211)  → false |
    | nearHundred(290)  → false |
    |__________________________*/

    public static final boolean nearHundred(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _NearHundred.Validate(true);  // pass 'false' to print failed tests only.
    }
}
