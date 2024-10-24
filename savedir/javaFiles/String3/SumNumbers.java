package String3;
import String3.Testcases._SumNumbers;

// https://codingbat.com/prob/p121193
// Difficulty: 330.0

public class SumNumbers
{
    /* Given a string, return the sum of the numbers appearing in the string, 
    ignoring all other characters. A number is a series of 1 or more digit chars in a row. 
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', 
    '1', .. '9'. Integer.parseInt(string) converts a string to an int.) */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | sumNumbers("abc123xyz") → 123  |
    | sumNumbers("aa11b33")   → 44   |
    | sumNumbers("7 11")      → 18   |
    | sumNumbers("Chocolate") → 0    |
    | sumNumbers("5hoco1a1e") → 7    |
    | sumNumbers("5$$1;;1!!") → 7    |
    | sumNumbers("a1234bb11") → 1245 |
    | sumNumbers("")          → 0    |
    | sumNumbers("a22bbb3")   → 25   |
    |_______________________________*/

    public static int sumNumbers(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _SumNumbers.Validate(true);  // pass 'false' to print failed tests only.
    }
}
