package String1;
import String1.Testcases._StartWord;

// https://codingbat.com/prob/p141494
// Difficulty: 193.0

public final class StartWord
{
    /* Given a string and a second "word" string, 
    we'll say that the word matches the string if it appears at the front of the string, 
    except its first char does not need to match exactly. On a match, 
    return the front of the string, or otherwise return the empty string. 
    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
    The word will be at least length 1. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    |   str    |   word   | returns  |
    | (String) | (String) | (String) |
    |__________|__________|__________|
    | "hippo"  |   "hi"   |   "hi"   |
    | "hippo"  |  "xip"   |  "hip"   |
    | "hippo"  |   "i"    |   "h"    |
    | "hippo"  |   "ix"   |    ""    |
    |   "h"    |   "ix"   |    ""    |
    |    ""    |   "i"    |    ""    |
    |  "hip"   |   "zi"   |   "hi"   |
    |  "hip"   |  "zip"   |  "hip"   |
    |  "hip"   |  "zig"   |    ""    |
    |   "h"    |   "z"    |   "h"    |
    | "hippo"  | "xippo"  | "hippo"  |
    | "hippo"  |  "xyz"   |    ""    |
    | "hippo"  |  "hip"   |  "hip"   |
    | "kitten" |  "cit"   |  "kit"   |
    |  "kit"   |  "cit"   |  "kit"   |
    |__________|__________|_________*/

    public static final String startWord(String str, String word)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_StartWord.printSuccesses = false;  // set 'false' to print failing tests only.
        //_StartWord.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _StartWord.Validate();
    }
}
