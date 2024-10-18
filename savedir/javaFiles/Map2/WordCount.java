// https://codingbat.com/prob/p117630
package Map2;
import Map2.Testcases._WordCount;

public class WordCount
{
    /* The classic word-count algorithm: given an array of strings, 
    return a Map<String, Integer> with a key for each different string, 
    with the value the number of times that string appears in the array. */

    /*_________________________________________________________________
    |                            Testcases                            |
    |_________________________________________________________________|
    | wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1} |
    | wordCount(["c", "b", "a"])           → {"a": 1, "b": 1, "c": 1} |
    | wordCount(["c", "c", "c", "c"])      → {"c": 4}                 |
    |________________________________________________________________*/

    public static Map<String, Integer> wordCount(String[] strings)
    {
        
    }

    public static void main(String[] args) {
        _WordCount.Validate(true);  // pass 'false' to print failed tests only.
    }
}
