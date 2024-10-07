package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p134250

/* We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's.
Return true if the given string is xy-balanced. */

class TestCases_XyBalance
{
    // xyBalance("aaxbby") → true
    // xyBalance("aaxbb") → false
    // xyBalance("yaaxbb") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "xyBalance(\"aaxbby\") → true");
        testcaseMap.put(1, "xyBalance(\"aaxbb\") → false");
        testcaseMap.put(2, "xyBalance(\"yaaxbb\") → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class XyBalance
{
    public static boolean xyBalance(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            xyBalance("aaxbby"),
            xyBalance("aaxbb"),
            xyBalance("yaaxbb"),
        };


        TestCases_XyBalance.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_XyBalance.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_XyBalance.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_XyBalance.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
