package Logic1;
import Logic1.Testcases._Love6;

// https://codingbat.com/prob/p137742
// Difficulty: 120

public final class Love6
{
    /* The number 6 is a truly great number. Given two int values, 
    a and b, return true if either one is 6. Or if their sum or difference is 6. 
    Note: the function Math.abs(num) computes the absolute value of a number. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | a (int) | b (int) |  returns  |
    |         |         | (boolean) |
    |_________|_________|___________|
    |    6    |    4    |    true   |
    |    4    |    5    |   false   |
    |    1    |    5    |    true   |
    |    1    |    6    |    true   |
    |    1    |    8    |   false   |
    |    1    |    7    |    true   |
    |    7    |    5    |   false   |
    |    8    |    2    |    true   |
    |    6    |    6    |    true   |
    |    -6   |    2    |   false   |
    |    -4   |   -10   |    true   |
    |    -7   |    1    |   false   |
    |    7    |    -1   |    true   |
    |    -6   |    12   |    true   |
    |    -2   |    -4   |   false   |
    |    7    |    1    |    true   |
    |    0    |    9    |   false   |
    |    8    |    3    |   false   |
    |    3    |    3    |    true   |
    |    3    |    4    |   false   |
    |_________|_________|__________*/

    public static final boolean love6(int a, int b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _Love6.Validate(true);  // pass 'false' to print failed tests only.
    }
}
