package Logic1;
import Logic1.Testcases._NearTen;

// https://codingbat.com/prob/p193613
// Difficulty: 124.0

public final class NearTen
{
    /* Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. 
    See also: Introduction to Mod */

    /*__________________
    |     Testcases     |
    |___________________|
    |  num  |  returns  |
    | (int) | (boolean) |
    |_______|___________|
    |   12  |    true   |
    |   17  |   false   |
    |   19  |    true   |
    |   31  |    true   |
    |   6   |   false   |
    |   10  |    true   |
    |   11  |    true   |
    |   21  |    true   |
    |   22  |    true   |
    |   23  |   false   |
    |   54  |   false   |
    |  155  |   false   |
    |  158  |    true   |
    |   3   |   false   |
    |   1   |    true   |
    |_______|__________*/

    public static final boolean nearTen(int num)
    {
        return false;
    }

    public static final void main(String[] args) {
        _NearTen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
