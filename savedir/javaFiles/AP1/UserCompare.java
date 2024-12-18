package AP1;
import AP1.Testcases._UserCompare;

// https://codingbat.com/prob/p143482
// Difficulty: 248.0

public final class UserCompare
{
    /* We have data for two users, A and B, each with a String name and an int id. 
    The goal is to order the users such as for sorting. Return -1 if A comes before B, 
    1 if A comes after B, and 0 if they are the same. Order first by the string names, 
    and then by the id numbers if the names are the same. Note: 
    with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1). 
    (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. 
    The code logic is the same.) */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    |  aName   |  aId  |  bName   |  bId  | returns |
    | (String) | (int) | (String) | (int) |  (int)  |
    |__________|_______|__________|_______|_________|
    |   "bb"   |   1   |   "zz"   |   2   |    -1   |
    |   "bb"   |   1   |   "aa"   |   2   |    1    |
    |   "bb"   |   1   |   "bb"   |   1   |    0    |
    |   "bb"   |   5   |   "bb"   |   1   |    1    |
    |   "bb"   |   5   |   "bb"   |   10  |    -1   |
    |  "adam"  |   1   |  "bob"   |   2   |    -1   |
    |  "bob"   |   1   |  "bob"   |   2   |    -1   |
    |  "bzb"   |   1   |  "bob"   |   2   |    1    |
    |__________|_______|__________|_______|________*/

    public static final int userCompare(String aName, int aId, String bName, int bId)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_UserCompare.printSuccesses = false;  // set 'false' to print failing tests only.
        //_UserCompare.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _UserCompare.Validate();
    }
}
