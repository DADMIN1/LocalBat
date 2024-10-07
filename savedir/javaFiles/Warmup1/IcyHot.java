package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p192082

/* Given two temperatures, return true if one is less than 0 and the other is greater than 100. */

class TestCases_IcyHot
{
    // icyHot(120, -1) → true
    // icyHot(-1, 120) → true
    // icyHot(2, 120) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "icyHot(120, -1) → true");
        testcaseMap.put(1, "icyHot(-1, 120) → true");
        testcaseMap.put(2, "icyHot(2, 120) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class IcyHot
{
    public static boolean icyHot(int temp1, int temp2)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            icyHot(120, -1),
            icyHot(-1, 120),
            icyHot(2, 120),
        };


        TestCases_IcyHot.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_IcyHot.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_IcyHot.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_IcyHot.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
