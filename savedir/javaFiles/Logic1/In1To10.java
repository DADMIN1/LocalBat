package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p137365

/* Given a number n, return true if n is in the range 1..10, inclusive.
Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10. */

class TestCases_In1To10
{
    // in1To10(5, false) → true
    // in1To10(11, false) → false
    // in1To10(11, true) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "in1To10(5, false) → true");
        testcaseMap.put(1, "in1To10(11, false) → false");
        testcaseMap.put(2, "in1To10(11, true) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class In1To10
{
    public static boolean in1To10(int n, boolean outsideMode)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            in1To10(5, false),
            in1To10(11, false),
            in1To10(11, true),
        };


        TestCases_In1To10.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_In1To10.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_In1To10.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_In1To10.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
