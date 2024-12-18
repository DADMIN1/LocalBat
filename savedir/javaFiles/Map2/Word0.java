package Map2;
import Map2.Testcases._Word0;
import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p152303
// Difficulty: 303

public final class Word0
{
    /* Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, 
    always with the value 0. For example the string "hello" makes the pair "hello":0. 
    We'll do more complicated counting later, but for this problem the value is simply 0. */

    /*_____________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    |     strings (String[])    |         returns          |
    |                           |  (Map<String, Integer>)  |
    |___________________________|__________________________|
    | {"a", "b", "a", "b"}      | {"a": 0, "b": 0}         |
    | {"a", "b", "a", "c", "b"} | {"a": 0, "b": 0, "c": 0} |
    | {"c", "b", "a"}           | {"a": 0, "b": 0, "c": 0} |
    | {"c", "c", "c", "c"}      | {"c": 0}                 |
    | {}                        | {}                       |
    |___________________________|_________________________*/

    public static final Map<String, Integer> word0(String[] strings)
    {
        return new HashMap<String, Integer>();
    }

    public static final void main(String[] args) {
        //_Word0.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Word0.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Word0.Validate();
    }
}
