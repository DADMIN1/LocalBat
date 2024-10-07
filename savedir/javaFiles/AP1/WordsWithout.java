package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p121236

/* Given an array of strings, return a new array without the strings that are equal to the target string.
One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings. */

class TestCases_WordsWithout
{
    // wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
    // wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
    // wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\") → [\"b\", \"c\"]");
        testcaseMap.put(1, "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\") → [\"a\", \"c\", \"a\"]");
        testcaseMap.put(2, "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\") → [\"a\", \"b\", \"a\"]");
    }

    static String[][] expectedResults = { {"b", "c"}, {"a", "c", "a"}, {"a", "b", "a"}, };
}

public class WordsWithout
{
    public static String[] wordsWithout(String[] words, String target)
    {
        
    }


    public static String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void main(String[] args)
    {
        String[] words0 = { "a", "b", "c", "a" }; 
        String[] words1 = { "a", "b", "c", "a" }; 
        String[] words2 = { "a", "b", "c", "a" }; 

        String[][] resultsArray = {
            wordsWithout(words0, "a"),
            wordsWithout(words1, "b"),
            wordsWithout(words2, "c"),
        };


        TestCases_WordsWithout.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WordsWithout.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_WordsWithout.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_WordsWithout.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
