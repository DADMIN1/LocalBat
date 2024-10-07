package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p198664

/* We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy. */

class TestCases_GHappy
{
    // gHappy("xxggxx") → true
    // gHappy("xxgxx") → false
    // gHappy("xxggyygxx") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "gHappy(\"xxggxx\") → true");
        testcaseMap.put(1, "gHappy(\"xxgxx\") → false");
        testcaseMap.put(2, "gHappy(\"xxggyygxx\") → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class GHappy
{
    public static boolean gHappy(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            gHappy("xxggxx"),
            gHappy("xxgxx"),
            gHappy("xxggyygxx"),
        };


        TestCases_GHappy.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GHappy.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_GHappy.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_GHappy.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
