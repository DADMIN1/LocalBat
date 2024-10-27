package Warmup1.Testcases;
import Warmup1.In1020;

public final class _In1020
{
    static final String[] testcaseStrings = {
        "in1020(12, 99)",
        "in1020(21, 12)",
        "in1020(8, 99)",
        "in1020(99, 10)",
        "in1020(20, 20)",
        "in1020(21, 21)",
        "in1020(9, 9)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            In1020.in1020(12, 99),
            In1020.in1020(21, 12),
            In1020.in1020(8, 99),
            In1020.in1020(99, 10),
            In1020.in1020(20, 20),
            In1020.in1020(21, 21),
            In1020.in1020(9, 9),
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
