package Warmup1.Testcases;
import Warmup1.Makes10;

public final class _Makes10
{
    static final String[] testcaseStrings = {
        "makes10(9, 10)",
        "makes10(9, 9)",
        "makes10(1, 9)",
        "makes10(10, 1)",
        "makes10(10, 10)",
        "makes10(8, 2)",
        "makes10(8, 3)",
        "makes10(10, 42)",
        "makes10(12, -2)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            Makes10.makes10(9, 10),
            Makes10.makes10(9, 9),
            Makes10.makes10(1, 9),
            Makes10.makes10(10, 1),
            Makes10.makes10(10, 10),
            Makes10.makes10(8, 2),
            Makes10.makes10(8, 3),
            Makes10.makes10(10, 42),
            Makes10.makes10(12, -2),
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
