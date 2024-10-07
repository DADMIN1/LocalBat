package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p192570

/* Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x". */

class TestCases_WithoutString
{
    // withoutString("Hello there", "llo") → "He there"
    // withoutString("Hello there", "e") → "Hllo thr"
    // withoutString("Hello there", "x") → "Hello there"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "withoutString(\"Hello there\", \"llo\") → \"He there\"");
        testcaseMap.put(1, "withoutString(\"Hello there\", \"e\") → \"Hllo thr\"");
        testcaseMap.put(2, "withoutString(\"Hello there\", \"x\") → \"Hello there\"");
    }

    static String[] expectedResults = { "He there", "Hllo thr", "Hello there", };
}

public class WithoutString
{
    public static String withoutString(String base, String remove)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            withoutString("Hello there", "llo"),
            withoutString("Hello there", "e"),
            withoutString("Hello there", "x"),
        };


        TestCases_WithoutString.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WithoutString.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_WithoutString.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_WithoutString.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
