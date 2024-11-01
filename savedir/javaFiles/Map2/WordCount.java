package Map2;
import Map2.Testcases._WordCount;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p117630
// Difficulty: 350

public final class WordCount
{
    /* The classic word-count algorithm: given an array of strings, 
    return a Map<String, Integer> with a key for each different string, 
    with the value the number of times that string appears in the array. */

    /*_______________________________________________________________________________________________________________________________________________________________________________________________
    |                                                                                           Testcases                                                                                            |
    |________________________________________________________________________________________________________________________________________________________________________________________________|
    | strings (String[])                                                                                              | expected (Map<String, Integer>)                                              |
    |_________________________________________________________________________________________________________________|______________________________________________________________________________|
    | {"a", "b", "a", "c", "b"}                                                                                       | {"a": 2, "b": 2, "c": 1}                                                     |
    | {"c", "b", "a"}                                                                                                 | {"a": 1, "b": 1, "c": 1}                                                     |
    | {"c", "c", "c", "c"}                                                                                            | {"c": 4}                                                                     |
    | {}                                                                                                              | {}                                                                           |
    | {"this", "and", "this", ""}                                                                                     | {"": 1, "and": 1, "this": 2}                                                 |
    | {"x", "y", "x", "Y", "X"}                                                                                       | {"x": 2, "X": 1, "y": 1, "Y": 1}                                             |
    | {"123", "0", "123", "1"}                                                                                        | {"0": 1, "1": 1, "123": 2}                                                   |
    | {"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"} | {"a": 4, "b": 5, "d": 3, "e": 1, "f": 1, "one": 1, "x": 2, "z": 2, "two": 2} |
    | {"apple", "banana", "apple", "apple", "tea", "coffee", "banana"}                                                | {"banana": 2, "apple": 3, "tea": 1, "coffee": 1}                             |
    |_________________________________________________________________________________________________________________|_____________________________________________________________________________*/

    public static final Map<String, Integer> wordCount(String[] strings)
    {
        return new HashMap<String, Integer>();
    }

    public static final void main(String[] args) {
        _WordCount.Validate(true);  // pass 'false' to print failed tests only.
    }
}
