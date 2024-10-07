package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p126880

/* Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string. */

class TestCases_EndOther
{
    // endOther("Hiabc", "abc") → true
    // endOther("AbC", "HiaBc") → true
    // endOther("abc", "abXabc") → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "endOther(\"Hiabc\", \"abc\") → true");
        testcaseMap.put(1, "endOther(\"AbC\", \"HiaBc\") → true");
        testcaseMap.put(2, "endOther(\"abc\", \"abXabc\") → true");
    }

    static boolean[] expectedResults = { true, true, true, };
}

public class EndOther
{
    public static boolean endOther(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            endOther("Hiabc", "abc"),
            endOther("AbC", "HiaBc"),
            endOther("abc", "abXabc"),
        };


        TestCases_EndOther.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_EndOther.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_EndOther.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_EndOther.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
