package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p165941

/* We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
Note: use % to get the rightmost digit, and / to discard the rightmost digit. */

class TestCases_DividesSelf
{
    // dividesSelf(128) → true
    // dividesSelf(12) → true
    // dividesSelf(120) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "dividesSelf(128) → true");
        testcaseMap.put(1, "dividesSelf(12) → true");
        testcaseMap.put(2, "dividesSelf(120) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class DividesSelf
{
    public static boolean dividesSelf(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            dividesSelf(128),
            dividesSelf(12),
            dividesSelf(120),
        };


        TestCases_DividesSelf.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_DividesSelf.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_DividesSelf.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_DividesSelf.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
