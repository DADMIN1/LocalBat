package AP1;
import AP1.Testcases._WordsFront;

// https://codingbat.com/prob/p183837
// Difficulty: 218.0

public final class WordsFront
{
    /* Given an array of strings, return a new array containing the first N strings. 
    N will be in the range 1..length. */

    /*______________________________________________________
    |                       Testcases                       |
    |_______________________________________________________|
    | words (String[])       | n     | expected (String[])  |
    |                        | (int) |                      |
    |________________________|_______|______________________|
    | { "a", "b", "c", "d" } | 1     | {"a"}                |
    | { "a", "b", "c", "d" } | 2     | {"a", "b"}           |
    | { "a", "b", "c", "d" } | 3     | {"a", "b", "c"}      |
    | { "a", "b", "c", "d" } | 4     | {"a", "b", "c", "d"} |
    | { "Hi", "There" }      | 1     | {"Hi"}               |
    | { "Hi", "There" }      | 2     | {"Hi", "There"}      |
    |________________________|_______|_____________________*/

    public static final String[] wordsFront(String[] words, int n)
    {
        return new String[]{""};
    }

    public static final void main(String[] args) {
        _WordsFront.Validate(true);  // pass 'false' to print failed tests only.
    }
}
