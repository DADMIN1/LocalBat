package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115863

/* Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
The string length will be at least 3. */

class TestCases_MiddleThree
{
    // middleThree("Candy") → "and"
    // middleThree("and") → "and"
    // middleThree("solving") → "lvi"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "middleThree(\"Candy\") → \"and\"");
        testcaseMap.put(1, "middleThree(\"and\") → \"and\"");
        testcaseMap.put(2, "middleThree(\"solving\") → \"lvi\"");
    }

    static String[] expectedResults = { "and", "and", "lvi", };
}

public class MiddleThree
{
    public static String middleThree(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            middleThree("Candy"),
            middleThree("and"),
            middleThree("solving"),
        };


        TestCases_MiddleThree.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MiddleThree.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MiddleThree.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MiddleThree.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
