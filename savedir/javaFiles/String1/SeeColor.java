package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p199216

/* Given a string, if the string begins with "red" or "blue" return that color string, 
otherwise return the empty string. */

class TestCases_SeeColor
{
    // seeColor("redxx") → "red"
    // seeColor("xxred") → ""
    // seeColor("blueTimes") → "blue"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "seeColor(\"redxx\")");
        testcaseMap.put(1, "seeColor(\"xxred\")");
        testcaseMap.put(2, "seeColor(\"blueTimes\")");
    }

    static String[] expectedResults = { "red", "", "blue", };
}

public class SeeColor
{
    public static String seeColor(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            seeColor("redxx"),
            seeColor("xxred"),
            seeColor("blueTimes"),
        };


        TestCases_SeeColor.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SeeColor.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SeeColor.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_SeeColor.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
