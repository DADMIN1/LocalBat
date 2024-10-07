package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p194781

/* We have triangle made of blocks.
The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows. */

class TestCases_Triangle
{
    // triangle(0) → 0
    // triangle(1) → 1
    // triangle(2) → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "triangle(0) → 0");
        testcaseMap.put(1, "triangle(1) → 1");
        testcaseMap.put(2, "triangle(2) → 3");
    }

    static int[] expectedResults = { 0, 1, 3, };
}

public class Triangle
{
    public static int triangle(int rows)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            triangle(0),
            triangle(1),
            triangle(2),
        };


        TestCases_Triangle.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Triangle.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Triangle.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Triangle.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
