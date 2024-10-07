package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p139564

/* Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad". */

class TestCases_StarOut
{
    // starOut("ab*cd") → "ad"
    // starOut("ab**cd") → "ad"
    // starOut("sm*eilly") → "silly"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "starOut(\"ab*cd\") → \"ad\"");
        testcaseMap.put(1, "starOut(\"ab**cd\") → \"ad\"");
        testcaseMap.put(2, "starOut(\"sm*eilly\") → \"silly\"");
    }

    static String[] expectedResults = { "ad", "ad", "silly", };
}

public class StarOut
{
    public static String starOut(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            starOut("ab*cd"),
            starOut("ab**cd"),
            starOut("sm*eilly"),
        };


        TestCases_StarOut.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StarOut.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StarOut.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StarOut.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
