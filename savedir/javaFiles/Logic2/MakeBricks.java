package Logic2;
import Logic2.Testcases._MakeBricks;

// https://codingbat.com/prob/p183562
// Difficulty: 203.0

public final class MakeBricks
{
    /* We want to make a row of bricks that is goal inches long. 
    We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
    Return true if it is possible to make the goal by choosing from the given bricks. 
    This is a little harder than it looks and can be done without any loops. 
    See also: Introduction to MakeBricks */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    |  small  |   big   |   goal  |  returns  |
    |  (int)  |  (int)  |  (int)  | (boolean) |
    |_________|_________|_________|___________|
    |    3    |    1    |    8    |    true   |
    |    3    |    1    |    9    |   false   |
    |    3    |    2    |    10   |    true   |
    |    3    |    2    |    8    |    true   |
    |    3    |    2    |    9    |   false   |
    |    6    |    1    |    11   |    true   |
    |    6    |    0    |    11   |   false   |
    |    1    |    4    |    11   |    true   |
    |    0    |    3    |    10   |    true   |
    |    1    |    4    |    12   |   false   |
    |    3    |    1    |    7    |    true   |
    |    1    |    1    |    7    |   false   |
    |    2    |    1    |    7    |    true   |
    |    7    |    1    |    11   |    true   |
    |    7    |    1    |    8    |    true   |
    |    7    |    1    |    13   |   false   |
    |    43   |    1    |    46   |    true   |
    |    40   |    1    |    46   |   false   |
    |    40   |    2    |    47   |    true   |
    |    40   |    2    |    50   |    true   |
    |    40   |    2    |    52   |   false   |
    |    22   |    2    |    33   |   false   |
    |    0    |    2    |    10   |    true   |
    | 1000000 |   1000  | 1000100 |    true   |
    |    2    | 1000000 |  100003 |   false   |
    |    20   |    0    |    19   |    true   |
    |    20   |    0    |    21   |   false   |
    |    20   |    4    |    51   |   false   |
    |    20   |    4    |    39   |    true   |
    |_________|_________|_________|__________*/

    public static final boolean makeBricks(int small, int big, int goal)
    {
        return false;
    }

    public static final void main(String[] args) {
        _MakeBricks.Validate(true);  // pass 'false' to print failed tests only.
    }
}
