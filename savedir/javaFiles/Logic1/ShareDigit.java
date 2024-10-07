package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p153748

/* Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
(Note: division, e.g.
n/10, gives the left digit while the % "mod" n%10 gives the right digit.) */

class TestCases_ShareDigit
{
    // shareDigit(12, 23) → true
    // shareDigit(12, 43) → false
    // shareDigit(12, 44) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "shareDigit(12, 23) → true");
        testcaseMap.put(1, "shareDigit(12, 43) → false");
        testcaseMap.put(2, "shareDigit(12, 44) → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class ShareDigit
{
    public static boolean shareDigit(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            shareDigit(12, 23),
            shareDigit(12, 43),
            shareDigit(12, 44),
        };


        TestCases_ShareDigit.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ShareDigit.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ShareDigit.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ShareDigit.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
