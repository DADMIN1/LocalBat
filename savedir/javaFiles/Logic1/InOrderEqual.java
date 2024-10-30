package Logic1;
import Logic1.Testcases._InOrderEqual;

// https://codingbat.com/prob/p140272
// Difficulty: 142.0

public final class InOrderEqual
{
    /* Given three ints, a b c, return true if they are in strict increasing order, 
    such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, 
    with the exception that if "equalOk" is true, equality is allowed, 
    such as 5 5 7 or 5 5 5. */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    | a     | b     | c     | equalOk   | expected  |
    | (int) | (int) | (int) | (boolean) | (boolean) |
    |_______|_______|_______|___________|___________|
    | 2     | 5     | 11    | false     | true      |
    | 5     | 7     | 6     | false     | false     |
    | 5     | 5     | 7     | true      | true      |
    | 5     | 5     | 7     | false     | false     |
    | 2     | 5     | 4     | false     | false     |
    | 3     | 4     | 3     | false     | false     |
    | 3     | 4     | 4     | false     | false     |
    | 3     | 4     | 3     | true      | false     |
    | 3     | 4     | 4     | true      | true      |
    | 1     | 5     | 5     | true      | true      |
    | 5     | 5     | 5     | true      | true      |
    | 2     | 2     | 1     | true      | false     |
    | 9     | 2     | 2     | true      | false     |
    | 0     | 1     | 0     | true      | false     |
    |_______|_______|_______|___________|__________*/

    public static final boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        return false;
    }

    public static final void main(String[] args) {
        _InOrderEqual.Validate(true);  // pass 'false' to print failed tests only.
    }
}
