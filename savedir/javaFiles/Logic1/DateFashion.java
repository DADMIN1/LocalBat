package Logic1;
import Logic1.Testcases._DateFashion;

// https://codingbat.com/prob/p103360
// Difficulty: 106.0

public final class DateFashion
{
    /* You and your date are trying to get a table at a restaurant. 
    The parameter "you" is the stylishness of your clothes, 
    in the range 0..10, and "date" is the stylishness of your date's clothes. 
    The result getting the table is encoded as an int value with 0=no, 
    1=maybe, 2=yes. If either of you is very stylish, 8 or more, 
    then the result is 2 (yes). With the exception that if either of you has style of 2 or less, 
    then the result is 0 (no). Otherwise the result is 1 (maybe). */

    /*________________________
    |        Testcases        |
    |_________________________|
    |  you  |  date | returns |
    | (int) | (int) |  (int)  |
    |_______|_______|_________|
    |   5   |   10  |    2    |
    |   5   |   2   |    0    |
    |   5   |   5   |    1    |
    |   3   |   3   |    1    |
    |   10  |   2   |    0    |
    |   2   |   9   |    0    |
    |   9   |   9   |    2    |
    |   10  |   5   |    2    |
    |   2   |   2   |    0    |
    |   3   |   7   |    1    |
    |   2   |   7   |    0    |
    |   6   |   2   |    0    |
    |_______|_______|________*/

    public static final int dateFashion(int you, int date)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _DateFashion.Validate(true);  // pass 'false' to print failed tests only.
    }
}
