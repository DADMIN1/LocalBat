package Logic1;
import Logic1.Testcases._NearTen;

// https://codingbat.com/prob/p193613
// Difficulty: 124.0

public final class NearTen
{
    /* Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. 
    See also: Introduction to Mod */

    /*_____________________
    |      Testcases       |
    |______________________|
    | nearTen(12)  → true  |
    | nearTen(17)  → false |
    | nearTen(19)  → true  |
    | nearTen(31)  → true  |
    | nearTen(6)   → false |
    | nearTen(10)  → true  |
    | nearTen(11)  → true  |
    | nearTen(21)  → true  |
    | nearTen(22)  → true  |
    | nearTen(23)  → false |
    | nearTen(54)  → false |
    | nearTen(155) → false |
    | nearTen(158) → true  |
    | nearTen(3)   → false |
    | nearTen(1)   → true  |
    |_____________________*/

    public static final boolean nearTen(int num)
    {
        return false;
    }

    public static final void main(String[] args) {
        _NearTen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
