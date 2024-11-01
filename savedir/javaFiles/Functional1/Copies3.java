package Functional1;
import Functional1.Testcases._Copies3;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p181634
// Difficulty: 209

public final class Copies3
{
    /* Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together. */

    /*____________________________________________________________________________________________
    |                                          Testcases                                          |
    |_____________________________________________________________________________________________|
    |     strings (List<String>)     |                   returns (List<String>)                   |
    |________________________________|____________________________________________________________|
    | ["a", "bb", "ccc"]             | ["aaa", "bbbbbb", "ccccccccc"]                             |
    | ["24", "a", ""]                | ["242424", "aaa", ""]                                      |
    | ["hello", "there"]             | ["hellohellohello", "theretherethere"]                     |
    | ["no"]                         | ["nonono"]                                                 |
    | []                             | []                                                         |
    | ["this", "and", "that", "and"] | ["thisthisthis", "andandand", "thatthatthat", "andandand"] |
    |________________________________|___________________________________________________________*/

    public static final List<String> copies3(List<String> strings)
    {
        return new ArrayList<String>();
    }

    public static final void main(String[] args) {
        _Copies3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
