package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183407

/* Given an array of strings, return a new List (e.g.
an ArrayList) where all the strings of the given length are omitted.
See wordsWithout() below which is more difficult because it uses arrays. */

class TestCases_WordsWithoutList
{
    // wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
    // wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
    // wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 1) → [\"bb\", \"ccc\"]");
        testcaseMap.put(1, "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 3) → [\"a\", \"bb\", \"b\"]");
        testcaseMap.put(2, "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 4) → [\"a\", \"bb\", \"b\", \"ccc\"]");
    }

    static List[] expectedResults = { {"bb", "ccc"}, {"a", "bb", "b"}, {"a", "bb", "b", "ccc"}, };
}

public class WordsWithoutList
{
    public static List wordsWithoutList(String[] words, int len)
    {
        
    }


    public static void main(String[] args)
    {
        String[] words0 = { "a", "bb", "b", "ccc" }; 
        String[] words1 = { "a", "bb", "b", "ccc" }; 
        String[] words2 = { "a", "bb", "b", "ccc" }; 

        List[] resultsArray = {
            wordsWithoutList(words0, 1),
            wordsWithoutList(words1, 3),
            wordsWithoutList(words2, 4),
        };


        TestCases_WordsWithoutList.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WordsWithoutList.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_WordsWithoutList.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_WordsWithoutList.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
