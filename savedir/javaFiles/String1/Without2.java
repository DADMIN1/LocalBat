package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p142247

/* Given a string, if a length 2 substring appears at both its beginning and end, 
return a string without the substring at the beginning, 
so "HelloHe" yields "lloHe". The substring may overlap with itself, 
so "Hi" yields "". Otherwise, return the original string unchanged. */

class TestCases_Without2
{
    // without2("HelloHe") → "lloHe"
    // without2("HelloHi") → "HelloHi"
    // without2("Hi") → ""

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "without2(\"HelloHe\")");
        testcaseMap.put(1, "without2(\"HelloHi\")");
        testcaseMap.put(2, "without2(\"Hi\")");
    }

    static String[] expectedResults = { "lloHe", "HelloHi", "", };
}

public class Without2
{
    public static String without2(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            without2("HelloHe"),
            without2("HelloHi"),
            without2("Hi"),
        };


        TestCases_Without2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Without2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Without2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Without2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
