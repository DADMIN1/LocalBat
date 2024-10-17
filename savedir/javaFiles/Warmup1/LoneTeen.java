package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p165701

/* We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, 
but not both. */

class TestCases_LoneTeen
{
    // loneTeen(13, 99) → true
    // loneTeen(21, 19) → true
    // loneTeen(13, 13) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "loneTeen(13, 99)");
        testcaseMap.put(1, "loneTeen(21, 19)");
        testcaseMap.put(2, "loneTeen(13, 13)");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class LoneTeen
{
    public static boolean loneTeen(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            loneTeen(13, 99),
            loneTeen(21, 19),
            loneTeen(13, 13),
        };


        TestCases_LoneTeen.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LoneTeen.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LoneTeen.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LoneTeen.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
