package Warmup1.Testcases;
import Warmup1.Diff21;

public final class _Diff21
{
    static final String[] testcaseStrings = {
        "diff21(19)",
        "diff21(10)",
        "diff21(21)",
        "diff21(22)",
        "diff21(25)",
        "diff21(30)",
        "diff21(0)",
        "diff21(1)",
        "diff21(2)",
        "diff21(-1)",
        "diff21(-2)",
        "diff21(50)",
    };

    static final int[] expectedResults = {
        2,
        11,
        0,
        2,
        8,
        18,
        21,
        20,
        19,
        22,
        23,
        58,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            Diff21.diff21(19),
            Diff21.diff21(10),
            Diff21.diff21(21),
            Diff21.diff21(22),
            Diff21.diff21(25),
            Diff21.diff21(30),
            Diff21.diff21(0),
            Diff21.diff21(1),
            Diff21.diff21(2),
            Diff21.diff21(-1),
            Diff21.diff21(-2),
            Diff21.diff21(50),
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
