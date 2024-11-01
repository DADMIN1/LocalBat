package String1;
import String1.Testcases._LastChars;

// https://codingbat.com/prob/p138183
// Difficulty: 166.0

public final class LastChars
{
    /* Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, 
    so "yo" and "java" yields "ya". If either string is length 0, 
    use '@' for its missing char. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | a (String) | b (String) | returns  |
    |            |            | (String) |
    |____________|____________|__________|
    |   "last"   |  "chars"   |   "ls"   |
    |    "yo"    |   "java"   |   "ya"   |
    |    "hi"    |     ""     |   "h@"   |
    |     ""     |  "hello"   |   "@o"   |
    |     ""     |     ""     |   "@@"   |
    |  "kitten"  |    "hi"    |   "ki"   |
    |    "k"     |   "zip"    |   "kp"   |
    |  "kitten"  |     ""     |   "k@"   |
    |  "kitten"  |   "zip"    |   "kp"   |
    |____________|____________|_________*/

    public static final String lastChars(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        _LastChars.Validate(true);  // pass 'false' to print failed tests only.
    }
}
