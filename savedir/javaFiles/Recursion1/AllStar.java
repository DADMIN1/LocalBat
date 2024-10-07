package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183394

/* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*". */

class TestCases_AllStar
{
    // allStar("hello") → "h*e*l*l*o"
    // allStar("abc") → "a*b*c"
    // allStar("ab") → "a*b"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "allStar(\"hello\") → \"h*e*l*l*o\"");
        testcaseMap.put(1, "allStar(\"abc\") → \"a*b*c\"");
        testcaseMap.put(2, "allStar(\"ab\") → \"a*b\"");
    }

    static String[] expectedResults = { "h*e*l*l*o", "a*b*c", "a*b", };
}

public class AllStar
{
    public static String allStar(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            allStar("hello"),
            allStar("abc"),
            allStar("ab"),
        };


        TestCases_AllStar.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_AllStar.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_AllStar.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_AllStar.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
