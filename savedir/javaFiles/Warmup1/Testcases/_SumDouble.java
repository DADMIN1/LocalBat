package Warmup1.Testcases;
import Warmup1.SumDouble;

public class _SumDouble
{
    static String[] testcaseStrings = {
        "sumDouble(1, 2)",
        "sumDouble(3, 2)",
        "sumDouble(2, 2)",
    };

    static int[] expectedResults = {
        3,
        5,
        8,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SumDouble.sumDouble(1, 2),
            SumDouble.sumDouble(3, 2),
            SumDouble.sumDouble(2, 2),
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
