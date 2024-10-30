package String2;
import String2.Testcases._PlusOut;

// https://codingbat.com/prob/p170829
// Difficulty: 257.0

public final class PlusOut
{
    /* Given a string and a non-empty word string, 
    return a version of the original String where all chars have been replaced by pluses ("+"), 
    except for appearances of the word string which are preserved unchanged. */

    /*_____________________________________________
    |                  Testcases                   |
    |______________________________________________|
    | str (String)    | word     | expected        |
    |                 | (String) | (String)        |
    |_________________|__________|_________________|
    | "12xy34"        | "xy"     | "++xy++"        |
    | "12xy34"        | "1"      | "1+++++"        |
    | "12xy34xyabcxy" | "xy"     | "++xy++xy+++xy" |
    | "abXYabcXYZ"    | "ab"     | "ab++ab++++"    |
    | "abXYabcXYZ"    | "abc"    | "++++abc+++"    |
    | "abXYabcXYZ"    | "XY"     | "++XY+++XY+"    |
    | "abXYxyzXYZ"    | "XYZ"    | "+++++++XYZ"    |
    | "--++ab"        | "++"     | "++++++"        |
    | "aaxxxxbb"      | "xx"     | "++xxxx++"      |
    | "123123"        | "3"      | "++3++3"        |
    |_________________|__________|________________*/

    public static final String plusOut(String str, String word)
    {
        return "";
    }

    public static final void main(String[] args) {
        _PlusOut.Validate(true);  // pass 'false' to print failed tests only.
    }
}
