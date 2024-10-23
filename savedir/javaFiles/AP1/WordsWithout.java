// https://codingbat.com/prob/p121236
package AP1;
import AP1.Testcases._WordsWithout;

public class WordsWithout
{
    /* Given an array of strings, return a new array without the strings that are equal to the target string. 
    One approach is to count the occurrences of the target string, 
    make a new array of the correct length, and then copy over the correct strings. */

    /*__________________________________________________________
    |                         Testcases                         |
    |___________________________________________________________|
    | wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]      |
    | wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"] |
    | wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"] |
    |__________________________________________________________*/

    public static String[] wordsWithout(String[] words, String target)
    {
        
    }

    public static void main(String[] args) {
        _WordsWithout.Validate(true);  // pass 'false' to print failed tests only.
    }
}
