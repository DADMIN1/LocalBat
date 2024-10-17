package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p171896

/* Given a string name, e.g. "Bob", 
return a greeting of the form "Hello Bob!". */

class TestCases_HelloName
{
    // helloName("Bob") → "Hello Bob!"
    // helloName("Alice") → "Hello Alice!"
    // helloName("X") → "Hello X!"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "helloName(\"Bob\")");
        testcaseMap.put(1, "helloName(\"Alice\")");
        testcaseMap.put(2, "helloName(\"X\")");
    }

    static String[] expectedResults = { "Hello Bob!", "Hello Alice!", "Hello X!", };
}

public class HelloName
{
    public static String helloName(String name)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            helloName("Bob"),
            helloName("Alice"),
            helloName("X"),
        };


        TestCases_HelloName.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_HelloName.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_HelloName.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_HelloName.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
