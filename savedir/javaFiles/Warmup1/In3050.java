package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p132134

/* Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive. */

class TestCases_In3050
{
    // in3050(30, 31) → true
    // in3050(30, 41) → false
    // in3050(40, 50) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "in3050(30, 31) → true");
        testcaseMap.put(1, "in3050(30, 41) → false");
        testcaseMap.put(2, "in3050(40, 50) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class In3050
{
    public static boolean in3050(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            in3050(30, 31),
            in3050(30, 41),
            in3050(40, 50),
        };


        TestCases_In3050.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_In3050.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_In3050.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_In3050.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
