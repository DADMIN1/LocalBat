package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p118182

/* Given a string and a non-empty substring sub, 
compute recursively if at least n copies of sub appear in the string somewhere, 
possibly with overlapping. N will be non-negative. */

class TestCases_StrCopies
{
    // strCopies("catcowcat", "cat", 2) → true
    // strCopies("catcowcat", "cow", 2) → false
    // strCopies("catcowcat", "cow", 1) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "strCopies(\"catcowcat\", \"cat\", 2)");
        testcaseMap.put(1, "strCopies(\"catcowcat\", \"cow\", 2)");
        testcaseMap.put(2, "strCopies(\"catcowcat\", \"cow\", 1)");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class StrCopies
{
    public static boolean strCopies(String str, String sub, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            strCopies("catcowcat", "cat", 2),
            strCopies("catcowcat", "cow", 2),
            strCopies("catcowcat", "cow", 1),
        };


        TestCases_StrCopies.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StrCopies.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_StrCopies.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_StrCopies.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
