// https://codingbat.com/prob/p192570
package String3;
import String3.Testcases._WithoutString;

public class WithoutString
{
    /* Given two strings, base and remove, 
    return a version of the base string where all instances of the remove string have been removed (not case sensitive). 
    You may assume that the remove string is length 1 or more. 
    Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x". */

    /*_____________________________________________________
    |                      Testcases                      |
    |_____________________________________________________|
    | withoutString("Hello there", "llo") → "He there"    |
    | withoutString("Hello there", "e")   → "Hllo thr"    |
    | withoutString("Hello there", "x")   → "Hello there" |
    |____________________________________________________*/

    public static String withoutString(String base, String remove)
    {
        
    }

    public static void main(String[] args) {
        _WithoutString.Validate(true);  // pass 'false' to print failed tests only.
    }
}
