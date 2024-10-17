package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p151713

/* Return true if the given string begins with "mix", except the 'm' can be anything, 
so "pix", "9ix" .. all count. */

class TestCases_MixStart
{
    // mixStart("mix snacks") → true
    // mixStart("pix snacks") → true
    // mixStart("piz snacks") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "mixStart(\"mix snacks\")");
        testcaseMap.put(1, "mixStart(\"pix snacks\")");
        testcaseMap.put(2, "mixStart(\"piz snacks\")");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class MixStart
{
    public static boolean mixStart(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            mixStart("mix snacks"),
            mixStart("pix snacks"),
            mixStart("piz snacks"),
        };


        TestCases_MixStart.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MixStart.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MixStart.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_MixStart.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
