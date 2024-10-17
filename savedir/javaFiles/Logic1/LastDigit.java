package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p169213

/* Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
The ints are non-negative. Note: 
the % "mod" operator computes the remainder, e.g. 17 % 10 is 7. */

class TestCases_LastDigit
{
    // lastDigit(23, 19, 13) → true
    // lastDigit(23, 19, 12) → false
    // lastDigit(23, 19, 3) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "lastDigit(23, 19, 13)");
        testcaseMap.put(1, "lastDigit(23, 19, 12)");
        testcaseMap.put(2, "lastDigit(23, 19, 3)");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class LastDigit
{
    public static boolean lastDigit(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            lastDigit(23, 19, 13),
            lastDigit(23, 19, 12),
            lastDigit(23, 19, 3),
        };


        TestCases_LastDigit.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LastDigit.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LastDigit.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LastDigit.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
