package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p177372

/* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
or return 0 if neither is in that range. */

class TestCases_Max1020
{
    // max1020(11, 19) → 19
    // max1020(19, 11) → 19
    // max1020(11, 9) → 11

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "max1020(11, 19)");
        testcaseMap.put(1, "max1020(19, 11)");
        testcaseMap.put(2, "max1020(11, 9)");
    }

    static int[] expectedResults = { 19, 19, 11, };
}

public class Max1020
{
    public static int max1020(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            max1020(11, 19),
            max1020(19, 11),
            max1020(11, 9),
        };


        TestCases_Max1020.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Max1020.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Max1020.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Max1020.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
