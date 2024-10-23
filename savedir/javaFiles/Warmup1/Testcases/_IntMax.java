package Warmup1.Testcases;
import Warmup1.IntMax;

public class _IntMax
{
    static String[] testcaseStrings = {
        "intMax(1, 2, 3)",
        "intMax(1, 3, 2)",
        "intMax(3, 2, 1)",
    };

    static int[] expectedResults = {
        3,
        3,
        3,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            IntMax.intMax(1, 2, 3),
            IntMax.intMax(1, 3, 2),
            IntMax.intMax(3, 2, 1),
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
