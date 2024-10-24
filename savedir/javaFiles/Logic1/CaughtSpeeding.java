package Logic1;
import Logic1.Testcases._CaughtSpeeding;

// https://codingbat.com/prob/p157733
// Difficulty: 112.0

public class CaughtSpeeding
{
    /* You are driving a little too fast, and a police officer stops you. 
    Write code to compute the result, encoded as an int value: 
    0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, 
    the result is 0. If speed is between 61 and 80 inclusive, 
    the result is 1. If speed is 81 or more, the result is 2. 
    Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | caughtSpeeding(60, false) → 0 |
    | caughtSpeeding(65, false) → 1 |
    | caughtSpeeding(65, true)  → 0 |
    | caughtSpeeding(80, false) → 1 |
    | caughtSpeeding(85, false) → 2 |
    | caughtSpeeding(85, true)  → 1 |
    | caughtSpeeding(70, false) → 1 |
    | caughtSpeeding(75, false) → 1 |
    | caughtSpeeding(75, true)  → 1 |
    | caughtSpeeding(40, false) → 0 |
    | caughtSpeeding(40, true)  → 0 |
    | caughtSpeeding(90, false) → 2 |
    |______________________________*/

    public static int caughtSpeeding(int speed, boolean isBirthday)
    {
        return 0;
    }

    public static void main(String[] args) {
        _CaughtSpeeding.Validate(true);  // pass 'false' to print failed tests only.
    }
}
