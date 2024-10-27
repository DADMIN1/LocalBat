package Warmup1.Testcases;
import Warmup1.SumDouble;

public final class _SumDouble
{
    static final String[] testcaseStrings = {
        "sumDouble(1, 2)",
        "sumDouble(3, 2)",
        "sumDouble(2, 2)",
        "sumDouble(-1, 0)",
        "sumDouble(3, 3)",
        "sumDouble(0, 0)",
        "sumDouble(0, 1)",
        "sumDouble(3, 4)",
    };

    static final int[] expectedResults = {
        3,
        5,
        8,
        -1,
        12,
        0,
        1,
        7,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            SumDouble.sumDouble(1, 2),
            SumDouble.sumDouble(3, 2),
            SumDouble.sumDouble(2, 2),
            SumDouble.sumDouble(-1, 0),
            SumDouble.sumDouble(3, 3),
            SumDouble.sumDouble(0, 0),
            SumDouble.sumDouble(0, 1),
            SumDouble.sumDouble(3, 4),
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
