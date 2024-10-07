package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p130896

/* Given a string, return a version without the first and last char, so "Hello" yields "ell".
The string length will be at least 2. */

class TestCases_WithoutEnd
{
    // withoutEnd("Hello") → "ell"
    // withoutEnd("java") → "av"
    // withoutEnd("coding") → "odin"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "withoutEnd(\"Hello\") → \"ell\"");
        testcaseMap.put(1, "withoutEnd(\"java\") → \"av\"");
        testcaseMap.put(2, "withoutEnd(\"coding\") → \"odin\"");
    }

    static String[] expectedResults = { "ell", "av", "odin", };
}

public class WithoutEnd
{
    public static String withoutEnd(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            withoutEnd("Hello"),
            withoutEnd("java"),
            withoutEnd("coding"),
        };


        TestCases_WithoutEnd.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WithoutEnd.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_WithoutEnd.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_WithoutEnd.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
