package AP1;
import AP1.Testcases._MatchUp;

// https://codingbat.com/prob/p139677
// Difficulty: 236.0

public final class MatchUp
{
    /* Given 2 arrays that are the same length containing strings, 
    compare the 1st string in one array to the 1st string in the other array, 
    the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. 
    The strings may be any length, including 0. */

    /*___________________________________________________________
    |                         Testcases                          |
    |____________________________________________________________|
    |     a (String[])     |        b (String[])       | returns |
    |                      |                           |  (int)  |
    |______________________|___________________________|_________|
    | {"aa", "bb", "cc"}   | {"aaa", "xx", "bb"}       |    1    |
    | {"aa", "bb", "cc"}   | {"aaa", "b", "bb"}        |    2    |
    | {"aa", "bb", "cc"}   | {"", "", "ccc"}           |    1    |
    | {"", "", "ccc"}      | {"aa", "bb", "cc"}        |    1    |
    | {"", "", ""}         | {"", "bb", "cc"}          |    0    |
    | {"aa", "bb", "cc"}   | {"", "", ""}              |    0    |
    | {"aa", "", "ccc"}    | {"", "bb", "cc"}          |    1    |
    | {"x", "y", "z"}      | {"y", "z", "x"}           |    0    |
    | {"", "y", "z"}       | {"", "y", "x"}            |    1    |
    | {"x", "y", "z"}      | {"xx", "yyy", "zzz"}      |    3    |
    | {"x", "y", "z"}      | {"xx", "yyy", ""}         |    2    |
    | {"b", "x", "y", "z"} | {"a", "xx", "yyy", "zzz"} |    3    |
    | {"aaa", "bb", "c"}   | {"aaa", "xx", "bb"}       |    1    |
    |______________________|___________________________|________*/

    public static final int matchUp(String[] a, String[] b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _MatchUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
