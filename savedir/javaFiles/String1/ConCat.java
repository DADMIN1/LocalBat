package String1;
import String1.Testcases._ConCat;

// https://codingbat.com/prob/p132118
// Difficulty: 169.0

public final class ConCat
{
    /* Given two strings, append them together (known as "concatenation") and return the result. 
    However, if the concatenation creates a double-char, then omit one of the chars, 
    so "abc" and "cat" yields "abcat". */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | a        | b        | expected   |
    | (String) | (String) | (String)   |
    |__________|__________|____________|
    | "abc"    | "cat"    | "abcat"    |
    | "dog"    | "cat"    | "dogcat"   |
    | "abc"    | ""       | "abc"      |
    | ""       | "cat"    | "cat"      |
    | "pig"    | "g"      | "pig"      |
    | "pig"    | "doggy"  | "pigdoggy" |
    |__________|__________|___________*/

    public static final String conCat(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ConCat.Validate(true);  // pass 'false' to print failed tests only.
    }
}
