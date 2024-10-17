// https://codingbat.com/prob/p154137
package String3;
import String3.Testcases._NotReplace;

public class NotReplace
{
    /* Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". 
    The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. 
    (Note: Character.isLetter(char) tests if a char is a letter.) */

    /*___________________________________________________
    |                     Testcases                     |
    _____________________________________________________
    | notReplace("is test")       → "is not test"       |
    | notReplace("is-is")         → "is not-is not"     |
    | notReplace("This is right") → "This is not right" |
    ___________________________________________________*/

    public static String notReplace(String str)
    {
        
    }

    public static void main(String[] args) {
        _NotReplace.Validate(true);  // pass 'false' to print failed tests only.
    }
}
