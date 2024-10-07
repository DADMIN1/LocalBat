package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p186759

/* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". */

class TestCases_DoubleX
{
    // doubleX("axxbb") → true
    // doubleX("axaxax") → false
    // doubleX("xxxxx") → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "doubleX(\"axxbb\") → true");
        testcaseMap.put(1, "doubleX(\"axaxax\") → false");
        testcaseMap.put(2, "doubleX(\"xxxxx\") → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class DoubleX
{
    boolean doubleX(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            doubleX("axxbb"),
            doubleX("axaxax"),
            doubleX("xxxxx"),
        };


        TestCases_DoubleX.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_DoubleX.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_DoubleX.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_DoubleX.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
