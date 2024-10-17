package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p195714

/* We'll say that a "triple" in a string is a char appearing three times in a row. 
Return the number of triples in the given string. The triples may overlap. */

class TestCases_CountTriple
{
    // countTriple("abcXXXabc") → 1
    // countTriple("xxxabyyyycd") → 3
    // countTriple("a") → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countTriple(\"abcXXXabc\")");
        testcaseMap.put(1, "countTriple(\"xxxabyyyycd\")");
        testcaseMap.put(2, "countTriple(\"a\")");
    }

    static int[] expectedResults = { 1, 3, 0, };
}

public class CountTriple
{
    public static int countTriple(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countTriple("abcXXXabc"),
            countTriple("xxxabyyyycd"),
            countTriple("a"),
        };


        TestCases_CountTriple.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountTriple.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CountTriple.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CountTriple.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
