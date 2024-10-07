package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p144535

/* Given 2 int values, return true if either of them is in the range 10..20 inclusive. */

class TestCases_In1020
{
    // in1020(12, 99) → true
    // in1020(21, 12) → true
    // in1020(8, 99) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "in1020(12, 99) → true");
        testcaseMap.put(1, "in1020(21, 12) → true");
        testcaseMap.put(2, "in1020(8, 99) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class In1020
{
    public static boolean in1020(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            in1020(12, 99),
            in1020(21, 12),
            in1020(8, 99),
        };


        TestCases_In1020.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_In1020.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_In1020.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_In1020.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
