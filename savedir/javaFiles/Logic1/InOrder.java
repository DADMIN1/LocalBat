package Logic1;
import Logic1.Testcases._InOrder;

// https://codingbat.com/prob/p154188
// Difficulty: 139.0

public final class InOrder
{
    /* Given three ints, a b c, return true if b is greater than a, 
    and c is greater than b. However, with the exception that if "bOk" is true, 
    b does not need to be greater than a. */

    /*____________________________________________________
    |                      Testcases                      |
    |_____________________________________________________|
    | a (int) | b (int) | c (int) |    bOk    |  returns  |
    |         |         |         | (boolean) | (boolean) |
    |_________|_________|_________|___________|___________|
    |    1    |    2    |    4    |   false   |    true   |
    |    1    |    2    |    1    |   false   |   false   |
    |    1    |    1    |    2    |    true   |    true   |
    |    3    |    2    |    4    |   false   |   false   |
    |    2    |    3    |    4    |   false   |    true   |
    |    3    |    2    |    4    |    true   |    true   |
    |    4    |    2    |    2    |    true   |   false   |
    |    4    |    5    |    2    |    true   |   false   |
    |    2    |    4    |    6    |    true   |    true   |
    |    7    |    9    |    10   |   false   |    true   |
    |    7    |    5    |    6    |    true   |    true   |
    |    7    |    5    |    4    |    true   |   false   |
    |_________|_________|_________|___________|__________*/

    public static final boolean inOrder(int a, int b, int c, boolean bOk)
    {
        return false;
    }

    public static final void main(String[] args) {
        _InOrder.Validate(true);  // pass 'false' to print failed tests only.
    }
}
