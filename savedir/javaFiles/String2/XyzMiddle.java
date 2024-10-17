package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p159772

/* Given a string, does "xyz" appear in the middle of the string? To define middle, 
we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
This problem is harder than it looks. */

class TestCases_XyzMiddle
{
    // xyzMiddle("AAxyzBB") → true
    // xyzMiddle("AxyzBB") → true
    // xyzMiddle("AxyzBBB") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "xyzMiddle(\"AAxyzBB\")");
        testcaseMap.put(1, "xyzMiddle(\"AxyzBB\")");
        testcaseMap.put(2, "xyzMiddle(\"AxyzBBB\")");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class XyzMiddle
{
    public static boolean xyzMiddle(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            xyzMiddle("AAxyzBB"),
            xyzMiddle("AxyzBB"),
            xyzMiddle("AxyzBBB"),
        };


        TestCases_XyzMiddle.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_XyzMiddle.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_XyzMiddle.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_XyzMiddle.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
