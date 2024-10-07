package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p199720

/* Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz". */

class TestCases_StartOz
{
    // startOz("ozymandias") → "oz"
    // startOz("bzoo") → "z"
    // startOz("oxx") → "o"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "startOz(\"ozymandias\") → \"oz\"");
        testcaseMap.put(1, "startOz(\"bzoo\") → \"z\"");
        testcaseMap.put(2, "startOz(\"oxx\") → \"o\"");
    }

    static String[] expectedResults = { "oz", "z", "o", };
}

public class StartOz
{
    public static String startOz(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            startOz("ozymandias"),
            startOz("bzoo"),
            startOz("oxx"),
        };


        TestCases_StartOz.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StartOz.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StartOz.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StartOz.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
