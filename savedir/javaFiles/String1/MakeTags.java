// https://codingbat.com/prob/p147483
package String1;
import String1.Testcases._MakeTags;

public class MakeTags
{
    /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
    Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>". */

    /*_____________________________________________
    |                  Testcases                   |
    |______________________________________________|
    | makeTags("i", "Yay")    → "<i>Yay</i>"       |
    | makeTags("i", "Hello")  → "<i>Hello</i>"     |
    | makeTags("cite", "Yay") → "<cite>Yay</cite>" |
    |_____________________________________________*/

    public static String makeTags(String tag, String word)
    {
        
    }

    public static void main(String[] args) {
        _MakeTags.Validate(true);  // pass 'false' to print failed tests only.
    }
}
