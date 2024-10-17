package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p111624

/* Return true if the string "cat" and "dog" appear the same number of times in the given string. */

class TestCases_CatDog
{
    // catDog("catdog") → true
    // catDog("catcat") → false
    // catDog("1cat1cadodog") → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "catDog(\"catdog\")");
        testcaseMap.put(1, "catDog(\"catcat\")");
        testcaseMap.put(2, "catDog(\"1cat1cadodog\")");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class CatDog
{
    public static boolean catDog(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            catDog("catdog"),
            catDog("catcat"),
            catDog("1cat1cadodog"),
        };


        TestCases_CatDog.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CatDog.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CatDog.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CatDog.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
