package AP1;
import AP1.Testcases._CommonTwo;

// https://codingbat.com/prob/p100369
// Difficulty: 254.0

public final class CommonTwo
{
    /* Start with two arrays of strings, a and b, each in alphabetical order, 
    possibly with duplicates. Return the count of the number of strings which appear in both arrays. 
    The best "linear" solution makes a single pass over both arrays, 
    taking advantage of the fact that they are in alphabetical order. */

    /*______________________________________________________________________
    |                               Testcases                               |
    |_______________________________________________________________________|
    | a (String[])              | b (String[])                   | expected |
    |                           |                                | (int)    |
    |___________________________|________________________________|__________|
    | {"a", "c", "x"}           | {"b", "c", "d", "x"}           | 2        |
    | {"a", "c", "x"}           | {"a", "b", "c", "x", "z"}      | 3        |
    | {"a", "b", "c"}           | {"a", "b", "c"}                | 3        |
    | {"a", "a", "b", "b", "c"} | {"a", "b", "c"}                | 3        |
    | {"a", "a", "b", "b", "c"} | {"a", "b", "b", "b", "c"}      | 3        |
    | {"a", "a", "b", "b", "c"} | {"a", "b", "b", "c", "c"}      | 3        |
    | {"b", "b", "b", "b", "c"} | {"a", "b", "b", "b", "c"}      | 2        |
    | {"a", "b", "c", "c", "d"} | {"a", "b", "b", "c", "d", "d"} | 4        |
    | {"a", "a", "b", "b", "c"} | {"b", "b", "b"}                | 1        |
    | {"a", "a", "b", "b", "c"} | {"c", "c"}                     | 1        |
    | {"a", "a", "b", "b", "c"} | {"b", "b", "b", "x"}           | 1        |
    | {"a", "a", "b", "b", "c"} | {"b", "b"}                     | 1        |
    | {"a"}                     | {"a", "b"}                     | 1        |
    | {"a"}                     | {"b"}                          | 0        |
    | {"a", "a"}                | {"b", "b"}                     | 0        |
    | {"a", "b"}                | {"a", "b"}                     | 2        |
    |___________________________|________________________________|_________*/

    public static final int commonTwo(String[] a, String[] b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CommonTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
