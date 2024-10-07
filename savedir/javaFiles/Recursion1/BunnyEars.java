package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183649

/* We have a number of bunnies and each bunny has two big floppy ears.
We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication). */

class TestCases_BunnyEars
{
    // bunnyEars(0) → 0
    // bunnyEars(1) → 2
    // bunnyEars(2) → 4

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "bunnyEars(0) → 0");
        testcaseMap.put(1, "bunnyEars(1) → 2");
        testcaseMap.put(2, "bunnyEars(2) → 4");
    }

    static int[] expectedResults = { 0, 2, 4, };
}

public class BunnyEars
{
    public static int bunnyEars(int bunnies)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            bunnyEars(0),
            bunnyEars(1),
            bunnyEars(2),
        };


        TestCases_BunnyEars.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_BunnyEars.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_BunnyEars.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_BunnyEars.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
