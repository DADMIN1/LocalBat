package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p154485

/* Given two int values, return their sum. Unless the two values are the same, 
then return double their sum. */

class TestCases_SumDouble
{
    // sumDouble(1, 2) → 3
    // sumDouble(3, 2) → 5
    // sumDouble(2, 2) → 8

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sumDouble(1, 2)");
        testcaseMap.put(1, "sumDouble(3, 2)");
        testcaseMap.put(2, "sumDouble(2, 2)");
    }

    static int[] expectedResults = { 3, 5, 8, };
}

public class SumDouble
{
    public static int sumDouble(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            sumDouble(1, 2),
            sumDouble(3, 2),
            sumDouble(2, 2),
        };


        TestCases_SumDouble.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SumDouble.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SumDouble.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_SumDouble.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
