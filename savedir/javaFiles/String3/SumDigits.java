// https://codingbat.com/prob/p197890
package String3;
import String3.Testcases._SumDigits;

public class SumDigits
{
    /* Given a string, return the sum of the digits 0-9 that appear in the string, 
    ignoring all other characters. Return 0 if there are no digits in the string. 
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', 
    '1', .. '9'. Integer.parseInt(string) converts a string to an int.) */

    /*____________________________
    |         Testcases          |
    ______________________________
    | sumDigits("aa1bc2d3")  → 6 |
    | sumDigits("aa11b33")   → 8 |
    | sumDigits("Chocolate") → 0 |
    ____________________________*/

    public static int sumDigits(String str)
    {
        
    }

    public static void main(String[] args) {
        _SumDigits.Validate(true);  // pass 'false' to print failed tests only.
    }
}
