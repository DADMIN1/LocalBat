package AP1;
import AP1.Testcases._UserCompare;

// https://codingbat.com/prob/p143482
// Difficulty: 248.0

public class UserCompare
{
    /* We have data for two users, A and B, each with a String name and an int id. 
    The goal is to order the users such as for sorting. Return -1 if A comes before B, 
    1 if A comes after B, and 0 if they are the same. Order first by the string names, 
    and then by the id numbers if the names are the same. Note: 
    with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1). 
    (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. 
    The code logic is the same.) */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | userCompare("bb", 1, "zz", 2)    → -1 |
    | userCompare("bb", 1, "aa", 2)    → 1  |
    | userCompare("bb", 1, "bb", 1)    → 0  |
    | userCompare("bb", 5, "bb", 1)    → 1  |
    | userCompare("bb", 5, "bb", 10)   → -1 |
    | userCompare("adam", 1, "bob", 2) → -1 |
    | userCompare("bob", 1, "bob", 2)  → -1 |
    | userCompare("bzb", 1, "bob", 2)  → 1  |
    |______________________________________*/

    public static int userCompare(String aName, int aId, String bName, int bId)
    {
        return 0;
    }

    public static void main(String[] args) {
        _UserCompare.Validate(true);  // pass 'false' to print failed tests only.
    }
}
