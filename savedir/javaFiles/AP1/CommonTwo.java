// https://codingbat.com/prob/p100369
package AP1;
import AP1.Testcases._CommonTwo;

public class CommonTwo
{
    /* Start with two arrays of strings, a and b, each in alphabetical order, 
    possibly with duplicates. Return the count of the number of strings which appear in both arrays. 
    The best "linear" solution makes a single pass over both arrays, 
    taking advantage of the fact that they are in alphabetical order. */

    /*___________________________________________________________
    |                         Testcases                         |
    _____________________________________________________________
    | commonTwo(["a", "c", "x"], ["b", "c", "d", "x"])      → 2 |
    | commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3 |
    | commonTwo(["a", "b", "c"], ["a", "b", "c"])           → 3 |
    ___________________________________________________________*/

    public static int commonTwo(String[] a, String[] b)
    {
        
    }

    public static void main(String[] args) {
        _CommonTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
