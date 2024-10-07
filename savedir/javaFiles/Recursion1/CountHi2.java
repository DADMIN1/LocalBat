package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p143900

/* Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them. */

class TestCases_CountHi2
{
    // countHi2("ahixhi") → 1
    // countHi2("ahibhi") → 2
    // countHi2("xhixhi") → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countHi2(\"ahixhi\") → 1");
        testcaseMap.put(1, "countHi2(\"ahibhi\") → 2");
        testcaseMap.put(2, "countHi2(\"xhixhi\") → 0");
    }

    static int[] expectedResults = { 1, 2, 0, };
}

public class CountHi2
{
    public static int countHi2(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countHi2("ahixhi"),
            countHi2("ahibhi"),
            countHi2("xhixhi"),
        };


        TestCases_CountHi2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountHi2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountHi2.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountHi2.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
