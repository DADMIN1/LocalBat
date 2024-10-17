package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183837

/* Given an array of strings, return a new array containing the first N strings. 
N will be in the range 1..length. */

class TestCases_WordsFront
{
    // wordsFront(["a", "b", "c", "d"], 1) → ["a"]
    // wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
    // wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "wordsFront([\"a\", \"b\", \"c\", \"d\"], 1)");
        testcaseMap.put(1, "wordsFront([\"a\", \"b\", \"c\", \"d\"], 2)");
        testcaseMap.put(2, "wordsFront([\"a\", \"b\", \"c\", \"d\"], 3)");
    }

    static String[][] expectedResults = { {"a"}, {"a", "b"}, {"a", "b", "c"}, };
}

public class WordsFront
{
    public static String[] wordsFront(String[] words, int n)
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
        String[] words0 = { "a", "b", "c", "d" }; 
        String[] words1 = { "a", "b", "c", "d" }; 
        String[] words2 = { "a", "b", "c", "d" }; 

        String[][] resultsArray = {
            wordsFront(words0, 1),
            wordsFront(words1, 2),
            wordsFront(words2, 3),
        };


        TestCases_WordsFront.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_WordsFront.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_WordsFront.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_WordsFront.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
