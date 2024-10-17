// https://codingbat.com/prob/p180759
package String2;
import String2.Testcases._ZipZap;

public class ZipZap
{
    /* Look for patterns like "zip" and "zap" in the string -- length-3, 
    starting with 'z' and ending with 'p'. Return a string where for all such words, 
    the middle letter is gone, so "zipXzap" yields "zpXzp". */

    /*_______________________________
    |           Testcases           |
    _________________________________
    | zipZap("zipXzap")  → "zpXzp"  |
    | zipZap("zopzop")   → "zpzp"   |
    | zipZap("zzzopzop") → "zzzpzp" |
    _______________________________*/

    public static String zipZap(String str)
    {
        
    }

    public static void main(String[] args) {
        _ZipZap.Validate(true);  // pass 'false' to print failed tests only.
    }
}
