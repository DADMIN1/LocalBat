package Logic1;
import Logic1.Testcases._SquirrelPlay;

// https://codingbat.com/prob/p141061
// Difficulty: 109.0

public class SquirrelPlay
{
    /* The squirrels in Palo Alto spend most of the day playing. 
    In particular, they play if the temperature is between 60 and 90 (inclusive). 
    Unless it is summer, then the upper limit is 100 instead of 90. 
    Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | squirrelPlay(70, false)  → true  |
    | squirrelPlay(95, false)  → false |
    | squirrelPlay(95, true)   → true  |
    | squirrelPlay(90, false)  → true  |
    | squirrelPlay(90, true)   → true  |
    | squirrelPlay(50, false)  → false |
    | squirrelPlay(50, true)   → false |
    | squirrelPlay(100, false) → false |
    | squirrelPlay(100, true)  → true  |
    | squirrelPlay(105, true)  → false |
    | squirrelPlay(59, false)  → false |
    | squirrelPlay(59, true)   → false |
    | squirrelPlay(60, false)  → true  |
    |_________________________________*/

    public static boolean squirrelPlay(int temp, boolean isSummer)
    {
        return false;
    }

    public static void main(String[] args) {
        _SquirrelPlay.Validate(true);  // pass 'false' to print failed tests only.
    }
}
