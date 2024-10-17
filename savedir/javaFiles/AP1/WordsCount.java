package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p124620

/* Given an array of strings, return the count of the number of strings with the given length. */

class TestCases_WordsCount
{
    // wordsCount(["a", "bb", "b", "ccc"], 1) → 2
    // wordsCount(["a", "bb", "b", "ccc"], 3) → 1
    // wordsCount(["a", "bb", "b", "ccc"], 4) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 1)");
        testcaseMap.put(1, "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 3)");
        testcaseMap.put(2, "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 4)");
    }

    static int[] expectedResults = { 2, 1, 0, };
}

public class WordsCount
{
    public static int wordsCount(String[] words, int len)
    {
        
    }


    public static void main(String[] args)
    {
        String[] words0 = { "a", "bb", "b", "ccc" }; 
        String[] words1 = { "a", "bb", "b", "ccc" }; 
        String[] words2 = { "a", "bb", "b", "ccc" }; 

        int[] resultsArray = {
            wordsCount(words0, 1),
            wordsCount(words1, 3),
            wordsCount(words2, 4),
        };


        TestCases_WordsCount.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WordsCount.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_WordsCount.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_WordsCount.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
