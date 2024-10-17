package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p137136

/* Given a string str, if the string starts with "f" return "Fizz". 
If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, 
return "FizzBuzz". In all other cases, return the string unchanged. 
(See also: FizzBuzz Code) */

class TestCases_FizzString
{
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fizzString(\"fig\")");
        testcaseMap.put(1, "fizzString(\"dib\")");
        testcaseMap.put(2, "fizzString(\"fib\")");
    }

    static String[] expectedResults = { "Fizz", "Buzz", "FizzBuzz", };
}

public class FizzString
{
    public static String fizzString(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            fizzString("fig"),
            fizzString("dib"),
            fizzString("fib"),
        };


        TestCases_FizzString.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FizzString.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FizzString.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_FizzString.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
