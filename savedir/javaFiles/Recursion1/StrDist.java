package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p195413

/* Given a string and a non-empty substring sub, 
compute recursively the largest substring which starts and ends with sub and return its length. */

class TestCases_StrDist
{
    // strDist("catcowcat", "cat") → 9
    // strDist("catcowcat", "cow") → 3
    // strDist("cccatcowcatxx", "cat") → 9

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "strDist(\"catcowcat\", \"cat\")");
        testcaseMap.put(1, "strDist(\"catcowcat\", \"cow\")");
        testcaseMap.put(2, "strDist(\"cccatcowcatxx\", \"cat\")");
    }

    static int[] expectedResults = { 9, 3, 9, };
}

public class StrDist
{
    public static int strDist(String str, String sub)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            strDist("catcowcat", "cat"),
            strDist("catcowcat", "cow"),
            strDist("cccatcowcatxx", "cat"),
        };


        TestCases_StrDist.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StrDist.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_StrDist.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_StrDist.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
