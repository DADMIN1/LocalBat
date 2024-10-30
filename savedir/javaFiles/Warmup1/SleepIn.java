package Warmup1;
import Warmup1.Testcases._SleepIn;

// https://codingbat.com/prob/p187868
// Difficulty: 103.0

public final class SleepIn
{
    /* The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
    We sleep in if it is not a weekday or we're on vacation. 
    Return true if we sleep in. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | weekday   | vacation  | expected  |
    | (boolean) | (boolean) | (boolean) |
    |___________|___________|___________|
    | false     | false     | true      |
    | true      | false     | false     |
    | false     | true      | true      |
    | true      | true      | true      |
    |___________|___________|__________*/

    public static final boolean sleepIn(boolean weekday, boolean vacation)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SleepIn.Validate(true);  // pass 'false' to print failed tests only.
    }
}
