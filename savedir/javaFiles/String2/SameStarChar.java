package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p194491

/* Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same. */

class TestCases_SameStarChar
{
    // sameStarChar("xy*yzz") → true
    // sameStarChar("xy*zzz") → false
    // sameStarChar("*xa*az") → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sameStarChar(\"xy*yzz\") → true");
        testcaseMap.put(1, "sameStarChar(\"xy*zzz\") → false");
        testcaseMap.put(2, "sameStarChar(\"*xa*az\") → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class SameStarChar
{
    public static boolean sameStarChar(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            sameStarChar("xy*yzz"),
            sameStarChar("xy*zzz"),
            sameStarChar("*xa*az"),
        };


        TestCases_SameStarChar.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SameStarChar.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SameStarChar.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SameStarChar.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
