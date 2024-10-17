package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p101887

/* Given three int values, a b c, return the largest. */

class TestCases_IntMax
{
    // intMax(1, 2, 3) → 3
    // intMax(1, 3, 2) → 3
    // intMax(3, 2, 1) → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "intMax(1, 2, 3)");
        testcaseMap.put(1, "intMax(1, 3, 2)");
        testcaseMap.put(2, "intMax(3, 2, 1)");
    }

    static int[] expectedResults = { 3, 3, 3, };
}

public class IntMax
{
    public static int intMax(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            intMax(1, 2, 3),
            intMax(1, 3, 2),
            intMax(3, 2, 1),
        };


        TestCases_IntMax.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_IntMax.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_IntMax.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_IntMax.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
