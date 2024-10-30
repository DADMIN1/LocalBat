package Logic1;
import Logic1.Testcases._SpecialEleven;

// https://codingbat.com/prob/p100962
// Difficulty: 122.3

public final class SpecialEleven
{
    /* We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
    Return true if the given non-negative number is special. 
    Use the % "mod" operator -- see Introduction to Mod */

    /*__________________
    |     Testcases     |
    |___________________|
    | n     | expected  |
    | (int) | (boolean) |
    |_______|___________|
    | 22    | true      |
    | 23    | true      |
    | 24    | false     |
    | 21    | false     |
    | 11    | true      |
    | 12    | true      |
    | 10    | false     |
    | 9     | false     |
    | 8     | false     |
    | 0     | true      |
    | 1     | true      |
    | 2     | false     |
    | 121   | true      |
    | 122   | true      |
    | 123   | false     |
    | 46    | false     |
    | 49    | false     |
    | 52    | false     |
    | 54    | false     |
    | 55    | true      |
    |_______|__________*/

    public static final boolean specialEleven(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SpecialEleven.Validate(true);  // pass 'false' to print failed tests only.
    }
}
