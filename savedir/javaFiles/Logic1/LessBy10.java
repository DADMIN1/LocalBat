package Logic1;
import Logic1.Testcases._LessBy10;

// https://codingbat.com/prob/p179196
// Difficulty: 148.0

public final class LessBy10
{
    /* Given three ints, a b c, return true if one of them is 10 or more less than one of the others. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | a (int) | b (int) | c (int) |  returns  |
    |         |         |         | (boolean) |
    |_________|_________|_________|___________|
    |    1    |    7    |    11   |    true   |
    |    1    |    7    |    10   |   false   |
    |    11   |    1    |    7    |    true   |
    |    10   |    7    |    1    |   false   |
    |   -10   |    2    |    2    |    true   |
    |    2    |    11   |    11   |   false   |
    |    3    |    3    |    30   |    true   |
    |    3    |    3    |    3    |   false   |
    |    10   |    1    |    11   |    true   |
    |    10   |    11   |    1    |    true   |
    |    10   |    11   |    2    |   false   |
    |    3    |    30   |    3    |    true   |
    |    2    |    2    |    -8   |    true   |
    |    2    |    8    |    12   |    true   |
    |_________|_________|_________|__________*/

    public static final boolean lessBy10(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        _LessBy10.Validate(true);  // pass 'false' to print failed tests only.
    }
}
