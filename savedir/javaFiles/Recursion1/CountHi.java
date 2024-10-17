package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p184029

/* Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string. */

class TestCases_CountHi
{
    // countHi("xxhixx") → 1
    // countHi("xhixhix") → 2
    // countHi("hi") → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countHi(\"xxhixx\")");
        testcaseMap.put(1, "countHi(\"xhixhix\")");
        testcaseMap.put(2, "countHi(\"hi\")");
    }

    static int[] expectedResults = { 1, 2, 1, };
}

public class CountHi
{
    public static int countHi(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countHi("xxhixx"),
            countHi("xhixhix"),
            countHi("hi"),
        };


        TestCases_CountHi.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountHi.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CountHi.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CountHi.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
