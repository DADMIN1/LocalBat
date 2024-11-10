package String3;
import String3.Testcases._NotReplace;

// https://codingbat.com/prob/p154137
// Difficulty: 333.0

public final class NotReplace
{
    /* Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". 
    The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. 
    (Note: Character.isLetter(char) tests if a char is a letter.) */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    |    str (String)   |      returns (String)     |
    |___________________|___________________________|
    |     "is test"     |       "is not test"       |
    |      "is-is"      |      "is not-is not"      |
    |  "This is right"  |    "This is not right"    |
    | "This is isabell" |   "This is not isabell"   |
    |         ""        |             ""            |
    |        "is"       |          "is not"         |
    |       "isis"      |           "isis"          |
    | "Dis is bliss is" | "Dis is not bliss is not" |
    |      "is his"     |        "is not his"       |
    |     "xis yis"     |         "xis yis"         |
    |     "AAAis is"    |       "AAAis is not"      |
    |___________________|__________________________*/

    public static final String notReplace(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_NotReplace.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NotReplace.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NotReplace.Validate();
    }
}
