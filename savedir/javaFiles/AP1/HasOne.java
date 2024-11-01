package AP1;
import AP1.Testcases._HasOne;

// https://codingbat.com/prob/p191212
// Difficulty: 224.0

public final class HasOne
{
    /* Given a positive int n, return true if it contains a 1 digit. 
    Note: use % to get the rightmost digit, and / to discard the rightmost digit. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | n (int) |  returns  |
    |         | (boolean) |
    |_________|___________|
    |    10   |    true   |
    |    22   |   false   |
    |   220   |   false   |
    |   212   |    true   |
    |    1    |    true   |
    |    9    |   false   |
    |  211112 |    true   |
    |  121121 |    true   |
    |  222222 |   false   |
    |  56156  |    true   |
    |  56556  |   false   |
    |_________|__________*/

    public static final boolean hasOne(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _HasOne.Validate(true);  // pass 'false' to print failed tests only.
    }
}
