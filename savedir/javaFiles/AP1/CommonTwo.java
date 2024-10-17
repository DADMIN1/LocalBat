package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p100369

/* Start with two arrays of strings, a and b, each in alphabetical order, 
possibly with duplicates. 
Return the count of the number of strings which appear in both arrays. 
The best "linear" solution makes a single pass over both arrays, 
taking advantage of the fact that they are in alphabetical order. */

class TestCases_CommonTwo
{
    // commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
    // commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
    // commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "commonTwo([\"a\", \"c\", \"x\"], [\"b\", \"c\", \"d\", \"x\"])");
        testcaseMap.put(1, "commonTwo([\"a\", \"c\", \"x\"], [\"a\", \"b\", \"c\", \"x\", \"z\"])");
        testcaseMap.put(2, "commonTwo([\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"])");
    }

    static int[] expectedResults = { 2, 3, 3, };
}

public class CommonTwo
{
    public static int commonTwo(String[] a, String[] b)
    {
        
    }


    public static void main(String[] args)
    {
        String[] a0 = { "a", "c", "x" }; String[] b0 = { "b", "c", "d", "x" }; 
        String[] a1 = { "a", "c", "x" }; String[] b1 = { "a", "b", "c", "x", "z" }; 
        String[] a2 = { "a", "b", "c" }; String[] b2 = { "a", "b", "c" }; 

        int[] resultsArray = {
            commonTwo(a0, b0),
            commonTwo(a1, b1),
            commonTwo(a2, b2),
        };


        TestCases_CommonTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CommonTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CommonTwo.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CommonTwo.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
