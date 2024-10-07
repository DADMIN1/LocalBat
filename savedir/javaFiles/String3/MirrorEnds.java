package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p139411

/* Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping).
For example, the string "abXYZba" has the mirror end "ab". */

class TestCases_MirrorEnds
{
    // mirrorEnds("abXYZba") → "ab"
    // mirrorEnds("abca") → "a"
    // mirrorEnds("aba") → "aba"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "mirrorEnds(\"abXYZba\") → \"ab\"");
        testcaseMap.put(1, "mirrorEnds(\"abca\") → \"a\"");
        testcaseMap.put(2, "mirrorEnds(\"aba\") → \"aba\"");
    }

    static String[] expectedResults = { "ab", "a", "aba", };
}

public class MirrorEnds
{
    public static String mirrorEnds(String string)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            mirrorEnds("abXYZba"),
            mirrorEnds("abca"),
            mirrorEnds("aba"),
        };


        TestCases_MirrorEnds.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MirrorEnds.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MirrorEnds.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MirrorEnds.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
