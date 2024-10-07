package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p110141

/* Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length.
Harder than it looks. */

class TestCases_DeFront
{
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "deFront(\"Hello\") → \"llo\"");
        testcaseMap.put(1, "deFront(\"java\") → \"va\"");
        testcaseMap.put(2, "deFront(\"away\") → \"aay\"");
    }

    static String[] expectedResults = { "llo", "va", "aay", };
}

public class DeFront
{
    public static String deFront(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            deFront("Hello"),
            deFront("java"),
            deFront("away"),
        };


        TestCases_DeFront.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_DeFront.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_DeFront.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_DeFront.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
