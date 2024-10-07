package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p175762

/* Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char. */

class TestCases_BobThere
{
    // bobThere("abcbob") → true
    // bobThere("b9b") → true
    // bobThere("bac") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "bobThere(\"abcbob\") → true");
        testcaseMap.put(1, "bobThere(\"b9b\") → true");
        testcaseMap.put(2, "bobThere(\"bac\") → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class BobThere
{
    public static boolean bobThere(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            bobThere("abcbob"),
            bobThere("b9b"),
            bobThere("bac"),
        };


        TestCases_BobThere.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_BobThere.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_BobThere.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_BobThere.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
