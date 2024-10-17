// https://codingbat.com/prob/p147538
package String2;
import String2.Testcases._WordEnds;

public class WordEnds
{
    /* Given a string and a non-empty word string, 
    return a string made of each char just before and just after every appearance of the word in the string. 
    Ignore cases where there is no char before or after the word, 
    and a char may be included twice if it is between two words. */

    /*__________________________________________
    |                Testcases                 |
    ____________________________________________
    | wordEnds("abcXY123XYijk", "XY") → "c13i" |
    | wordEnds("XY123XY", "XY")       → "13"   |
    | wordEnds("XY1XY", "XY")         → "11"   |
    __________________________________________*/

    public static String wordEnds(String str, String word)
    {
        
    }

    public static void main(String[] args) {
        _WordEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
