package Logic1;
import Logic1.Testcases._In1To10;

// https://codingbat.com/prob/p137365
// Difficulty: 121.0

public class In1To10
{
    /* Given a number n, return true if n is in the range 1..10, 
    inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, 
    or greater or equal to 10. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    | in1To10(5, false)  → true  |
    | in1To10(11, false) → false |
    | in1To10(11, true)  → true  |
    | in1To10(10, false) → true  |
    | in1To10(10, true)  → true  |
    | in1To10(9, false)  → true  |
    | in1To10(9, true)   → false |
    | in1To10(1, false)  → true  |
    | in1To10(1, true)   → true  |
    | in1To10(0, false)  → false |
    | in1To10(0, true)   → true  |
    | in1To10(-1, false) → false |
    | in1To10(-1, true)  → true  |
    | in1To10(99, false) → false |
    | in1To10(-99, true) → true  |
    |___________________________*/

    public static boolean in1To10(int n, boolean outsideMode)
    {
        return false;
    }

    public static void main(String[] args) {
        _In1To10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
