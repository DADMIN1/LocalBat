package String1;
import String1.Testcases._WithoutEnd;

// https://codingbat.com/prob/p130896
// Difficulty: 124.0

public final class WithoutEnd
{
    /* Given a string, return a version without the first and last char, 
    so "Hello" yields "ell". The string length will be at least 2. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    | str (String) |  returns   |
    |              |  (String)  |
    |______________|____________|
    |   "Hello"    |   "ell"    |
    |    "java"    |    "av"    |
    |   "coding"   |   "odin"   |
    |    "code"    |    "od"    |
    |     "ab"     |     ""     |
    | "Chocolate!" | "hocolate" |
    |   "kitten"   |   "itte"   |
    |   "woohoo"   |   "ooho"   |
    |______________|___________*/

    public static final String withoutEnd(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_WithoutEnd.printSuccesses = false;  // set 'false' to print failing tests only.
        //_WithoutEnd.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _WithoutEnd.Validate();
    }
}
