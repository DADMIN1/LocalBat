package Logic1;
import Logic1.Testcases._CigarParty;

// https://codingbat.com/prob/p159531
// Difficulty: 103.0

public class CigarParty
{
    /* When squirrels get together for a party, they like to have cigars. 
    A squirrel party is successful when the number of cigars is between 40 and 60, 
    inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
    Return true if the party with the given values is successful, 
    or false otherwise. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | cigarParty(30, false) → false |
    | cigarParty(50, false) → true  |
    | cigarParty(70, true)  → true  |
    | cigarParty(30, true)  → false |
    | cigarParty(50, true)  → true  |
    | cigarParty(60, false) → true  |
    | cigarParty(61, false) → false |
    | cigarParty(40, false) → true  |
    | cigarParty(39, false) → false |
    | cigarParty(40, true)  → true  |
    | cigarParty(39, true)  → false |
    |______________________________*/

    public static boolean cigarParty(int cigars, boolean isWeekend)
    {
        return false;
    }

    public static void main(String[] args) {
        _CigarParty.Validate(true);  // pass 'false' to print failed tests only.
    }
}
