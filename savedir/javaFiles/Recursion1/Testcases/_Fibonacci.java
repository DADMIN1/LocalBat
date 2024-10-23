package Recursion1.Testcases;
import Recursion1.Fibonacci;

public class _Fibonacci
{
    static String[] testcaseStrings = {
        "fibonacci(0)",
        "fibonacci(1)",
        "fibonacci(2)",
    };

    static int[] expectedResults = {
        0,
        1,
        1,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Fibonacci.fibonacci(0),
            Fibonacci.fibonacci(1),
            Fibonacci.fibonacci(2),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+expectedResults[i]);
                System.out.println("\n");
            } else if (printSuccess) { 
                System.out.println("[✔] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✔✔✔  ~ All tests passed. ~  ✔✔✔");
        System.out.println();
        return;
    }
}
