package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p118230

/* Given a string, compute recursively a new string where all the 'x' chars have been removed. */

class TestCases_NoX
{
    // noX("xaxb") → "ab"
    // noX("abc") → "abc"
    // noX("xx") → ""

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "noX(\"xaxb\")");
        testcaseMap.put(1, "noX(\"abc\")");
        testcaseMap.put(2, "noX(\"xx\")");
    }

    static String[] expectedResults = { "ab", "abc", "", };
}

public class NoX
{
    public static String noX(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            noX("xaxb"),
            noX("abc"),
            noX("xx"),
        };


        TestCases_NoX.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NoX.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_NoX.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_NoX.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
