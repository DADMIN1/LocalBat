package Warmup1;
import Warmup1.Testcases._ParrotTrouble;

// https://codingbat.com/prob/p140449
// Difficulty: 115.0

public final class ParrotTrouble
{
    /* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
    We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
    Return true if we are in trouble. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | parrotTrouble(true, 6)   → true  |
    | parrotTrouble(true, 7)   → false |
    | parrotTrouble(false, 6)  → false |
    | parrotTrouble(true, 21)  → true  |
    | parrotTrouble(false, 21) → false |
    | parrotTrouble(false, 20) → false |
    | parrotTrouble(true, 23)  → true  |
    | parrotTrouble(false, 23) → false |
    | parrotTrouble(true, 20)  → false |
    | parrotTrouble(false, 12) → false |
    |_________________________________*/

    public static final boolean parrotTrouble(boolean talking, int hour)
    {
        return false;
    }

    public static final void main(String[] args) {
        _ParrotTrouble.Validate(true);  // pass 'false' to print failed tests only.
    }
}
