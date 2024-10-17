package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p172021

/* Given 2 int values, return whichever value is nearest to the value 10, 
or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. */

class TestCases_Close10
{
    // close10(8, 13) → 8
    // close10(13, 8) → 8
    // close10(13, 7) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "close10(8, 13)");
        testcaseMap.put(1, "close10(13, 8)");
        testcaseMap.put(2, "close10(13, 7)");
    }

    static int[] expectedResults = { 8, 8, 0, };
}

public class Close10
{
    public static int close10(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            close10(8, 13),
            close10(13, 8),
            close10(13, 7),
        };


        TestCases_Close10.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Close10.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Close10.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Close10.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
