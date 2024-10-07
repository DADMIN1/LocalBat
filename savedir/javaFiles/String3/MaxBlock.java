package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p179479

/* Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same. */

class TestCases_MaxBlock
{
    // maxBlock("hoopla") → 2
    // maxBlock("abbCCCddBBBxx") → 3
    // maxBlock("") → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "maxBlock(\"hoopla\") → 2");
        testcaseMap.put(1, "maxBlock(\"abbCCCddBBBxx\") → 3");
        testcaseMap.put(2, "maxBlock(\"\") → 0");
    }

    static int[] expectedResults = { 2, 3, 0, };
}

public class MaxBlock
{
    public static int maxBlock(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            maxBlock("hoopla"),
            maxBlock("abbCCCddBBBxx"),
            maxBlock(""),
        };


        TestCases_MaxBlock.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MaxBlock.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MaxBlock.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MaxBlock.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
