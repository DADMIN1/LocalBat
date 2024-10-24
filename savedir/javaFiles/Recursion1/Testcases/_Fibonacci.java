package Recursion1.Testcases;
import Recursion1.Fibonacci;

public class _Fibonacci
{
    static String[] testcaseStrings = {
        "fibonacci(0)",
        "fibonacci(1)",
        "fibonacci(2)",
        "fibonacci(3)",
        "fibonacci(4)",
        "fibonacci(5)",
        "fibonacci(6)",
        "fibonacci(7)",
    };

    static int[] expectedResults = {
        0,
        1,
        1,
        2,
        3,
        5,
        8,
        13,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Fibonacci.fibonacci(0),
            Fibonacci.fibonacci(1),
            Fibonacci.fibonacci(2),
            Fibonacci.fibonacci(3),
            Fibonacci.fibonacci(4),
            Fibonacci.fibonacci(5),
            Fibonacci.fibonacci(6),
            Fibonacci.fibonacci(7),
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
