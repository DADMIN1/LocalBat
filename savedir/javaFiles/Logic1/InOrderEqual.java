package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p140272

/* Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5. */

class TestCases_InOrderEqual
{
    // inOrderEqual(2, 5, 11, false) → true
    // inOrderEqual(5, 7, 6, false) → false
    // inOrderEqual(5, 5, 7, true) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "inOrderEqual(2, 5, 11, false) → true");
        testcaseMap.put(1, "inOrderEqual(5, 7, 6, false) → false");
        testcaseMap.put(2, "inOrderEqual(5, 5, 7, true) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class InOrderEqual
{
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            inOrderEqual(2, 5, 11, false),
            inOrderEqual(5, 7, 6, false),
            inOrderEqual(5, 5, 7, true),
        };


        TestCases_InOrderEqual.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_InOrderEqual.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_InOrderEqual.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_InOrderEqual.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
