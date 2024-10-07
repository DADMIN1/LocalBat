package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p141736

/* Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive). */

class TestCases_EqualIsNot
{
    // equalIsNot("This is not") → false
    // equalIsNot("This is notnot") → true
    // equalIsNot("noisxxnotyynotxisi") → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "equalIsNot(\"This is not\") → false");
        testcaseMap.put(1, "equalIsNot(\"This is notnot\") → true");
        testcaseMap.put(2, "equalIsNot(\"noisxxnotyynotxisi\") → true");
    }

    static boolean[] expectedResults = { false, true, true, };
}

public class EqualIsNot
{
    public static boolean equalIsNot(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            equalIsNot("This is not"),
            equalIsNot("This is notnot"),
            equalIsNot("noisxxnotyynotxisi"),
        };


        TestCases_EqualIsNot.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_EqualIsNot.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_EqualIsNot.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_EqualIsNot.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
