package Warmup1;
import Warmup1.Testcases._SleepIn;

// https://codingbat.com/prob/p187868
// Difficulty: 103.0

public class SleepIn
{
    /* The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
    We sleep in if it is not a weekday or we're on vacation. 
    Return true if we sleep in. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | sleepIn(false, false) → true  |
    | sleepIn(true, false)  → false |
    | sleepIn(false, true)  → true  |
    | sleepIn(true, true)   → true  |
    |______________________________*/

    public static boolean sleepIn(boolean weekday, boolean vacation)
    {
        return false;
    }

    public static void main(String[] args) {
        _SleepIn.Validate(true);  // pass 'false' to print failed tests only.
    }
}
