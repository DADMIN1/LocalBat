package String3;
import String3.Testcases._SumNumbers;

// https://codingbat.com/prob/p121193
// Difficulty: 330.0

public final class SumNumbers
{
    /* Given a string, return the sum of the numbers appearing in the string, 
    ignoring all other characters. A number is a series of 1 or more digit chars in a row. 
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', 
    '1', .. '9'. Integer.parseInt(string) converts a string to an int.) */

    /*______________________
    |       Testcases       |
    |_______________________|
    |     str     | returns |
    |   (String)  |  (int)  |
    |_____________|_________|
    | "abc123xyz" |   123   |
    |  "aa11b33"  |    44   |
    |    "7 11"   |    18   |
    | "Chocolate" |    0    |
    | "5hoco1a1e" |    7    |
    | "5$$1;;1!!" |    7    |
    | "a1234bb11" |   1245  |
    |      ""     |    0    |
    |  "a22bbb3"  |    25   |
    |_____________|________*/

    public static final int sumNumbers(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_SumNumbers.printSuccesses = false;  // set 'false' to print failing tests only.
        //_SumNumbers.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _SumNumbers.Validate();
    }
}
