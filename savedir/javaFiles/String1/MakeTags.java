package String1;
import String1.Testcases._MakeTags;

// https://codingbat.com/prob/p147483
// Difficulty: 109.0

public final class MakeTags
{
    /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
    Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>". */

    /*_________________________________________________
    |                    Testcases                     |
    |__________________________________________________|
    |    tag    |   word   |      returns (String)     |
    |  (String) | (String) |                           |
    |___________|__________|___________________________|
    |    "i"    |  "Yay"   |        "<i>Yay</i>"       |
    |    "i"    | "Hello"  |       "<i>Hello</i>"      |
    |   "cite"  |  "Yay"   |     "<cite>Yay</cite>"    |
    | "address" |  "here"  | "<address>here</address>" |
    |   "body"  | "Heart"  |    "<body>Heart</body>"   |
    |    "i"    |   "i"    |         "<i>i</i>"        |
    |    "i"    |    ""    |         "<i></i>"         |
    |___________|__________|__________________________*/

    public static final String makeTags(String tag, String word)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_MakeTags.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MakeTags.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MakeTags.Validate();
    }
}
