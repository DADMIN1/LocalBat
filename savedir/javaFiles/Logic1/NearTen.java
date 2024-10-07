package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p193613

/* Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
See also: Introduction to Mod */

class TestCases_NearTen
{
    // nearTen(12) → true
    // nearTen(17) → false
    // nearTen(19) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "nearTen(12) → true");
        testcaseMap.put(1, "nearTen(17) → false");
        testcaseMap.put(2, "nearTen(19) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class NearTen
{
    public static boolean nearTen(int num)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            nearTen(12),
            nearTen(17),
            nearTen(19),
        };


        TestCases_NearTen.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NearTen.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_NearTen.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_NearTen.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
