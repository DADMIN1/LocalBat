package Recursion1.Testcases;
import Recursion1.Factorial;

public class _Factorial
{
    static String[] testcaseStrings = {
        "factorial(1)",
        "factorial(2)",
        "factorial(3)",
        "factorial(4)",
        "factorial(5)",
        "factorial(6)",
        "factorial(7)",
        "factorial(8)",
        "factorial(12)",
    };

    static int[] expectedResults = {
        1,
        2,
        6,
        24,
        120,
        720,
        5040,
        40320,
        479001600,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Factorial.factorial(1),
            Factorial.factorial(2),
            Factorial.factorial(3),
            Factorial.factorial(4),
            Factorial.factorial(5),
            Factorial.factorial(6),
            Factorial.factorial(7),
            Factorial.factorial(8),
            Factorial.factorial(12),
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
