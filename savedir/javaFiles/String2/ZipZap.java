package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p180759

/* Look for patterns like "zip" and "zap" in the string -- length-3, 
starting with 'z' and ending with 'p'. Return a string where for all such words, 
the middle letter is gone, so "zipXzap" yields "zpXzp". */

class TestCases_ZipZap
{
    // zipZap("zipXzap") → "zpXzp"
    // zipZap("zopzop") → "zpzp"
    // zipZap("zzzopzop") → "zzzpzp"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "zipZap(\"zipXzap\")");
        testcaseMap.put(1, "zipZap(\"zopzop\")");
        testcaseMap.put(2, "zipZap(\"zzzopzop\")");
    }

    static String[] expectedResults = { "zpXzp", "zpzp", "zzzpzp", };
}

public class ZipZap
{
    public static String zipZap(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            zipZap("zipXzap"),
            zipZap("zopzop"),
            zipZap("zzzopzop"),
        };


        TestCases_ZipZap.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ZipZap.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ZipZap.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ZipZap.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
