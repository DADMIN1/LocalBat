package AP1;
import AP1.Testcases._DividesSelf;

// https://codingbat.com/prob/p165941
// Difficulty: 227.0

public final class DividesSelf
{
    /* We'll say that a positive int divides itself if every digit in the number divides into the number evenly. 
    So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
    We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. 
    Note: use % to get the rightmost digit, and / to discard the rightmost digit. */

    /*____________________
    |      Testcases      |
    |_____________________|
    | n (int) |  returns  |
    |         | (boolean) |
    |_________|___________|
    |   128   |    true   |
    |    12   |    true   |
    |   120   |   false   |
    |   122   |    true   |
    |    13   |   false   |
    |    32   |   false   |
    |    22   |    true   |
    |    42   |   false   |
    |   212   |    true   |
    |   213   |   false   |
    |   162   |    true   |
    |_________|__________*/

    public static final boolean dividesSelf(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_DividesSelf.printSuccesses = false;  // set 'false' to print failing tests only.
        //_DividesSelf.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _DividesSelf.Validate();
    }
}
