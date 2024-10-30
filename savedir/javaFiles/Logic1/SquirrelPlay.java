package Logic1;
import Logic1.Testcases._SquirrelPlay;

// https://codingbat.com/prob/p141061
// Difficulty: 109.0

public final class SquirrelPlay
{
    /* The squirrels in Palo Alto spend most of the day playing. 
    In particular, they play if the temperature is between 60 and 90 (inclusive). 
    Unless it is summer, then the upper limit is 100 instead of 90. 
    Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | temp  | isSummer  | expected  |
    | (int) | (boolean) | (boolean) |
    |_______|___________|___________|
    | 70    | false     | true      |
    | 95    | false     | false     |
    | 95    | true      | true      |
    | 90    | false     | true      |
    | 90    | true      | true      |
    | 50    | false     | false     |
    | 50    | true      | false     |
    | 100   | false     | false     |
    | 100   | true      | true      |
    | 105   | true      | false     |
    | 59    | false     | false     |
    | 59    | true      | false     |
    | 60    | false     | true      |
    |_______|___________|__________*/

    public static final boolean squirrelPlay(int temp, boolean isSummer)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SquirrelPlay.Validate(true);  // pass 'false' to print failed tests only.
    }
}
