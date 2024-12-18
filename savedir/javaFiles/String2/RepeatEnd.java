package String2;
import String2.Testcases._RepeatEnd;

// https://codingbat.com/prob/p152339
// Difficulty: 230.0

public final class RepeatEnd
{
    /* Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
    You may assume that n is between 0 and the length of the string, 
    inclusive. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    |   str    | n (int) |   returns   |
    | (String) |         |   (String)  |
    |__________|_________|_____________|
    | "Hello"  |    3    | "llollollo" |
    | "Hello"  |    2    |    "lolo"   |
    | "Hello"  |    1    |     "o"     |
    | "Hello"  |    0    |      ""     |
    |  "abc"   |    3    | "abcabcabc" |
    |  "1234"  |    2    |    "3434"   |
    |  "1234"  |    3    | "234234234" |
    |    ""    |    0    |      ""     |
    |__________|_________|____________*/

    public static final String repeatEnd(String str, int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_RepeatEnd.printSuccesses = false;  // set 'false' to print failing tests only.
        //_RepeatEnd.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _RepeatEnd.Validate();
    }
}
