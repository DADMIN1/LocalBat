package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p194786

/* Given a string of any length, return a new string where the last 2 chars, 
if present, are swapped, so "coding" yields "codign". */

class TestCases_LastTwo
{
    // lastTwo("coding") → "codign"
    // lastTwo("cat") → "cta"
    // lastTwo("ab") → "ba"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "lastTwo(\"coding\")");
        testcaseMap.put(1, "lastTwo(\"cat\")");
        testcaseMap.put(2, "lastTwo(\"ab\")");
    }

    static String[] expectedResults = { "codign", "cta", "ba", };
}

public class LastTwo
{
    public static String lastTwo(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            lastTwo("coding"),
            lastTwo("cat"),
            lastTwo("ab"),
        };


        TestCases_LastTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LastTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LastTwo.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LastTwo.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
