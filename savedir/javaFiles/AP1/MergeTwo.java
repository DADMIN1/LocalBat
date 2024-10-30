package AP1;
import AP1.Testcases._MergeTwo;

// https://codingbat.com/prob/p139150
// Difficulty: 251.0

public final class MergeTwo
{
    /* Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. 
    Return a new array containing the first N elements from the two arrays. 
    The result array should be in alphabetical order and without duplicates. 
    A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, 
    taking advantage of the fact that they are in alphabetical order, 
    copying elements directly to the new array. */

    /*__________________________________________________________________________
    |                                 Testcases                                 |
    |___________________________________________________________________________|
    | a (String[])           | b (String[])           | n     | expected        |
    |                        |                        | (int) | (String[])      |
    |________________________|________________________|_______|_________________|
    | { "a", "c", "z" }      | { "b", "f", "z" }      | 3     | {"a", "b", "c"} |
    | { "a", "c", "z" }      | { "c", "f", "z" }      | 3     | {"a", "c", "f"} |
    | { "f", "g", "z" }      | { "c", "f", "g" }      | 3     | {"c", "f", "g"} |
    | { "a", "c", "z" }      | { "a", "c", "z" }      | 3     | {"a", "c", "z"} |
    | { "a", "b", "c", "z" } | { "a", "c", "z" }      | 3     | {"a", "b", "c"} |
    | { "a", "c", "z" }      | { "a", "b", "c", "z" } | 3     | {"a", "b", "c"} |
    | { "a", "c", "z" }      | { "a", "c", "z" }      | 2     | {"a", "c"}      |
    | { "a", "c", "z" }      | { "a", "c", "y", "z" } | 3     | {"a", "c", "y"} |
    | { "x", "y", "z" }      | { "a", "b", "z" }      | 3     | {"a", "b", "x"} |
    |________________________|________________________|_______|________________*/

    public static final String[] mergeTwo(String[] a, String[] b, int n)
    {
        return new String[]{""};
    }

    public static final void main(String[] args) {
        _MergeTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
