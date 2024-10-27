package String1;
import String1.Testcases._MakeTags;

// https://codingbat.com/prob/p147483
// Difficulty: 109.0

public final class MakeTags
{
    /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
    Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>". */

    /*________________________________________________________
    |                        Testcases                        |
    |_________________________________________________________|
    | makeTags("i", "Yay")        → "<i>Yay</i>"              |
    | makeTags("i", "Hello")      → "<i>Hello</i>"            |
    | makeTags("cite", "Yay")     → "<cite>Yay</cite>"        |
    | makeTags("address", "here") → "<address>here</address>" |
    | makeTags("body", "Heart")   → "<body>Heart</body>"      |
    | makeTags("i", "i")          → "<i>i</i>"                |
    | makeTags("i", "")           → "<i></i>"                 |
    |________________________________________________________*/

    public static final String makeTags(String tag, String word)
    {
        return "";
    }

    public static final void main(String[] args) {
        _MakeTags.Validate(true);  // pass 'false' to print failed tests only.
    }
}
