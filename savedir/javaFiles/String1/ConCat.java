// https://codingbat.com/prob/p132118
package String1;
import String1.Testcases._ConCat;

public class ConCat
{
    /* Given two strings, append them together (known as "concatenation") and return the result. 
    However, if the concatenation creates a double-char, then omit one of the chars, 
    so "abc" and "cat" yields "abcat". */

    /*_________________________________
    |            Testcases            |
    |_________________________________|
    | conCat("abc", "cat") → "abcat"  |
    | conCat("dog", "cat") → "dogcat" |
    | conCat("abc", "")    → "abc"    |
    |________________________________*/

    public static String conCat(String a, String b)
    {
        
    }

    public static void main(String[] args) {
        _ConCat.Validate(true);  // pass 'false' to print failed tests only.
    }
}
