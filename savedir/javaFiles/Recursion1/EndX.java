package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p105722

/* Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string. */

class TestCases_EndX
{
    // endX("xxre") → "rexx"
    // endX("xxhixx") → "hixxxx"
    // endX("xhixhix") → "hihixxx"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "endX(\"xxre\") → \"rexx\"");
        testcaseMap.put(1, "endX(\"xxhixx\") → \"hixxxx\"");
        testcaseMap.put(2, "endX(\"xhixhix\") → \"hihixxx\"");
    }

    static String[] expectedResults = { "rexx", "hixxxx", "hihixxx", };
}

public class EndX
{
    public static String endX(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            endX("xxre"),
            endX("xxhixx"),
            endX("xhixhix"),
        };


        TestCases_EndX.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_EndX.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_EndX.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_EndX.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
