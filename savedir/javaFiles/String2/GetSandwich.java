package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p129952

/* A sandwich is two pieces of bread with something in between. 
Return the string that is between the first and last appearance of "bread" in the given string, 
or return the empty string "" if there are not two pieces of bread. */

class TestCases_GetSandwich
{
    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "getSandwich(\"breadjambread\")");
        testcaseMap.put(1, "getSandwich(\"xxbreadjambreadyy\")");
        testcaseMap.put(2, "getSandwich(\"xxbreadyy\")");
    }

    static String[] expectedResults = { "jam", "jam", "", };
}

public class GetSandwich
{
    public static String getSandwich(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            getSandwich("breadjambread"),
            getSandwich("xxbreadjambreadyy"),
            getSandwich("xxbreadyy"),
        };


        TestCases_GetSandwich.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GetSandwich.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_GetSandwich.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_GetSandwich.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
