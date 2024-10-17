package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p196441

/* Given a non-empty string and an int N, return the string made starting with char 0, 
and then every Nth char of the string. So if N is 3, use char 0, 
3, 6, ... and so on. N is 1 or more. */

class TestCases_EveryNth
{
    // everyNth("Miracle", 2) → "Mrce"
    // everyNth("abcdefg", 2) → "aceg"
    // everyNth("abcdefg", 3) → "adg"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "everyNth(\"Miracle\", 2)");
        testcaseMap.put(1, "everyNth(\"abcdefg\", 2)");
        testcaseMap.put(2, "everyNth(\"abcdefg\", 3)");
    }

    static String[] expectedResults = { "Mrce", "aceg", "adg", };
}

public class EveryNth
{
    public static String everyNth(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            everyNth("Miracle", 2),
            everyNth("abcdefg", 2),
            everyNth("abcdefg", 3),
        };


        TestCases_EveryNth.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_EveryNth.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_EveryNth.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_EveryNth.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
