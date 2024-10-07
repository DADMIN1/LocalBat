package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p186177

/* Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping. */

class TestCases_StrCount
{
    // strCount("catcowcat", "cat") → 2
    // strCount("catcowcat", "cow") → 1
    // strCount("catcowcat", "dog") → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "strCount(\"catcowcat\", \"cat\") → 2");
        testcaseMap.put(1, "strCount(\"catcowcat\", \"cow\") → 1");
        testcaseMap.put(2, "strCount(\"catcowcat\", \"dog\") → 0");
    }

    static int[] expectedResults = { 2, 1, 0, };
}

public class StrCount
{
    public static int strCount(String str, String sub)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            strCount("catcowcat", "cat"),
            strCount("catcowcat", "cow"),
            strCount("catcowcat", "dog"),
        };


        TestCases_StrCount.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StrCount.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StrCount.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StrCount.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
