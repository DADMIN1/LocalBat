package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136594

/* Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). 
So "xxyz" counts but "x.xyz" does not. */

class TestCases_XyzThere
{
    // xyzThere("abcxyz") → true
    // xyzThere("abc.xyz") → false
    // xyzThere("xyz.abc") → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "xyzThere(\"abcxyz\")");
        testcaseMap.put(1, "xyzThere(\"abc.xyz\")");
        testcaseMap.put(2, "xyzThere(\"xyz.abc\")");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class XyzThere
{
    public static boolean xyzThere(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            xyzThere("abcxyz"),
            xyzThere("abc.xyz"),
            xyzThere("xyz.abc"),
        };


        TestCases_XyzThere.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_XyzThere.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_XyzThere.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_XyzThere.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
