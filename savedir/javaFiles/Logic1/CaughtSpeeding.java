package Logic1;
import Logic1.Testcases._CaughtSpeeding;

// https://codingbat.com/prob/p157733
// Difficulty: 112.0

public final class CaughtSpeeding
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
    | speed | isBirthday | expected |
    | (int) | (boolean)  | (int)    |
    |_______|____________|__________|
    | 60    | false      | 0        |
    | 65    | false      | 1        |
    | 65    | true       | 0        |
    | 80    | false      | 1        |
    | 85    | false      | 2        |
    | 85    | true       | 1        |
    | 70    | false      | 1        |
    | 75    | false      | 1        |
    | 75    | true       | 1        |
    | 40    | false      | 0        |
    | 40    | true       | 0        |
    | 90    | false      | 2        |
    |_______|____________|_________*/

    public static final int caughtSpeeding(int speed, boolean isBirthday)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CaughtSpeeding.Validate(true);  // pass 'false' to print failed tests only.
    }
}
