package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p100962

/* We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
Return true if the given non-negative number is special.
Use the % "mod" operator -- see Introduction to Mod */

class TestCases_SpecialEleven
{
    // specialEleven(22) → true
    // specialEleven(23) → true
    // specialEleven(24) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "specialEleven(22) → true");
        testcaseMap.put(1, "specialEleven(23) → true");
        testcaseMap.put(2, "specialEleven(24) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class SpecialEleven
{
    public static boolean specialEleven(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            specialEleven(22),
            specialEleven(23),
            specialEleven(24),
        };


        TestCases_SpecialEleven.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SpecialEleven.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SpecialEleven.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SpecialEleven.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
