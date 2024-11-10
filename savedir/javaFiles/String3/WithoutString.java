package String3;
import String3.Testcases._WithoutString;

// https://codingbat.com/prob/p192570
// Difficulty: 306.0

public final class WithoutString
{
    /* Given two strings, base and remove, 
    return a version of the base string where all instances of the remove string have been removed (not case sensitive). 
    You may assume that the remove string is length 1 or more. 
    Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x". */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    |  base (String)   |  remove  |    returns    |
    |                  | (String) |    (String)   |
    |__________________|__________|_______________|
    |  "Hello there"   |  "llo"   |   "He there"  |
    |  "Hello there"   |   "e"    |   "Hllo thr"  |
    |  "Hello there"   |   "x"    | "Hello there" |
    | "This is a FISH" |   "IS"   |   "Th a FH"   |
    | "THIS is a FISH" |   "is"   |   "TH a FH"   |
    | "THIS is a FISH" |   "iS"   |   "TH a FH"   |
    |    "abxxxxab"    |   "xx"   |     "abab"    |
    |    "abxxxab"     |   "xx"   |    "abxab"    |
    |    "abxxxab"     |   "x"    |     "abab"    |
    |      "xxx"       |   "x"    |       ""      |
    |      "xxx"       |   "xx"   |      "x"      |
    |     "xyzzy"      |   "Y"    |     "xzz"     |
    |        ""        |   "x"    |       ""      |
    |     "abcabc"     |   "b"    |     "acac"    |
    |     "AA22bb"     |   "2"    |     "AAbb"    |
    |      "1111"      |   "1"    |       ""      |
    |      "1111"      |   "11"   |       ""      |
    |    "MkjtMkx"     |   "Mk"   |     "jtx"     |
    |    "Hi HoHo"     |   "Ho"   |     "Hi "     |
    |__________________|__________|______________*/

    public static final String withoutString(String base, String remove)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_WithoutString.printSuccesses = false;  // set 'false' to print failing tests only.
        //_WithoutString.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _WithoutString.Validate();
    }
}
