package Map2;
import Map2.Testcases._WordMultiple;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p190862
// Difficulty: 360

public final class WordMultiple
{
    /* Given an array of strings, return a Map<String, 
    Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array. */

    /*______________________________________________________________________________________________________________________________________________
    |                                                                   Testcases                                                                   |
    |_______________________________________________________________________________________________________________________________________________|
    |                           strings (String[])                           |                    returns (Map<String, Boolean>)                    |
    |________________________________________________________________________|______________________________________________________________________|
    | {"a", "b", "a", "c", "b"}                                              | {"a": true, "b": true, "c": false}                                   |
    | {"c", "b", "a"}                                                        | {"a": false, "b": false, "c": false}                                 |
    | {"c", "c", "c", "c"}                                                   | {"c": true}                                                          |
    | {}                                                                     | {}                                                                   |
    | {"this", "and", "this"}                                                | {"and": false, "this": true}                                         |
    | {"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"} | {"a": true, "b": true, "d": true, "e": false, "x": false, "z": true} |
    |________________________________________________________________________|_____________________________________________________________________*/

    public static final Map<String, Boolean> wordMultiple(String[] strings)
    {
        return new HashMap<String, Boolean>();
    }

    public static final void main(String[] args) {
        //_WordMultiple.printSuccesses = false;  // set 'false' to print failing tests only.
        //_WordMultiple.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _WordMultiple.Validate();
    }
}
