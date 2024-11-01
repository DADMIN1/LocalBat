package Warmup1;
import Warmup1.Testcases._HasTeen;

// https://codingbat.com/prob/p178986
// Difficulty: 154.0

public final class HasTeen
{
    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 3 int values, return true if 1 or more of them are teen. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | a (int) | b (int) | c (int) |  returns  |
    |         |         |         | (boolean) |
    |_________|_________|_________|___________|
    |    13   |    20   |    10   |    true   |
    |    20   |    19   |    10   |    true   |
    |    20   |    10   |    13   |    true   |
    |    1    |    20   |    12   |   false   |
    |    19   |    20   |    12   |    true   |
    |    12   |    20   |    19   |    true   |
    |    12   |    9    |    20   |   false   |
    |    12   |    18   |    20   |    true   |
    |    14   |    2    |    20   |    true   |
    |    4    |    2    |    20   |   false   |
    |    11   |    22   |    22   |   false   |
    |_________|_________|_________|__________*/

    public static final boolean hasTeen(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        _HasTeen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
