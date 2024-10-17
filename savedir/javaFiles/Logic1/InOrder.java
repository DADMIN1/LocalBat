package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p154188

/* Given three ints, a b c, return true if b is greater than a, 
and c is greater than b. However, with the exception that if "bOk" is true, 
b does not need to be greater than a. */

class TestCases_InOrder
{
    // inOrder(1, 2, 4, false) → true
    // inOrder(1, 2, 1, false) → false
    // inOrder(1, 1, 2, true) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "inOrder(1, 2, 4, false)");
        testcaseMap.put(1, "inOrder(1, 2, 1, false)");
        testcaseMap.put(2, "inOrder(1, 1, 2, true)");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class InOrder
{
    public static boolean inOrder(int a, int b, int c, boolean bOk)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            inOrder(1, 2, 4, false),
            inOrder(1, 2, 1, false),
            inOrder(1, 1, 2, true),
        };


        TestCases_InOrder.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_InOrder.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_InOrder.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_InOrder.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
