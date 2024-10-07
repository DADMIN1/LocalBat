package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p137742

/* The number 6 is a truly great number.
Given two int values, a and b, return true if either one is 6.
Or if their sum or difference is 6.
Note: the function Math.abs(num) computes the absolute value of a number. */

class TestCases_Love6
{
    // love6(6, 4) → true
    // love6(4, 5) → false
    // love6(1, 5) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "love6(6, 4) → true");
        testcaseMap.put(1, "love6(4, 5) → false");
        testcaseMap.put(2, "love6(1, 5) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Love6
{
    public static boolean love6(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            love6(6, 4),
            love6(4, 5),
            love6(1, 5),
        };


        TestCases_Love6.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Love6.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Love6.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Love6.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
