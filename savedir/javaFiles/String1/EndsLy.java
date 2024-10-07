package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p103895

/* Given a string, return true if it ends in "ly". */

class TestCases_EndsLy
{
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "endsLy(\"oddly\") → true");
        testcaseMap.put(1, "endsLy(\"y\") → false");
        testcaseMap.put(2, "endsLy(\"oddy\") → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class EndsLy
{
    public static boolean endsLy(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            endsLy("oddly"),
            endsLy("y"),
            endsLy("oddy"),
        };


        TestCases_EndsLy.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_EndsLy.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_EndsLy.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_EndsLy.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
