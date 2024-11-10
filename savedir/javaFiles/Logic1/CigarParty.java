package Logic1;
import Logic1.Testcases._CigarParty;

// https://codingbat.com/prob/p159531
// Difficulty: 103.0

public final class CigarParty
{
    /* When squirrels get together for a party, they like to have cigars. 
    A squirrel party is successful when the number of cigars is between 40 and 60, 
    inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
    Return true if the party with the given values is successful, 
    or false otherwise. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | cigars | isWeekend |  returns  |
    | (int)  | (boolean) | (boolean) |
    |________|___________|___________|
    |   30   |   false   |   false   |
    |   50   |   false   |    true   |
    |   70   |    true   |    true   |
    |   30   |    true   |   false   |
    |   50   |    true   |    true   |
    |   60   |   false   |    true   |
    |   61   |   false   |   false   |
    |   40   |   false   |    true   |
    |   39   |   false   |   false   |
    |   40   |    true   |    true   |
    |   39   |    true   |   false   |
    |________|___________|__________*/

    public static final boolean cigarParty(int cigars, boolean isWeekend)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_CigarParty.printSuccesses = false;  // set 'false' to print failing tests only.
        //_CigarParty.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _CigarParty.Validate();
    }
}
