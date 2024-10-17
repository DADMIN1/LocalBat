package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p107330

/* We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 
3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, 
because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 
2, ... n (without loops or multiplication). */

class TestCases_BunnyEars2
{
    // bunnyEars2(0) → 0
    // bunnyEars2(1) → 2
    // bunnyEars2(2) → 5

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "bunnyEars2(0)");
        testcaseMap.put(1, "bunnyEars2(1)");
        testcaseMap.put(2, "bunnyEars2(2)");
    }

    static int[] expectedResults = { 0, 2, 5, };
}

public class BunnyEars2
{
    public static int bunnyEars2(int bunnies)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            bunnyEars2(0),
            bunnyEars2(1),
            bunnyEars2(2),
        };


        TestCases_BunnyEars2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_BunnyEars2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_BunnyEars2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_BunnyEars2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
