package Logic1;
import Logic1.Testcases._AlarmClock;

// https://codingbat.com/prob/p160543
// Difficulty: 118.0

public final class AlarmClock
{
    /* Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, 
    ...6=Sat, and a boolean indicating if we are on vacation, 
    return a string of the form "7:00" indicating when the alarm clock should ring. 
    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off". */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | day   | vacation  | expected |
    | (int) | (boolean) | (String) |
    |_______|___________|__________|
    | 1     | false     | "7:00"   |
    | 5     | false     | "7:00"   |
    | 0     | false     | "10:00"  |
    | 6     | false     | "10:00"  |
    | 0     | true      | "off"    |
    | 6     | true      | "off"    |
    | 1     | true      | "10:00"  |
    | 3     | true      | "10:00"  |
    | 5     | true      | "10:00"  |
    |_______|___________|_________*/

    public static final String alarmClock(int day, boolean vacation)
    {
        return "";
    }

    public static final void main(String[] args) {
        _AlarmClock.Validate(true);  // pass 'false' to print failed tests only.
    }
}
