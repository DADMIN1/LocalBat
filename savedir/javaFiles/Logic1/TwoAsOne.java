package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p113261

/* Given three ints, a b c, return true if it is possible to add two of the ints to get the third. */

class TestCases_TwoAsOne
{
    // twoAsOne(1, 2, 3) → true
    // twoAsOne(3, 1, 2) → true
    // twoAsOne(3, 2, 2) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "twoAsOne(1, 2, 3) → true");
        testcaseMap.put(1, "twoAsOne(3, 1, 2) → true");
        testcaseMap.put(2, "twoAsOne(3, 2, 2) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class TwoAsOne
{
    public static boolean twoAsOne(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            twoAsOne(1, 2, 3),
            twoAsOne(3, 1, 2),
            twoAsOne(3, 2, 2),
        };


        TestCases_TwoAsOne.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_TwoAsOne.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_TwoAsOne.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_TwoAsOne.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
