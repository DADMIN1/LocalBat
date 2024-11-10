package Logic1;
import Logic1.Testcases._MaxMod5;

// https://codingbat.com/prob/p115384
// Difficulty: 154.0

public final class MaxMod5
{
    /* Given two int values, return whichever value is larger. 
    However if the two values have the same remainder when divided by 5, 
    then the return the smaller value. However, in all cases, 
    if the two values are the same, return 0. Note: 
    the % "mod" operator computes the remainder, e.g. 7 % 5 is 2. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | a (int) | b (int) | returns |
    |         |         |  (int)  |
    |_________|_________|_________|
    |    2    |    3    |    3    |
    |    6    |    2    |    6    |
    |    3    |    2    |    3    |
    |    8    |    12   |    12   |
    |    7    |    12   |    7    |
    |    11   |    6    |    6    |
    |    2    |    7    |    2    |
    |    7    |    7    |    0    |
    |    9    |    1    |    9    |
    |    9    |    14   |    9    |
    |    1    |    2    |    2    |
    |_________|_________|________*/

    public static final int maxMod5(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_MaxMod5.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MaxMod5.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MaxMod5.Validate();
    }
}
