// https://codingbat.com/prob/p122943
package String2;
import String2.Testcases._OneTwo;

public class OneTwo
{
    /* Given a string, compute a new string by moving the first char to come after the next two chars, 
    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, 
    so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end. */

    // oneTwo("abc") → "bca"
    // oneTwo("tca") → "cat"
    // oneTwo("tcagdo") → "catdog"

    public static String oneTwo(String str)
    {
        
    }

    public static void main(String[] args) {
        _OneTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
