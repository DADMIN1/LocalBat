package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115243

/* Given an int n, return the string form of the number followed by "!". 
So the int 6 yields "6!". 
Except if the number is divisible by 3 use "Fizz" instead of the number, 
and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, 
use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, 
so 23 % 10 yields 3. 
What will the remainder be when one number divides evenly into another? (See also: 
FizzBuzz Code and Introduction to Mod) */

class TestCases_FizzString2
{
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fizzString2(1)");
        testcaseMap.put(1, "fizzString2(2)");
        testcaseMap.put(2, "fizzString2(3)");
    }

    static String[] expectedResults = { "1!", "2!", "Fizz!", };
}

public class FizzString2
{
    public static String fizzString2(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            fizzString2(1),
            fizzString2(2),
            fizzString2(3),
        };


        TestCases_FizzString2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FizzString2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FizzString2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_FizzString2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
