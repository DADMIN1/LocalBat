package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p154669

/* Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ...
1.
Compute the result recursively (without loops). */

class TestCases_Factorial
{
    // factorial(1) → 1
    // factorial(2) → 2
    // factorial(3) → 6

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "factorial(1) → 1");
        testcaseMap.put(1, "factorial(2) → 2");
        testcaseMap.put(2, "factorial(3) → 6");
    }

    static int[] expectedResults = { 1, 2, 6, };
}

public class Factorial
{
    public static int factorial(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            factorial(1),
            factorial(2),
            factorial(3),
        };


        TestCases_Factorial.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Factorial.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Factorial.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Factorial.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
