package AP1;
import AP1.Testcases._HasOne;

// https://codingbat.com/prob/p191212
// Difficulty: 224.0

public final class HasOne
{
    /* Given a positive int n, return true if it contains a 1 digit. 
    Note: use % to get the rightmost digit, and / to discard the rightmost digit. */

    /*_______________________
    |       Testcases        |
    |________________________|
    | hasOne(10)     → true  |
    | hasOne(22)     → false |
    | hasOne(220)    → false |
    | hasOne(212)    → true  |
    | hasOne(1)      → true  |
    | hasOne(9)      → false |
    | hasOne(211112) → true  |
    | hasOne(121121) → true  |
    | hasOne(222222) → false |
    | hasOne(56156)  → true  |
    | hasOne(56556)  → false |
    |_______________________*/

    public static final boolean hasOne(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _HasOne.Validate(true);  // pass 'false' to print failed tests only.
    }
}
