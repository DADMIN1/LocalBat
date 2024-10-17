package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p179196

/* Given three ints, a b c, return true if one of them is 10 or more less than one of the others. */

class TestCases_LessBy10
{
    // lessBy10(1, 7, 11) → true
    // lessBy10(1, 7, 10) → false
    // lessBy10(11, 1, 7) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "lessBy10(1, 7, 11)");
        testcaseMap.put(1, "lessBy10(1, 7, 10)");
        testcaseMap.put(2, "lessBy10(11, 1, 7)");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class LessBy10
{
    public static boolean lessBy10(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            lessBy10(1, 7, 11),
            lessBy10(1, 7, 10),
            lessBy10(11, 1, 7),
        };


        TestCases_LessBy10.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LessBy10.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LessBy10.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LessBy10.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
