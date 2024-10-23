// https://codingbat.com/prob/p139150
package AP1;
import AP1.Testcases._MergeTwo;

public class MergeTwo
{
    /* Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. 
    Return a new array containing the first N elements from the two arrays. 
    The result array should be in alphabetical order and without duplicates. 
    A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, 
    taking advantage of the fact that they are in alphabetical order, 
    copying elements directly to the new array. */

    /*________________________________________________________________
    |                            Testcases                            |
    |_________________________________________________________________|
    | mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"] |
    | mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"] |
    | mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"] |
    |________________________________________________________________*/

    public static String[] mergeTwo(String[] a, String[] b, int n)
    {
        
    }

    public static void main(String[] args) {
        _MergeTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
