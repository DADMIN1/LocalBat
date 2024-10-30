package String3;
import String3.Testcases._SumDigits;

// https://codingbat.com/prob/p197890
// Difficulty: 318.0

public final class SumDigits
{
    /* Given a string, return the sum of the digits 0-9 that appear in the string, 
    ignoring all other characters. Return 0 if there are no digits in the string. 
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', 
    '1', .. '9'. Integer.parseInt(string) converts a string to an int.) */

    /*_______________________
    |       Testcases        |
    |________________________|
    | str         | expected |
    | (String)    | (int)    |
    |_____________|__________|
    | "aa1bc2d3"  | 6        |
    | "aa11b33"   | 8        |
    | "Chocolate" | 0        |
    | "5hoco1a1e" | 7        |
    | "123abc123" | 12       |
    | ""          | 0        |
    | "Hello"     | 0        |
    | "X1z9b2"    | 12       |
    | "5432a"     | 14       |
    |_____________|_________*/

    public static final int sumDigits(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _SumDigits.Validate(true);  // pass 'false' to print failed tests only.
    }
}
