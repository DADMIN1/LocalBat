package Logic2;
import Logic2.Testcases._EvenlySpaced;

// https://codingbat.com/prob/p198700
// Difficulty: 221.0

public final class EvenlySpaced
{
    /* Given three ints, a b c, one of them is small, one is medium and one is large. 
    Return true if the three values are evenly spaced, 
    so the difference between small and medium is the same as the difference between medium and large. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | a (int) | b (int) | c (int) |  returns  |
    |         |         |         | (boolean) |
    |_________|_________|_________|___________|
    |    2    |    4    |    6    |    true   |
    |    4    |    6    |    2    |    true   |
    |    4    |    6    |    3    |   false   |
    |    6    |    2    |    4    |    true   |
    |    6    |    2    |    8    |   false   |
    |    2    |    2    |    2    |    true   |
    |    2    |    2    |    3    |   false   |
    |    9    |    10   |    11   |    true   |
    |    10   |    9    |    11   |    true   |
    |    10   |    9    |    9    |   false   |
    |    2    |    4    |    4    |   false   |
    |    2    |    2    |    4    |   false   |
    |    3    |    6    |    12   |   false   |
    |    12   |    3    |    6    |   false   |
    |_________|_________|_________|__________*/

    public static final boolean evenlySpaced(int a, int b, int c)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_EvenlySpaced.printSuccesses = false;  // set 'false' to print failing tests only.
        //_EvenlySpaced.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _EvenlySpaced.Validate();
    }
}
