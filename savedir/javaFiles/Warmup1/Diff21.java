package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p116624

/* Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. */

class TestCases_Diff21
{
    // diff21(19) → 2
    // diff21(10) → 11
    // diff21(21) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "diff21(19) → 2");
        testcaseMap.put(1, "diff21(10) → 11");
        testcaseMap.put(2, "diff21(21) → 0");
    }

    static int[] expectedResults = { 2, 11, 0, };
}

public class Diff21
{
    public static int diff21(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            diff21(19),
            diff21(10),
            diff21(21),
        };


        TestCases_Diff21.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Diff21.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Diff21.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Diff21.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
