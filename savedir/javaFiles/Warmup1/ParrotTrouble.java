package Warmup1;
import Warmup1.Testcases._ParrotTrouble;

// https://codingbat.com/prob/p140449
// Difficulty: 115.0

public final class ParrotTrouble
{
    /* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
    We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
    Return true if we are in trouble. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    |  talking  |  hour |  returns  |
    | (boolean) | (int) | (boolean) |
    |___________|_______|___________|
    |    true   |   6   |    true   |
    |    true   |   7   |   false   |
    |   false   |   6   |   false   |
    |    true   |   21  |    true   |
    |   false   |   21  |   false   |
    |   false   |   20  |   false   |
    |    true   |   23  |    true   |
    |   false   |   23  |   false   |
    |    true   |   20  |   false   |
    |   false   |   12  |   false   |
    |___________|_______|__________*/

    public static final boolean parrotTrouble(boolean talking, int hour)
    {
        return false;
    }

    public static final void main(String[] args) {
        _ParrotTrouble.Validate(true);  // pass 'false' to print failed tests only.
    }
}
