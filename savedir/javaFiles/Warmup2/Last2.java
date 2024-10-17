package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p178318

/* Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, 
so "hixxxhi" yields 1 (we won't count the end substring). */

class TestCases_Last2
{
    // last2("hixxhi") → 1
    // last2("xaxxaxaxx") → 1
    // last2("axxxaaxx") → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "last2(\"hixxhi\")");
        testcaseMap.put(1, "last2(\"xaxxaxaxx\")");
        testcaseMap.put(2, "last2(\"axxxaaxx\")");
    }

    static int[] expectedResults = { 1, 1, 2, };
}

public class Last2
{
    public static int last2(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            last2("hixxhi"),
            last2("xaxxaxaxx"),
            last2("axxxaaxx"),
        };


        TestCases_Last2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Last2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Last2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Last2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
