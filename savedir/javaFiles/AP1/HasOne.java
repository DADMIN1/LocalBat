package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p191212

/* Given a positive int n, return true if it contains a 1 digit. 
Note: use % to get the rightmost digit, and / to discard the rightmost digit. */

class TestCases_HasOne
{
    // hasOne(10) → true
    // hasOne(22) → false
    // hasOne(220) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "hasOne(10)");
        testcaseMap.put(1, "hasOne(22)");
        testcaseMap.put(2, "hasOne(220)");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class HasOne
{
    public static boolean hasOne(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            hasOne(10),
            hasOne(22),
            hasOne(220),
        };


        TestCases_HasOne.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_HasOne.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_HasOne.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_HasOne.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
