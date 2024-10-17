package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p120015

/* The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. 
The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
Each subsequent value is the sum of the previous two values, 
so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
with n=0 representing the start of the sequence. */

class TestCases_Fibonacci
{
    // fibonacci(0) → 0
    // fibonacci(1) → 1
    // fibonacci(2) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fibonacci(0)");
        testcaseMap.put(1, "fibonacci(1)");
        testcaseMap.put(2, "fibonacci(2)");
    }

    static int[] expectedResults = { 0, 1, 1, };
}

public class Fibonacci
{
    public static int fibonacci(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            fibonacci(0),
            fibonacci(1),
            fibonacci(2),
        };


        TestCases_Fibonacci.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Fibonacci.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Fibonacci.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Fibonacci.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
