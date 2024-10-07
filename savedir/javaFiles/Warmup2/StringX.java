package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p171260

/* Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed. */

class TestCases_StringX
{
    // stringX("xxHxix") → "xHix"
    // stringX("abxxxcd") → "abcd"
    // stringX("xabxxxcdx") → "xabcdx"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringX(\"xxHxix\") → \"xHix\"");
        testcaseMap.put(1, "stringX(\"abxxxcd\") → \"abcd\"");
        testcaseMap.put(2, "stringX(\"xabxxxcdx\") → \"xabcdx\"");
    }

    static String[] expectedResults = { "xHix", "abcd", "xabcdx", };
}

public class StringX
{
    public static String stringX(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            stringX("xxHxix"),
            stringX("abxxxcd"),
            stringX("xabxxxcdx"),
        };


        TestCases_StringX.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringX.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StringX.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StringX.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
