package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p170371

/* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string. */

class TestCases_CountX
{
    // countX("xxhixx") → 4
    // countX("xhixhix") → 3
    // countX("hi") → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countX(\"xxhixx\") → 4");
        testcaseMap.put(1, "countX(\"xhixhix\") → 3");
        testcaseMap.put(2, "countX(\"hi\") → 0");
    }

    static int[] expectedResults = { 4, 3, 0, };
}

public class CountX
{
    public static int countX(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countX("xxhixx"),
            countX("xhixhix"),
            countX("hi"),
        };


        TestCases_CountX.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountX.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountX.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountX.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
